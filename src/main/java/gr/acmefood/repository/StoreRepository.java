package gr.acmefood.repository;

import gr.acmefood.domain.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StoreRepository extends JpaRepository<Store, Long> {


    List<Store> findByStoreCategory_Id(Long id);

    List<Store> findByNameContainingIgnoreCase(String name);

}
