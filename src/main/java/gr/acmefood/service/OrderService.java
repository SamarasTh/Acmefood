package gr.acmefood.service;

import gr.acmefood.domain.*;

import java.math.BigDecimal;

public interface OrderService extends BaseService<Order> {


    Order checkout(Order order);


    BigDecimal calculateTotalCost(Order order);
}
