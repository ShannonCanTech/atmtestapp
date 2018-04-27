package com.example.atmtestapp.repository;

import com.example.atmtestapp.Transaction;
import org.springframework.data.repository.CrudRepository;

public interface TransactionRepository extends CrudRepository<Transaction, Long> {
}
