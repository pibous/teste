package lodging.persistence;

import lodging.data.Reserve;
import org.springframework.data.repository.CrudRepository;

public interface ReserveRepository extends CrudRepository<Reserve, Long>{
}
