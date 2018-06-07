package com.example.cache.springredisexample;

import com.example.cache.springredisexample.model.Book;
import com.example.cache.springredisexample.service.BookRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/book")
public class BookController {
    Logger logger = LoggerFactory.getLogger(BookController.class);
    private BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping("/add/{id}/{title}/{author}")
    private Book addBookDetails(@PathVariable Long id, @PathVariable String title, @PathVariable String author) {
        bookRepository.save(new Book(id, title, author));
        return bookRepository.findById(id);
    }

    @GetMapping("/all")
    private Map<Long, Book> findAll() {
        return bookRepository.findAll();
    }

    @GetMapping("/delete/{id}")
    private Map<Long, Book> delete(@PathVariable Long id) {
        bookRepository.delete(id);
        return findAll();
    }

    @GetMapping("/update/{id}/{title}")
    private Map<Long, Book> update(@PathVariable Long id, @PathVariable String title) {
        Book book = bookRepository.findById(id);
        book.setTitle(title);
        bookRepository.update(book);
        return findAll();
    }
}
