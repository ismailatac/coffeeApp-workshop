package com.kodlamaio.starbucks.repository;

import com.kodlamaio.starbucks.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
    boolean existsByIdentityNumber(String identityNumber);
}
