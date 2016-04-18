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

    private Float mPrice;

    //for JPA
    public Tent() {}

    public Tent(String brand, String model, String description, Float price) {
        this.brand = brand;
        this.model = model;
        this.description = description;
        mPrice = price;

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
        return mPrice;
    }
}
