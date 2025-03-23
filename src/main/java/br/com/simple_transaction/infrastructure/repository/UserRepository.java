package br.com.simple_transaction.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.simple_transaction.infrastructure.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
