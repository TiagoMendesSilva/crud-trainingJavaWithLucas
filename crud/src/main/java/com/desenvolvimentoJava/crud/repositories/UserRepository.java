package com.desenvolvimentoJava.crud.repositories;

import com.desenvolvimentoJava.crud.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
