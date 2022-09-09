package gr.acmefood.service;

import gr.acmefood.domain.*;
import gr.acmefood.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.*;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl extends BaseServiceImpl<Order> implements OrderService {

    private final OrderRepository orderRepository;

    @Override
    public JpaRepository<Order, Long> getRepository() {
        return orderRepository;
    }

    @Override
    public Order startOrder(Account account) {
        return Order.builder().account(account).orderItems(new ArrayList<>()).build();
    }

    @Override
    public void addItem(Order order, Product product, int quantity) {
        if (checkNullability(order, product)) {
            return;

        }
        boolean increasedQuantity = false;

        // If product is already contained in the order, don't add it again, just increase the quantity accordingly
        for (OrderItem oi : order.getOrderItems()) {
            if (oi.getProduct().getSerial().equals(product.getSerial())) {
                oi.setQuantity(oi.getQuantity() + quantity);
                increasedQuantity = true;
                break;
            }
        }

        if (!increasedQuantity) {
            order.getOrderItems().add(newOrderItem(order, product, quantity));
        }

        logger.debug("Product[{}] added to Order[{}]", product, order);

    }

    private OrderItem newOrderItem(Order order, Product product, int quantity) {
        return OrderItem.builder().product(product).order(order).quantity(quantity).cost(product.getPrice()).build();
    }

    @Override
    public void updateItem(Order order, Product product, int quantity) {
        if (checkNullability(order, product)) {
            return;
        }
        order.getOrderItems().removeIf(oi -> oi.getProduct().getSerial().equals(product.getSerial()));
        order.getOrderItems().add(newOrderItem(order, product, quantity));

        logger.debug("Product[{}] updated in Order[{}]", product, order);
    }

    @Override
    public void removeItem(Order order, Product product) {
        if (checkNullability(order, product)) {
            return;
        }

        order.getOrderItems().removeIf(oi -> oi.getProduct().getSerial().equals(product.getSerial()));
        logger.debug("Product[{}] removed from Order[{}]", product, order);
    }

    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, rollbackFor = Exception.class)
    public Order checkout(Order order, PaymentMethod paymentMethod) {
        if (!validate(order)) {
            logger.warn("Order should have Account, order items, payment type and cost defined before being able to " +
                    "checkout the order.");
            return null;
        }

        // Set all order fields with proper values
        order.setPaymentMethod(paymentMethod);
        order.setCost(calculateTotalCost(order));
        order.setSubmitDate(new Date());
        logger.info("Total Order cost is : {} € ", order.getCost());
        return create(order);
    }

    private boolean validate(Order order) {
        return order != null && !order.getOrderItems().isEmpty() && order.getAccount() != null;
    }

    @Override
    public List<Order> findBySubmitDate(final Date submitDate) {
        return null;
    }

    @Override
    public List<Order> retrieveAllPlacedOrders(String email) {return orderRepository.retrieveAllPlacedOrders(email);
    }

    @Override
    public BigDecimal calculateTotalCost(Order order) {
        // Calculate total order cost based on orderItem price
        //@formatter:off
        BigDecimal finalCost = order.getOrderItems().stream()
                .map(oi -> oi.getCost().multiply(BigDecimal.valueOf(oi.getQuantity())))
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        return finalCost;
    }

    private boolean checkNullability(Order order, Product product) {
        if (order == null) {
            logger.warn("Order is null.");
            return true;
        }
        if (product == null) {
            logger.warn("Product is null.");
            return true;
        }
        return false;
    }


}


