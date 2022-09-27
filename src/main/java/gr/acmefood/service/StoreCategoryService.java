package gr.acmefood.service;

import gr.acmefood.domain.Store;
import gr.acmefood.domain.StoreCategory;


public interface StoreCategoryService extends BaseService<StoreCategory> {

    StoreCategory findById(Long id);
}
