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
    private String image_url;
    private Float price;

    public Hammer() {}

    public Hammer(String brand, String model, String description, String image_url, Float price) {
        this.brand = brand;
        this.model = model;
        this.description = description;
        this.image_url = image_url;
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

    public String getImage_url(){ return  image_url; }

    public Float getPrice() {
        return price;
    }
}