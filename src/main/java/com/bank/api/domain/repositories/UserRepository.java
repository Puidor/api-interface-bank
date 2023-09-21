package com.bank.api.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.api.domain.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
