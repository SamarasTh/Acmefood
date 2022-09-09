package gr.acmefood.repository;

import gr.acmefood.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
   // @Query(value = "SELECT Order .orderItems from Order where Store .id = ")
    @Query(value = "SELECT Order.account, Account.email, Order.submitDate FROM Order INNER JOIN Account ON Order" + ".accountUsername= Account.username", nativeQuery = true)
    List<Order> retrieveAllPlacedOrders(String email);
}
