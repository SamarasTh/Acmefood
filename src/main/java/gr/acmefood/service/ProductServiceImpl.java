package gr.acmefood.service;

import gr.acmefood.domain.Product;
import gr.acmefood.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl extends BaseServiceImpl<Product> implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public List<Product> findByStoreId(final Long storeId) {
        List<Product> productsByStoreId = new ArrayList<>();
        productsByStoreId = productRepository.findByStore_Id(storeId);
        return productsByStoreId;
    }

    @Override
    public JpaRepository<Product, Long> getRepository() {
        return productRepository;
    }

    @Override
    public Product findBySerial(String serial) {
        return productRepository.findBySerial(serial);
    }
}
