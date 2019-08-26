package com.jfonferko.dto;

import com.jfonferko.domain.Customer;

public class CustomerDto {

    private Long id;
    private String pesel;
    private String firstname;
    private String lastname;
    private boolean active;

    CustomerDto(final Long id, final String pPesel, final String pFirstname, final String pLastname, final boolean isActive) {
        this.id = id;
        this.pesel = pPesel;
        this.firstname = pFirstname;
        this.lastname = pLastname;
        this.active = isActive;
    }

    public static CustomerDto of(Customer customer) {
        return new CustomerDto(customer.getId(), customer.getPesel(), customer.getFirstname(), customer.getLastname(), customer.isActive());
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

    public boolean isActive() {
        return active;
    }
}
