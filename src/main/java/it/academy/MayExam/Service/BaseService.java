package it.academy.MayExam.Service;

import java.util.List;

public interface BaseService<T> {
    T getById(Long id);
    List<T> getAll();
    T save (T object);
    void deleteById(Long id);
}
