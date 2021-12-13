package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * @author Pramuda Liyanage <pramudatharika@gmail.com>
 * @since 12/13/21
 **/
@EnableMongoRepositories
public interface CustomerRepo extends MongoRepository<Customer, String> {

}
