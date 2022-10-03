package gr.acmefood.service;

import gr.acmefood.domain.Store;

import java.util.List;

public interface StoreService extends BaseService<Store> {
    List<Store> findByStoreCategoryId(Long storeCategoryId);

    List<Store> findByNameLike(String name);

    Store findById(Long id);

    List<Store> getMostFamousStoreS();
}
