package com.jfonferko.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jfonferko.appservice.CustomerAppService;
import com.jfonferko.dto.CustomerCreateDto;
import com.jfonferko.dto.CustomerDto;

@RestController
@RequestMapping("/customer")
public class CustomerRestService {

    private CustomerAppService customerAppService;

    public CustomerRestService(final CustomerAppService pCustomerAppService) {
        customerAppService = pCustomerAppService;
    }

    @PostMapping("/home")
    public String home() {
        return "Spring boot is working!";
    }

    @GetMapping
    public List<CustomerDto> findAll() {
        return customerAppService.findAll();
    }



    @PutMapping
    public CustomerDto create(@RequestBody CustomerCreateDto pCustomer) {
        return customerAppService.create(pCustomer);
    }
}
