package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
class CustomerServiceTest {

  @Autowired
  private CustomerService customerService;

  @Test
  public void test_createCustomer() {
    Customer createdCustomer = customerService.createCustomer("The Crusher", Customer.Region.EU);

    Assertions.assertEquals(4, createdCustomer.getId(), "Id should match");
    Assertions.assertEquals("The Crusher", createdCustomer.getName(), "Name should match");
    Assertions.assertEquals(Customer.Region.EU, createdCustomer.getRegion(), "Region should match");
  }
}