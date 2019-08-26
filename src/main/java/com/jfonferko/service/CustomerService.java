package com.jfonferko.service;

import java.util.List;

import com.jfonferko.domain.Customer;
import com.jfonferko.exceptions.CustomerNotFoundExpcetion;
import com.jfonferko.repository.CustomerRepository;

public class CustomerService {

    private CustomerRepository customerRepository;

    public CustomerService(final CustomerRepository pCustomerRepository) {
        customerRepository = pCustomerRepository;
    }

    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    public Customer create(Customer pCustomer) {
        return customerRepository.save(pCustomer);
    }

    public Customer find(Long id) throws CustomerNotFoundExpcetion {
        return customerRepository.findById(id);
    }

    public Customer activateCustomer(final Long pId) throws CustomerNotFoundExpcetion {
        Customer customerToActivate = customerRepository.findById(pId);
        customerToActivate.activate();
        return customerRepository.save(customerToActivate);
    }
}
