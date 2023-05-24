package com.example.MySqlDatabase.service;

import com.example.MySqlDatabase.model.Book;
import com.example.MySqlDatabase.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceIml implements BookService {
    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> gettAllBook() {
        // lấy danh sách book
        return bookRepository.findAll() ;
    }

    @Override
    public void saveBook(Book book) {
        this.bookRepository.save(book);
    }

    @Override
    public Book updateBook(Integer id) {
        Book update = bookRepository.findById(id).orElse(null);
        return update;
    }

    @Override
    public void deleteBookById(Integer id) {
        this.bookRepository.deleteById(id);

    }

}
