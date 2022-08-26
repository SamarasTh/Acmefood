package gr.acmefood.service;

import gr.acmefood.base.BaseComponent;
import gr.acmefood.domain.BaseModel;

import java.util.List;

public class BaseServiceImpl<T extends BaseModel> extends BaseComponent implements BaseService<T> {
    @Override
    public T create(T entity) {
        return null;
    }

    @Override
    public List<T> createAll(T... entities) {
        return null;
    }

    @Override
    public List<T> createAll(List<T> entities) {
        return null;
    }

    @Override
    public void update(T entity) {

    }

    @Override
    public void delete(T entity) {

    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public boolean exists(T entity) {
        return false;
    }

    @Override
    public T get(Long id) {
        return null;
    }

    @Override
    public List<T> findAll() {
        return null;
    }
}
