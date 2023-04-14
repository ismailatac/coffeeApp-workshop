package com.kodlamaio.starbucks.api.controllers;

import com.kodlamaio.starbucks.business.abstracts.CustomerService;
import com.kodlamaio.starbucks.business.dtos.requests.create.CreateCustomerRequest;
import com.kodlamaio.starbucks.business.dtos.requests.update.UpdateCustomerRequest;
import com.kodlamaio.starbucks.business.dtos.responses.create.CreateCustomerResponse;
import com.kodlamaio.starbucks.business.dtos.responses.get.GetAllCustomersResponse;
import com.kodlamaio.starbucks.business.dtos.responses.get.GetCustomerResponse;
import com.kodlamaio.starbucks.business.dtos.responses.update.UpdateCustomerResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@AllArgsConstructor
public class ProductsController {
    private final CustomerService service;



    @GetMapping
    public List<GetAllCustomersResponse> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public GetCustomerResponse getById(@PathVariable  int id){
        return service.getById(id);
    }
    @PutMapping("/{id}")
    public UpdateCustomerResponse update(@PathVariable int id, @RequestBody UpdateCustomerRequest user){
        return service.update(id, user);
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable int id){
        service.delete(id);
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CreateCustomerResponse add(@RequestBody CreateCustomerRequest user) throws Exception {
        return service.add(user);
    }


}
