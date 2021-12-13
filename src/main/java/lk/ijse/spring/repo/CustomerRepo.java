package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author Pramuda Liyanage <pramudatharika@gmail.com>
 * @since 12/13/21
 **/

public interface CustomerRepo extends MongoRepository<String, Customer> {
}
