package com.example.cache.springredisexample.service;

import com.example.cache.springredisexample.model.Book;

import java.util.Map;

public interface BookRepository {

    void save(Book book);

    Map<Long, Book> findAll();

    Book findById(Long id);

    void update(Book book);

    void delete(Long id);

}
