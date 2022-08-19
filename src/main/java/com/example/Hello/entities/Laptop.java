package com.example.Hello.entities;

import javax.persistence.*;

@Entity
@Table(name = "laptops")
public class Laptop {

    // atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String model;
    private Double price;

    // constructores
    public Laptop() {
    }

    public Laptop(Long id, String model, Double price) {
        this.id = id;
        this.model = model;
        this.price = price;
    }

    // getter y setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
