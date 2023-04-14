package com.kodlamaio.starbucks.repository;

import com.kodlamaio.starbucks.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
