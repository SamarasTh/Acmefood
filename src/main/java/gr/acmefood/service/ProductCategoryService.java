package gr.acmefood.service;

import gr.acmefood.domain.ProductCategory;

public interface ProductCategoryService extends BaseService<ProductCategory> {

    ProductCategory findByName(String name);
}
