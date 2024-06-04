package com.newtonapple.loans.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.newtonapple.loans.entity.Loans;

public interface LoansRepository extends JpaRepository<Loans, Long>{

}
