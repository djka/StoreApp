package com.jfonferko.dto;

import com.jfonferko.domain.Customer;

public class CustomerDto {

    private Long id;
    private String pesel;
    private String firstname;
    private String lastname;

    CustomerDto(final Long id, final String pPesel, final String pFirstname, final String pLastname) {
        this.id = id;
        this.pesel = pPesel;
        this.firstname = pFirstname;
        this.lastname = pLastname;
    }

    public static CustomerDto of(Customer customer) {
        return new CustomerDto(customer.getId(), customer.getPesel(), customer.getFirstname(), customer.getLastname());
    }

    public Long getId() {
        return id;
    }

    public String getPesel() {
        return pesel;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }
}
