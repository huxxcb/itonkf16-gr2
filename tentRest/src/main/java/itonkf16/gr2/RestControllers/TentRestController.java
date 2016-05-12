package itonkf16.gr2.RestControllers;

import itonkf16.gr2.Models.Tent;
import itonkf16.gr2.Repositories.TentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by mikje53 on 4/18/16.
 */

@RestController
@RequestMapping("/tents")
public class TentRestController {
    @Autowired
    private TentRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Collection<Tent>> getAllTents(){

        List<Tent> tentList = new ArrayList<>();

        tentList.add(new Tent("Skandika",
                "Nimbus",
                "Do you want a tent, where you can fit in everyone, well this is it!",
                "https://dl.dropboxusercontent.com/u/2515641/715LCf2u9EL._SL1500_.jpg",
                54.99f));
        tentList.add(new Tent("Coleman",
                "Sundome",
                "A tent where you can fit some people",
                "https://dl.dropboxusercontent.com/u/2515641/Coleman-Sundome-4-Person-Tent-2.jpg",
                24.99f));
        tentList.add(new Tent("Vango",
                "Appleby",
                "This is a modern take on old time tournament tents!",
                "https://dl.dropboxusercontent.com/u/2515641/Vango-Appleby-500-Family-Tent.jpg",
                9.99f));

        return new ResponseEntity<>(tentList, HttpStatus.OK);
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
