package com.stackexcelero.dataAccess.utility;

import java.util.List;
import java.util.Optional;

public interface CrudDao<T> {
	Optional<T> findById(int id);
    List<T> findAll();
    void save(T entity);
    void update(T entity);
    void delete(int id);
}
