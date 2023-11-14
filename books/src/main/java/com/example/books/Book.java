package com.example.books;

import java.util.ArrayList;

public class Book {

    private int id;
    private String title;
    private String auther;
    private ArrayList<Book> bookArrayList ;

    public Book(int id, String title, String auther) {
        this.id = id;
        this.title = title;
        this.auther = auther;
    }


    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuther() {
        return auther;
    }


}
