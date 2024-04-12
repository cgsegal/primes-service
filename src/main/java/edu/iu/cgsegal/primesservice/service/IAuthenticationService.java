package edu.iu.cgsegal.primesservice.service;
import edu.iu.cgsegal.primesservice.model.Customer;

import java.io.IOException;

public interface IAuthenticationService {
    Customer register(Customer customer) throws IOException;
//    boolean login(Customer customer) throws IOException;

}
