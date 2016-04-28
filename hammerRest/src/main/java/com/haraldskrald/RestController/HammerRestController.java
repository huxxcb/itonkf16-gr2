package com.haraldskrald.RestController;

import com.haraldskrald.Models.Hammer;
import com.haraldskrald.Repositories.HammerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/hammers")
public class HammerRestController {
    @Autowired
    private HammerRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Collection<Hammer>> getAllTents(){
        return new ResponseEntity<>((Collection<Hammer>) repository.findAll(), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public ResponseEntity<Hammer> getTentWithId(@PathVariable Long id) {
        return new ResponseEntity<>(repository.findOne(id), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, params = {"brand"})
    public ResponseEntity<Collection<Hammer>> findTentsWithBrand(@RequestParam(value="brand") String brand) {
        return new ResponseEntity<>(repository.findByBrand(brand), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> addTHammer(@RequestBody Hammer input) {
        return new ResponseEntity<>(repository.save(input), HttpStatus.CREATED);
    }

}
