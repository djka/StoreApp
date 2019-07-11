package com.jfonferko;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jfonferko.repository.CustomerRepository;
import com.jfonferko.service.CustomerService;

@Configuration
public class ServicesFactory {

    @Bean
    public CustomerService createCustomerService(CustomerRepository pCustomerRepository){
        return new CustomerService(pCustomerRepository);
    }
}
