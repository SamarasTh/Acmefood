package gr.acmefood.service;

import gr.acmefood.domain.ProductCategory;
import gr.acmefood.repository.ProductCategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductCategoryServiceImpl extends BaseServiceImpl<ProductCategory> implements ProductCategoryService{

    private final ProductCategoryRepository productCategoryRepositoryRepository;

    @Override
    public JpaRepository<ProductCategory, Long> getRepository() {
        return productCategoryRepositoryRepository;
    }

    @Override
    public ProductCategory findByName(String name) {
        return productCategoryRepositoryRepository.findByName(name);
    }
}
