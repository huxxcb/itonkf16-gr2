package com.haraldskrald.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by mikje53 on 4/25/16.
 */

@Entity
public class Bike {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String brand;
    private String model;
    private String description;

    private Float price;
    private String image_url;

    //for JPA
    public Bike() {}

    public Bike(String brand, String model, String description, Float price, String image_url) {
        this.brand = brand;
        this.model = model;
        this.description = description;
        this.price = price;
        this.image_url = image_url;

    }

    public void setBrand(String brand) { this.brand = brand;}
    public String getBrand() {
        return brand;
    }

    public void setModel(String model) { this.model = model;}
    public String getModel() {
        return model;
    }

    public void setDescription(String description) {this.description = description;}
    public String getDescription() {
        return description;
    }

    public void setPrice(Float price) {this.price = price;}
    public Float getPrice() {
        return price;
    }

    public void setImage_url(String image_url) {this.image_url = image_url;}
    public String getImage_url() {return image_url;}
}
