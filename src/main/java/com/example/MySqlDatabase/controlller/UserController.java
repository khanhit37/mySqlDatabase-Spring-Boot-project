package com.example.MySqlDatabase.controlller;

import com.example.MySqlDatabase.config.dto.UserDto;
import com.example.MySqlDatabase.model.Book;
import com.example.MySqlDatabase.service.BookService;
import com.example.MySqlDatabase.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private BookService bookService;

    @GetMapping("/")
    public String login(){
        return "login";
    }

    @PostMapping("/login")
    public String listAll(Model model){
        List<Book> listBook = bookService.gettAllBook();
        model.addAttribute("listBook" , listBook);
        return "book";
    }

    @PostMapping("/saveUser")
    public String saveUser(@ModelAttribute("user") UserDto userDto){
        //save employee to database
        userService.save(userDto);
        return "redirect:/";
    }

    @PostMapping("/register")
    public String showRegistrationForm(Model model){
        UserDto user = new UserDto();
        model.addAttribute("user", user);
        return "register";
    }


}
