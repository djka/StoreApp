package com.jfonferko.appservice;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.jfonferko.domain.Customer;
import com.jfonferko.dto.CustomerCreateDto;
import com.jfonferko.dto.CustomerDto;
import com.jfonferko.exceptions.CustomerNotFoundExpcetion;
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

    public CustomerDto save(CustomerCreateDto pCustomer) {
        Customer customerToCreate = new Customer(pCustomer.getPesel(), pCustomer.getFirstname(), pCustomer.getLastname(), false);
        return CustomerDto.of(customerService.create(customerToCreate));
    }

    public CustomerDto find(Long id) throws CustomerNotFoundExpcetion {
        return CustomerDto.of(customerService.find(id));
    }

    public CustomerDto activateCustomer(final Long pId) throws CustomerNotFoundExpcetion {
        return CustomerDto.of(customerService.activateCustomer(pId));
    }
}
