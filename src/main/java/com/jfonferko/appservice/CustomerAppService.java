package com.jfonferko.appservice;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.jfonferko.domain.Customer;
import com.jfonferko.dto.CustomerCreateDto;
import com.jfonferko.dto.CustomerDto;
import com.jfonferko.service.CustomerService;

@Service
public class CustomerAppService {

    private CustomerService customerService;

    public CustomerAppService(final CustomerService pCustomerService) {
        customerService = pCustomerService;
    }

    public List<CustomerDto> findAll() {
        return customerService.findAll().stream().map(CustomerDto::of).collect(Collectors.toList());
    }

    public CustomerDto create(CustomerCreateDto pCustomer) {
        Customer customerToCreate = new Customer(pCustomer.getPesel(), pCustomer.getFirstname(), pCustomer.getLastname(), true);
        return CustomerDto.of(customerService.create(customerToCreate));
    }

}
