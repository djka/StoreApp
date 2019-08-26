package com.jfonferko.repository;

import java.util.List;

import com.jfonferko.domain.Customer;
import com.jfonferko.exceptions.CustomerNotFoundExpcetion;

public interface CustomerRepository {
    List<Customer> findAll();
    Customer save(Customer pCustomer);
    Customer findById(Long id) throws CustomerNotFoundExpcetion;
}
