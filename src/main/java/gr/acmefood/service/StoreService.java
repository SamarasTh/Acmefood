package gr.acmefood.service;

import gr.acmefood.domain.Store;
import gr.acmefood.domain.StoreCategory;

public interface StoreService extends BaseService<Store>{
    Store findStoreByStoreCategory(StoreCategory storeCategory);

    Store findStoreByName(String name);
}
