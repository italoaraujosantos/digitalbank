package br.com.simple_transaction.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.simple_transaction.infrastructure.entity.Portfolio;

public interface PortfolioRepository extends JpaRepository<Portfolio, Long>{

}
