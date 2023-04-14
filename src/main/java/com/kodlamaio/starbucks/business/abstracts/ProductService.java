package com.kodlamaio.starbucks.business.abstracts;

import com.kodlamaio.starbucks.business.dtos.requests.create.CreateProductRequest;
import com.kodlamaio.starbucks.business.dtos.requests.update.UpdateProductRequest;
import com.kodlamaio.starbucks.business.dtos.responses.create.CreateProductResponse;
import com.kodlamaio.starbucks.business.dtos.responses.get.GetAllProductsResponse;
import com.kodlamaio.starbucks.business.dtos.responses.get.GetProductResponse;
import com.kodlamaio.starbucks.business.dtos.responses.update.UpdateProductResponse;

import java.util.List;

public interface ProductService {
    List<GetAllProductsResponse> getAll();
    CreateProductResponse add(CreateProductRequest productRequest);
    void delete(int id);
    UpdateProductResponse update(int id, UpdateProductRequest productRequest);
    GetProductResponse getById(int id);
}
