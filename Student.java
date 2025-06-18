package com.example.CA223_practice_JPA;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@Entity
@Table(name="student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false , unique = true)
    private String telephone;
    private String email;
}

