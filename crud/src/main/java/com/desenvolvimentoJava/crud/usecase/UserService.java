package com.desenvolvimentoJava.crud.usecase;

import com.desenvolvimentoJava.crud.model.User;
import com.desenvolvimentoJava.crud.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private IUserRepository repository;

    public List<User> findAll(){
        return repository.findAll();
    }
}
