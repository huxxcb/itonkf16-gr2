package com.haraldskrald.RestControllers;

import com.haraldskrald.Models.Bike;
import com.haraldskrald.Repositories.BikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by mikje53 on 4/25/16.
 */

@RestController
@RequestMapping("/bikes")
public class BikeRestController {
    @Autowired
    private BikeRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Collection<Bike>> getAllTents(){
        List<Bike> col = new ArrayList<>();
        col.add(new Bike("Tribe", "Old-School Biek", "This bike looks old-school, that is awesome", 3995.95f, "https://www.dropbox.com/s/pht2rjgbcne8tvi/tribe.jpg?dl=0"));
        col.add(new Bike("Moots", "City Biek", "This is bike for city, very good for small hill, cost much", 8995.95f, "https://www.dropbox.com/s/pht2rjgbcne8tvi/moots.jpg?dl=0"));
        col.add(new Bike("Trek", "Trekking Biek", "This is bike for mountain, is very cheap", 995.95f, "https://www.dropbox.com/s/pht2rjgbcne8tvi/trek.jpg?dl=0"));
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
