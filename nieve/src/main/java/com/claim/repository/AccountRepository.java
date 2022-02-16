package com.claim.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.claim.entity.Account;



@Repository
public interface AccountRepository extends JpaRepository<Account, String> {

	@Query("Select A FROM Account A WHERE A.accountName = ?1")
	Account findAccountByName(String accountName);
	
	@Query("Select A FROM Account A")
	Account findAllByAccountName(String accountName);
	
}
