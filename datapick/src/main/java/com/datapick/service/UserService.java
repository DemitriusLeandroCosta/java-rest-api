package com.datapick.service;

import com.datapick.domain.user.User;
import com.datapick.domain.user.UserType;
import com.datapick.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public void validateTransaction(User sender, BigDecimal amount) throws Exception {
        if (sender.getUserType() == UserType.MERCHANT) {
            throw new Exception("Usuário não pode realizar a Transação ");
        }

        if (sender.getBalance().compareTo(amount) < 0) {
            throw new Exception("Usuário não possui saldo para realizar a Transação ");
        }
    }

    public User findUserById(Long id) throws Exception {
       return this.repository.findUserById(id).orElseThrow(() -> new Exception("Usuário não encontrado!"));
    }
}
