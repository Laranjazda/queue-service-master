package controllers;

import models.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import services.CustomerService;
import java.util.List;


@RestController
@RequestMapping(value = "api")
public class CustomerController{
    @Autowired
    public CustomerService customerService;

    @GetMapping("/find")
    public List<Customer> getAll(){
        return customerService.getAll();
    }

    @PostMapping("/create")
    public Customer createOne(@RequestBody Customer customer){
       return customerService.createOne(customer);
    }
}
