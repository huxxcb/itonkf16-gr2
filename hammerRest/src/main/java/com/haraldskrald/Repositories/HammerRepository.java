package com.haraldskrald.Repositories;


import com.haraldskrald.Models.Hammer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface HammerRepository extends CrudRepository<Hammer, Long> {
    List<Hammer> findByBrand(String brand);
}
