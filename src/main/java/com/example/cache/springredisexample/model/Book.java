package com.example.cache.springredisexample.model;

import java.io.Serializable;
import java.util.Date;

public class Book implements Serializable {

    private long id;
    private String title;
    private String author;
    private Date releaseDate;

    public Book(Long id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.releaseDate = new Date();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", releaseDate=" + releaseDate +
                '}';
    }

}
