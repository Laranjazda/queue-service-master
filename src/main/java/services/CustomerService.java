package services;

import models.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.CustomerRepository;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getAll(){
        return customerRepository.findAll();
    }

    public Customer createOne(Customer customer){
        return customerRepository.insert(customer);
    }

}

