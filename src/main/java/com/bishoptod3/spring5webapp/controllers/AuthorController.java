package com.bishoptod3.spring5webapp.controllers;

import com.bishoptod3.spring5webapp.model.repositories.AuthorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Loky on 31/07/2018.
 */
@Controller
public class AuthorController {

    private AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @RequestMapping("/authors")
    public String getAuthors(Model model) {

        model.addAttribute( "authorsCollection", authorRepository.findAll() );

        return "authorsTemplate";
    }

}
