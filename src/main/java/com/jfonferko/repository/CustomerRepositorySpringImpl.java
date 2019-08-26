package com.jfonferko.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.jfonferko.domain.Customer;
import com.jfonferko.exceptions.CustomerNotFoundExpcetion;

@Repository
public class CustomerRepositorySpringImpl implements CustomerRepository {

    protected interface CustomerDBRepository extends JpaSpecificationExecutor<Customer>, org.springframework.data.repository.Repository<Customer, Long> {
        Customer save(Customer entity);

        List<Customer> findAll();

        Optional<Customer> findById(Long id);
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

    @Override
    public Customer findById(final Long id) throws CustomerNotFoundExpcetion {
        return customerDBRepository.findById(id).orElseThrow(() -> new CustomerNotFoundExpcetion(id));
    }

}
