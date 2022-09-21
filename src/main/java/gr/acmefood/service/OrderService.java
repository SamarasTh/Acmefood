package gr.acmefood.service;

import gr.acmefood.domain.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface OrderService extends BaseService<Order> {

    Order startOrder(Account account);

    List<OrderItem> addItem(Order order, Product product, int quantity);

    void updateItem(Order order, Product product, int quantity);

    void removeItem(Order order, Product product);

    Order checkout(Order order, PaymentMethod paymentMethod);

    List<Order> findBySubmitDate(Date submitDate);
    BigDecimal calculateTotalCost(Order order);
}
