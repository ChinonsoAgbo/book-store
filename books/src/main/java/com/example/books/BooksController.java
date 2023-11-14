package com.example.books;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class BooksController {

    @GetMapping("/books")
    public List<Book> greeting(){
        return Arrays.asList(
                new Book(1, " chinonso", "joseph"),
                new Book(1,"Frank","Joseph")
                );
    }
}