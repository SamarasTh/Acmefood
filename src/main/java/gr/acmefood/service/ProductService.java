package gr.acmefood.service;

import gr.acmefood.domain.Product;

import java.util.List;

public interface ProductService extends BaseService<Product> {
    List<Product> findByStoreId(Long id);

    Product findBySerial(String serial);
}
