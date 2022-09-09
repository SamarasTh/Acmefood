package gr.acmefood.service;

import gr.acmefood.domain.Store;
import gr.acmefood.domain.StoreCategory;
import gr.acmefood.repository.StoreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StoreServiceImpl extends BaseServiceImpl<Store> implements StoreService {

    private final StoreRepository storeRepository;

    @Override
    public JpaRepository<Store, Long> getRepository() {
        return storeRepository;
    }


    @Override
    public List<Store> findByStoreCategory(final StoreCategory storeCategory) {
        return storeRepository.findByStoreCategory(storeCategory);
    }

    @Override
    public Store findByName(final String name) {
        return storeRepository.findByName(name);
    }
}
