package com.infoigain.brs.models;

import jakarta.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String userName;
    @Column(nullable=false)
    private String passWord;
    @Column(nullable = false)
    private String mobileNumber;
}
