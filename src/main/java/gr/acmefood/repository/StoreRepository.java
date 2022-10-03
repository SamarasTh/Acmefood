package gr.acmefood.repository;

import gr.acmefood.domain.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StoreRepository extends JpaRepository<Store, Long> {


    List<Store> findByStoreCategory_Id(Long id);

    List<Store> findByNameContainingIgnoreCase(String name);

    @Query(value = "SELECT  S.* FROM  ORDERS O\n" +
            "LEFT JOIN STORES S\n" +
            "ON S.ID = O.STOREID\n" +
            "GROUP BY o.storeid, S.\"NAME\"\n" +
            "ORDER BY NUMBER_OF_ORDERS DESC  ", nativeQuery = true)
    List<Store> findMostFamousStores();
}
