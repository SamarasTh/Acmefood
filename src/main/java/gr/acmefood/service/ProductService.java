package gr.acmefood.service;

import gr.acmefood.domain.Product;

public interface ProductService extends BaseService<Product> {

    Product findBySerial(String serial);
}
