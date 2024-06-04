package com.newtonapple.accounts.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.newtonapple.accounts.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
