package com.haraldskrald.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Hammer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String brand;
    private String model;
    private String description;

    private Float price;

    public Hammer() {}

    public Hammer(String brand, String model, String description, Float price) {
        this.brand = brand;
        this.model = model;
        this.description = description;
        this.price = price;

    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getDescription() {
        return description;
    }

    public Float getPrice() {
        return price;
    }
}