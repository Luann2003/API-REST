package com.projeto.API.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.API.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
