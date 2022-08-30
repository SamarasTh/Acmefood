package gr.acmefood.repository;

import gr.acmefood.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {


    @Query("select distinct o from Order o join fetch o.account join fetch o.orderItems oi join fetch oi.product where o.id = :id")
    Optional<Order> getLazy(Long id);
}
