package com.everis.fixedtermaccount.repository;

import com.everis.fixedtermaccount.Model.fixedTermAccount;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface fixedTermAccountRepository extends MongoRepository<fixedTermAccount, String> {
	boolean existsByAccountNumber(String number);

	boolean existsByIdCustomer(String id);

	fixedTermAccount findByAccountNumber(String number);
}
