package com.datapick.service;

import com.datapick.dto.TransactionDTO;
import com.datapick.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {
    @Autowired
    private UserService userService;
    @Autowired
    private TransactionRepository transactionRepository;

    public void createTransaction(TransactionDTO transaction){

    }
}
