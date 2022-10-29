package com.example.bookstore.bookrepository;

import com.example.bookstore.entity.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface BookRepository extends CrudRepository <Book,Long> {
//    Optional<Book> findById(Long Id);
    List<Book> findByTitle(String title);

}
