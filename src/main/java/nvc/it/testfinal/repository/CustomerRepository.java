package nvc.it.testfinal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import nvc.it.testfinal.model.Customer;

public interface CustomerRepository extends MongoRepository<Customer, String> {
    
    
}
