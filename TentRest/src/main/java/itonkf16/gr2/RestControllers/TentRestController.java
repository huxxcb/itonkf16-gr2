package itonkf16.gr2.RestControllers;

import itonkf16.gr2.Models.Tent;
import itonkf16.gr2.Repositories.TentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * Created by mikje53 on 4/18/16.
 */

@RestController
@RequestMapping("/Tents")
public class TentRestController {
    @Autowired
    private TentRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Collection<Tent>> getAllTents(){
        return new ResponseEntity<>((Collection<Tent>) repository.findAll(), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public ResponseEntity<Tent> getTentWithId(@PathVariable Long id) {
        return new ResponseEntity<>(repository.findOne(id), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, params = {"brand"})
    public ResponseEntity<Collection<Tent>> findTentsWithBrand(@RequestParam(value="brand") String brand) {
        return new ResponseEntity<>(repository.findByBrand(brand), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> addTent(@RequestBody Tent input) {
        return new ResponseEntity<>(repository.save(input), HttpStatus.CREATED);
    }
}
