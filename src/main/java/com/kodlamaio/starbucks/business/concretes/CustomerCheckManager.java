package com.kodlamaio.starbucks.business.concretes;

import com.kodlamaio.starbucks.adapters.MernisServiceAdapter;
import com.kodlamaio.starbucks.business.abstracts.CustomerCheckService;
import com.kodlamaio.starbucks.entities.Customer;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CustomerCheckManager implements CustomerCheckService {
    private final CustomerCheckService checkService;
    @Override
    public boolean checkIfRealPerson(Customer customer) throws Exception {

        return checkService.checkIfRealPerson(customer);
    }
}
