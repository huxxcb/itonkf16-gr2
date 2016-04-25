package com.haraldskrald.RestControllers;

import com.haraldskrald.Models.Bike;
import com.haraldskrald.Repositories.BikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * Created by mikje53 on 4/25/16.
 */

@RestController
@RequestMapping("/Bikes")
public class BikeRestController {
    @Autowired
    private BikeRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Collection<Bike>> getAllTents(){
        return new ResponseEntity<>((Collection<Bike>) repository.findAll(), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public ResponseEntity<Bike> getTentWithId(@PathVariable Long id) {
        return new ResponseEntity<>(repository.findOne(id), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, params = {"brand"})
    public ResponseEntity<Collection<Bike>> findTentsWithBrand(@RequestParam(value="brand") String brand) {
        return new ResponseEntity<>(repository.findByBrand(brand), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> addTent(@RequestBody Bike input) {
        return new ResponseEntity<>(repository.save(input), HttpStatus.CREATED);
    }
}
