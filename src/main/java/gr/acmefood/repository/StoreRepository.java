package gr.acmefood.repository;

import gr.acmefood.domain.Store;
import gr.acmefood.domain.StoreCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StoreRepository extends JpaRepository<Store, Long> {


    List<Store> findByStoreCategory(StoreCategory storeCategory);

    Store findByName(String name);

}
