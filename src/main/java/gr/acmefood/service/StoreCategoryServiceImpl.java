package gr.acmefood.service;

import gr.acmefood.domain.StoreCategory;
import gr.acmefood.repository.StoreCategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class StoreCategoryServiceImpl extends BaseServiceImpl<StoreCategory> implements StoreCategoryService {
    private final StoreCategoryRepository storeCategoryRepository;

    @Override
    public JpaRepository<StoreCategory, Long> getRepository() {
        return storeCategoryRepository;
    }


}
