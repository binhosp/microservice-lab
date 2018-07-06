package com.lab.catalogservice.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, unique = false)
    private String code;

    @Column(nullable = false)
    private String name;
    private String description;
    private String price;

}
