package com.kodlamaio.starbucks.business.concretes;

import com.kodlamaio.starbucks.business.abstracts.CustomerCheckService;
import com.kodlamaio.starbucks.business.abstracts.CustomerService;
import com.kodlamaio.starbucks.business.dtos.requests.create.CreateCustomerRequest;
import com.kodlamaio.starbucks.business.dtos.requests.update.UpdateCustomerRequest;
import com.kodlamaio.starbucks.business.dtos.responses.create.CreateCustomerResponse;
import com.kodlamaio.starbucks.business.dtos.responses.get.GetAllCustomersResponse;
import com.kodlamaio.starbucks.business.dtos.responses.get.GetCustomerResponse;
import com.kodlamaio.starbucks.business.dtos.responses.update.UpdateCustomerResponse;
import com.kodlamaio.starbucks.entities.Customer;
import com.kodlamaio.starbucks.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class CustomerManager implements CustomerService {
    private final CustomerRepository repository;
    private final ModelMapper mapper;
    private final CustomerCheckService customerCheckService;

    @Override
    public List<GetAllCustomersResponse> getAll() {
        List<Customer> customers = repository.findAll();
        List<GetAllCustomersResponse> response = customers.stream()
                .map(customer -> mapper.map(customer,GetAllCustomersResponse.class)).toList();
        return response;
    }

    @Override
    public CreateCustomerResponse add(CreateCustomerRequest customerRequest) throws Exception {
        Customer customerSave = mapper.map(customerRequest, Customer.class);
        checkIfCustomerNotExists(customerSave);
        customerSave.setId(0);
        checkIfIsCustomerRealPerson(customerSave);
        Customer customerResponse = repository.save(customerSave);
        return mapper.map(customerResponse,CreateCustomerResponse.class);
    }

    private void checkIfIsCustomerRealPerson(Customer customerSave) throws Exception {
        if (!customerCheckService.checkIfRealPerson(customerSave))   throw new Exception("Kullanıcı doğrulanamadı!");

    }

    @Override
    public void delete(int id) {
        checkIfCustomerNotExists(id);
        repository.deleteById(id);
    }

    @Override
    public UpdateCustomerResponse update(int id, UpdateCustomerRequest customerRequest) {
        checkIfCustomerNotExists(id);
        Customer updateCustomer = mapper.map(customerRequest, Customer.class);
        updateCustomer.setId(id);
        Customer customerResponse = repository.save(updateCustomer);
        return mapper.map(customerResponse,UpdateCustomerResponse.class);
    }

    @Override
    public GetCustomerResponse getById(int id) {
        checkIfCustomerNotExists(id);
        Customer customer = repository.findById(id).orElseThrow();
        return mapper.map(customer,GetCustomerResponse.class);
    }

    private void checkIfCustomerNotExists(int id) {
        if(!repository.existsById(id)){
            throw new RuntimeException("Kullanıcı bulunamadı!");
        }
    }
    private void checkIfCustomerNotExists(Customer customer) {
        if(repository.existsByIdentityNumber(customer.getIdentityNumber())){
            throw new RuntimeException("Kullanıcı zaten var!");
        }
    }
}
