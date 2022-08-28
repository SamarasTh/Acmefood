package gr.acmefood.repository;

import gr.acmefood.domain.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreRepository extends JpaRepository<Store,Long> {

    Store findByStoreCategory(String storeCategory);
}
