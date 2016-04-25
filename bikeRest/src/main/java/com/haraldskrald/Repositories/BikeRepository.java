package com.haraldskrald.Repositories;

import com.haraldskrald.Models.Bike;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by mikje53 on 4/25/16.
 */
public interface BikeRepository extends CrudRepository<Bike, Long> {
    List<Bike> findByBrand(String brand);
}
