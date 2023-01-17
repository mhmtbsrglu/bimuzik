package com.muzikapp.bimuzik.core.service;

import com.muzikapp.bimuzik.core.entity.BaseEntity;

import java.util.List;

public interface BaseEntityService<T extends BaseEntity> {

    T getOne(int id);
    List<T> getAll();

    T createOne(T entity);

    List<T> saveAll(List<T> entities);

    T update(T entity);

    void delete(int id);

}
