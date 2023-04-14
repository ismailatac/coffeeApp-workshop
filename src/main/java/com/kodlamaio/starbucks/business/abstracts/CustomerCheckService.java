package com.kodlamaio.starbucks.business.abstracts;

import com.kodlamaio.starbucks.entities.Customer;

public interface CustomerCheckService {
    boolean checkIfRealPerson(Customer customer) throws Exception;
}
