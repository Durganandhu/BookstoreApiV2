package com.bookstore.v2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookstore.v2.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}
