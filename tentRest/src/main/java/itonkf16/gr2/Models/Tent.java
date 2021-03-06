package itonkf16.gr2.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by mikje53 on 4/18/16.
 */
@Entity
public class Tent {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String brand;
    private String model;
    private String description;
    private String image_url;

    private Float price;

    //for JPA
    public Tent() {}

    public Tent(String brand, String model, String description, String imageUrl, Float price) {
        this.brand = brand;
        this.model = model;
        this.description = description;
        this.image_url = imageUrl;
        this.price = price;

    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getBrand() {
        return brand;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public String getModel() {
        return model;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }

    public void setImageUrl(String image_url) {
        this.image_url = image_url;
    }
    public String getImageUrl() {
        return image_url;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
    public Float getPrice() {
        return price;
    }
}
