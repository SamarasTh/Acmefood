package gr.acmefood.service;

import gr.acmefood.domain.Store;
import gr.acmefood.domain.StoreCategory;
import gr.acmefood.repository.StoreCategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class StoreCategoryServiceImpl extends BaseServiceImpl<StoreCategory> implements StoreCategoryService {
    private final StoreCategoryRepository storeCategoryRepository;

    @Override
    public JpaRepository<StoreCategory, Long> getRepository() {
        return storeCategoryRepository;
    }

    @Override
    public StoreCategory findById(final Long id) {
        Optional<StoreCategory> storeCategory = storeCategoryRepository.findById(id);
        if (storeCategory.isPresent()) {
            return storeCategory.get();
        } else {
            throw new NoSuchElementException("StoreCategory with id: " + id + " does not exists!");
        }
    }

}
