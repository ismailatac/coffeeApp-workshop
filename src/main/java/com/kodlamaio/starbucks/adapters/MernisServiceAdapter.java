package com.kodlamaio.starbucks.adapters;

import com.kodlamaio.starbucks.business.abstracts.CustomerCheckService;
import com.kodlamaio.starbucks.entities.Customer;
import com.kodlamaio.starbucks.mernis.MNVKPSPublicSoap;


public class MernisServiceAdapter implements CustomerCheckService {
    public boolean checkIfRealPerson(Customer customer) throws Exception {
        MNVKPSPublicSoap client = new MNVKPSPublicSoap();
       return client.TCKimlikNoDogrula(Long.parseLong(customer.getIdentityNumber()),customer.getFirstName(), customer.getLastName(), customer.getBirthOfYear());
    }
}
