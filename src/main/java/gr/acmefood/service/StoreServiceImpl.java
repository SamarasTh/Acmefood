package gr.acmefood.service;

import gr.acmefood.domain.Store;
import gr.acmefood.repository.StoreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StoreServiceImpl extends BaseServiceImpl<Store> implements StoreService {

    private final StoreRepository storeRepository;

    @Override
    public JpaRepository<Store, Long> getRepository() {
        return storeRepository;
    }


    @Override
    public List<Store> findByStoreCategoryId(final Long storeCategoryId) {
        List<Store> storesByStoreCategoryId = new ArrayList<>();
        storesByStoreCategoryId = storeRepository.findByStoreCategory_Id(storeCategoryId);
        return storesByStoreCategoryId;
    }

    @Override
    public List<Store> findByNameLike(final String name) {
        return storeRepository.findByNameContainingIgnoreCase(name);
    }

    @Override
    public Store findById(final Long id) {
        Optional<Store> store = storeRepository.findById(id);
        if (store.isPresent()) {
            return store.get();
        } else {
            throw new NoSuchElementException("Store with id: " + id + " does not exists!");
        }
    }

    @Override
    public List<Store> getMostFamousStoreS() {

        return storeRepository.findMostFamousStores();
    }
}
