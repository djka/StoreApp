package com.jfonferko.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jfonferko.domain.Customer;

@Repository
public class CustomerRepositorySpringImpl implements CustomerRepository {

    protected interface CustomerDBRepository extends CrudRepository<Customer, String> {
        Customer save(Customer entity);

        List<Customer> findAll();
    }

    private final CustomerDBRepository customerDBRepository;

    public CustomerRepositorySpringImpl(final CustomerDBRepository pCustomerDBRepository) {
        customerDBRepository = pCustomerDBRepository;
    }

    @Override
    public List<Customer> findAll() {
        return customerDBRepository.findAll();
    }

    @Override
    public Customer save(final Customer pCustomer) {
        return customerDBRepository.save(pCustomer);
    }

}
