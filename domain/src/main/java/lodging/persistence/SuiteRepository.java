package lodging.persistence;

import lodging.data.Suite;
import org.springframework.data.repository.CrudRepository;

public interface SuiteRepository extends CrudRepository<Suite, Long> {
}
