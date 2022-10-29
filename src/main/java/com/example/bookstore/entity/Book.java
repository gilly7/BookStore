package com.example.bookstore.entity;

import javax.persistence.*;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, unique = true)
    private String title;

    @Column(nullable = false, unique = false)
    private String author;

    @Column(nullable = false, unique = false)
    private String pages;



}
