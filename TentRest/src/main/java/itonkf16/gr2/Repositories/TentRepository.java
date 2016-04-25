package itonkf16.gr2.Repositories;

import itonkf16.gr2.Models.Tent;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by mikje53 on 4/18/16.
 */
public interface TentRepository extends CrudRepository<Tent, Long> {
    List<Tent> findByBrand(String brand);
}
