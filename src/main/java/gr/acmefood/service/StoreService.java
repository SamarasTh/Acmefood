package gr.acmefood.service;

import gr.acmefood.domain.Store;
import gr.acmefood.domain.StoreCategory;

import java.util.List;

public interface StoreService extends BaseService<Store> {
    List<Store> findByStoreCategory(StoreCategory storeCategory);

    Store findByName(String name);
}
