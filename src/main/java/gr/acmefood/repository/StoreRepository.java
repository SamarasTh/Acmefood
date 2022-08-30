package gr.acmefood.repository;

import gr.acmefood.domain.Store;
import gr.acmefood.domain.StoreCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreRepository extends JpaRepository<Store,Long> {

    Store findStoreByStoreCategory(StoreCategory storeCategory);

    Store findStoreByName(String name);
}
