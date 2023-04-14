package com.kodlamaio.starbucks.business.abstracts;

import com.kodlamaio.starbucks.business.dtos.requests.create.CreateCustomerRequest;
import com.kodlamaio.starbucks.business.dtos.requests.update.UpdateCustomerRequest;
import com.kodlamaio.starbucks.business.dtos.responses.create.CreateCustomerResponse;
import com.kodlamaio.starbucks.business.dtos.responses.get.GetAllCustomersResponse;
import com.kodlamaio.starbucks.business.dtos.responses.get.GetCustomerResponse;
import com.kodlamaio.starbucks.business.dtos.responses.update.UpdateCustomerResponse;

import java.util.List;

public interface CustomerService {
    List<GetAllCustomersResponse> getAll();
    CreateCustomerResponse add(CreateCustomerRequest userRequest) throws Exception;
    void delete(int id);
    UpdateCustomerResponse update(int id, UpdateCustomerRequest userRequest);
    GetCustomerResponse getById(int id);
}
