package gr.acmefood.repository;

import gr.acmefood.domain.Product;
import gr.acmefood.domain.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    Product findBySerial(String serial);

    List<Product> findByStore_Id(Long id);
}
