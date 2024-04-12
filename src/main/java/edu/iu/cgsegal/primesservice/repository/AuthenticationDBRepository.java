package edu.iu.cgsegal.primesservice.repository;

import edu.iu.cgsegal.primesservice.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthenticationDBRepository extends CrudRepository<Customer, String> {
    Customer findbyUsername(String username);
}
