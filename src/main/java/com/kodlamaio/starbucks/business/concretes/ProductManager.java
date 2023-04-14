package com.kodlamaio.starbucks.business.concretes;

import com.kodlamaio.starbucks.business.abstracts.ProductService;
import com.kodlamaio.starbucks.business.dtos.requests.create.CreateProductRequest;
import com.kodlamaio.starbucks.business.dtos.requests.update.UpdateProductRequest;
import com.kodlamaio.starbucks.business.dtos.responses.create.CreateProductResponse;
import com.kodlamaio.starbucks.business.dtos.responses.get.GetAllProductsResponse;
import com.kodlamaio.starbucks.business.dtos.responses.get.GetProductResponse;
import com.kodlamaio.starbucks.business.dtos.responses.update.UpdateProductResponse;
import com.kodlamaio.starbucks.entities.Product;
import com.kodlamaio.starbucks.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class ProductManager implements ProductService {

    private final ProductRepository repository;
    private final ModelMapper mapper;

    @Override
    public List<GetAllProductsResponse> getAll() {
        List<Product> products = repository.findAll();
        List<GetAllProductsResponse> response = products.stream()
                .map(product -> mapper.map(product,GetAllProductsResponse.class)).toList();
        return response;
    }

    @Override
    public CreateProductResponse add(CreateProductRequest productRequest) {
        Product productSave = mapper.map(productRequest, Product.class);
        productSave.setId(0);
        Product productResponse = repository.save(productSave);
        return mapper.map(productResponse,CreateProductResponse.class);
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }

    @Override
    public UpdateProductResponse update(int id, UpdateProductRequest productRequest) {
        Product updateProduct = mapper.map(productRequest, Product.class);
        updateProduct.setId(id);
        Product productResponse = repository.save(updateProduct);
        return mapper.map(productResponse,UpdateProductResponse.class);
    }



    @Override
    public GetProductResponse getById(int id) {
        checkIfProductExists(id);
        Product product = repository.findById(id).orElseThrow();
        return mapper.map(product,GetProductResponse.class);
    }
    private void checkIfProductExists(int id) {
        if(!repository.existsById(id)){
            throw new RuntimeException("Ürün bulunamadı!");
    }
}
}
