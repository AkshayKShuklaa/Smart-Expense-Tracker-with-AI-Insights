package com.example.ExpenseTrackerApplication.entity;

import jakarta.persistence.*;

import java.util.List;


import java.util.List;
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String password;

    private String role = "USER";

    @OneToMany(mappedBy = "user")
    private List<Transaction> transactions;
}