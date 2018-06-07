package com.example.cache.springredisexample.service;

import com.example.cache.springredisexample.model.Book;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class BookRepositoryImpl implements BookRepository {
    private static final String BOOK_KEY = "Book";
    private RedisTemplate<String, Book> redisTemplate;
    private HashOperations hashOperations;

    public BookRepositoryImpl(RedisTemplate<String, Book> redisTemplate) {
        this.redisTemplate = redisTemplate;
        this.hashOperations = redisTemplate.opsForHash();
    }

    @Override
    public void save(Book book) {
        hashOperations.put(BOOK_KEY, book.getId(), book);
    }

    @Override
    public Map<Long, Book> findAll() {
        return hashOperations.entries(BOOK_KEY);
    }

    @Override
    public Book findById(Long id) {
        return (Book) hashOperations.get(BOOK_KEY, id);
    }

    @Override
    public void update(Book book) {
        save(book);
    }

    @Override
    public void delete(Long id) {
        hashOperations.delete(BOOK_KEY, id);
    }
}
