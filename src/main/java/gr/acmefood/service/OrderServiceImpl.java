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

    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, rollbackFor = Exception.class)
    public Order checkout(Order order) {
        if (!validate(order)) {
            logger.warn("Order should have Account, order items, payment type and cost defined before being able to " +
                    "checkout the order.");
            return null;
        }

        // Set all order fields with proper values
        order.setCost(calculateTotalCost(order));
        order.setSubmitDate(new Date());
        logger.info("Total Order cost is : {} € ", order.getCost());
        logger.info("{}", order);
        logger.info("{}", order.getAccount());
        return create(order);
    }

    private boolean validate(Order order) {
        return order != null && !order.getOrderItems().isEmpty() && order.getAccount() != null;
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

//    private boolean checkNullability(Order order, Product product) {
//        if (order == null) {
//            logger.warn("Order is null.");
//            return true;
//        }
//        if (product == null) {
//            logger.warn("Product is null.");
//            return true;
//        }
//        return false;
//    }


}


