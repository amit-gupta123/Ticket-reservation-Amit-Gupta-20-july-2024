package com.infoigain.brs.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
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
    @Column(nullable = false)
    private String fulLName;
}
