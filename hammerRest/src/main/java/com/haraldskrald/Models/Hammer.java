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
    private String image_Url;
    private Float price;

    public Hammer() {}

    public Hammer(String brand, String model, String description, String image_Url, Float price) {
        this.brand = brand;
        this.model = model;
        this.description = description;
        this.image_Url = image_Url;
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

    public String getImage_Url(){ return  image_Url; }

    public Float getPrice() {
        return price;
    }
}