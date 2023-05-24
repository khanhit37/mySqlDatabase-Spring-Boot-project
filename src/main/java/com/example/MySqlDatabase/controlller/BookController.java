package com.example.MySqlDatabase.controlller;

import com.example.MySqlDatabase.model.Book;
import com.example.MySqlDatabase.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
@Controller
public class BookController {
    @Autowired
    private BookService bookService;


    @GetMapping("/")
    public String listAll(Model model){
        List<Book> listBook = bookService.gettAllBook();
        model.addAttribute("listBook" , listBook);
        return "index";
    }
    @GetMapping("/new")
    public String newBook(Model model){
        Book book = new Book();
        model.addAttribute("newbook", book);
        return "newBook";
    }
    @PostMapping("/save")
    public String saveBook(@ModelAttribute("newbook")Book book){
        bookService.saveBook(book);
        return "redirect:/";

    }
    @GetMapping("/edit/{id}")
    public String editBook(@PathVariable(name = "id") int id, Model model){
         Book book = bookService.updateBook(id);
         model.addAttribute("book" , book);
        return "editbook";
    }
    @GetMapping("/delete/{id}")
    public String deleteBook(@PathVariable(name = "id") Integer id){
        this.bookService.deleteBookById(id);
        return "redirect:/";
    }

}
