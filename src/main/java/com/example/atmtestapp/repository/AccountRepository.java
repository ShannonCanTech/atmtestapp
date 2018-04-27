package com.example.atmtestapp.repository;

import com.example.atmtestapp.Account;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, Long> {
}
