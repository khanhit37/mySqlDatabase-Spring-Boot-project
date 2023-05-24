package com.example.MySqlDatabase.service;

import com.example.MySqlDatabase.model.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {

    List<Book> gettAllBook();

    void saveBook(Book book);

    Book updateBook(Integer id);
    void deleteBookById(Integer id);



}
