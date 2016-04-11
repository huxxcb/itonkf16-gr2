package Grup2.repositories;

import Grup2.Pie;
import org.springframework.data.repository.*;
import java.util.*;

/**
 * Created by mat on 4/11/16.
 */

public interface PieRepository extends CrudRepository<Pie, Long> {
    List<Pie> findByName(String name);
}

