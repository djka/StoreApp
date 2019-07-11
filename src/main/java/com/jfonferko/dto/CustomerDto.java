package com.jfonferko.dto;

import com.jfonferko.domain.Customer;

public class CustomerDto {


    private String pesel;
    private String firstname;
    private String lastname;

    CustomerDto(final String pPesel, final String pFirstname, final String pLastname) {
        this.pesel = pPesel;
        this.firstname = pFirstname;
        this.lastname = pLastname;
    }

    public static CustomerDto of(Customer customer) {
        return new CustomerDto(customer.getPesel(), customer.getFirstname(), customer.getLastname());
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
