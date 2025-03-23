package br.com.simple_transaction.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.simple_transaction.infrastructure.entity.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long>{

}
