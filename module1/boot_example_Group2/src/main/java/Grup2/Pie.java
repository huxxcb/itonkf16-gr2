package Grup2;

import javax.persistence.Entity;
import javax.persistence.*;

/**
 * Created by mat on 4/11/16.
 */
@Entity
public class Pie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String description;

    public Pie(String name, String description) {
        this.name = name;
        this.description = description;
    }

    //for JPA
    public Pie() {}

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
