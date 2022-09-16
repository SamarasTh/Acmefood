package gr.acmefood.service;

import gr.acmefood.base.BaseComponent;
import gr.acmefood.domain.BaseModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, rollbackFor = Exception.class)
public abstract class BaseServiceImpl<T extends BaseModel> extends BaseComponent implements BaseService<T> {

    public abstract JpaRepository<T, Long> getRepository();

    @Override
    public T create(final T entity) {
        logger.trace("Creating {}.", entity);
        return getRepository().save(entity);
    }


    @Override
    public List<T> createAll(List<T> entities) {
        return getRepository().saveAll(entities);
    }

    @Override
    public void update(final T entity) {
        logger.trace("Updating {}.", entity);
        getRepository().save(entity);
    }


    @Override
    public void deleteById(final Long id) {
        final T entityFound = getRepository().getReferenceById(id);
        logger.trace("Deleting {}.", entityFound);
        getRepository().deleteById(id);
    }

    @Transactional(readOnly = true)
    @Override
    public T get(final Long id) {
        logger.trace("Retrieving item with id {}.", id);
        return getRepository().findById(id).orElseThrow(() -> new NoSuchElementException("Element not found"));
    }


    @Transactional(readOnly = true)
    @Override
    public List<T> findAll() {
        logger.trace("Retrieving all items.");
        return getRepository().findAll();
    }
}
