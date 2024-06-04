package com.newtonapple.accounts.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.newtonapple.accounts.entity.Accounts;

public interface AccountsRepository extends JpaRepository<Accounts, Long>{

}
