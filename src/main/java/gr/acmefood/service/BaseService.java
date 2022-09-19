package gr.acmefood.service;

import gr.acmefood.domain.BaseModel;

import java.util.List;

public interface BaseService<T extends BaseModel> {

    T create(final T entity);

    List<T> createAll(final List<T> entities);

    void update(T entity);

    void deleteById(Long id);

    T get(Long id);

    List<T> findAll();

}