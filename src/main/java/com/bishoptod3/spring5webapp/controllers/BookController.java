package com.bishoptod3.spring5webapp.controllers;

import com.bishoptod3.spring5webapp.model.repositories.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Loky on 30/07/2018.
 */
@Controller
public class BookController {

    private BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/books")
    public String getBooks(Model model) {

        model.addAttribute( "booksCollection", bookRepository.findAll() );

        return "booksTemplate";

    }
}
