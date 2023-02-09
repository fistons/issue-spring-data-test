package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
public class CustomerService {

  private final CustomerRepository customerRepository;

  public CustomerService(CustomerRepository customerRepository) {
    this.customerRepository = customerRepository;
  }


  @Transactional
  public Customer createCustomer(String name, Customer.Region region) {

    Customer customer = new Customer();
    customer.setName(name);
    customer.setRegion(region);

    return customerRepository.save(customer);
  }

}
