package com.jfonferko.repository;

import java.util.List;

import com.jfonferko.domain.Customer;

public interface CustomerRepository {
    List<Customer> findAll();
    Customer save(Customer pCustomer);
}
