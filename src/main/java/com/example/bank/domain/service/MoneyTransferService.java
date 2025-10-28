package com.example.bank.domain.service;

import com.example.bank.domain.port.BankAccountRepository;
import org.springframework.stereotype.Service;

@Service
public class MoneyTransferService {
    private BankAccountRepository bankAccountRepository;

    public MoneyTransferService(BankAccountRepository bankAccountRepository) { //example of Dependency Injection
        this.bankAccountRepository = bankAccountRepository;
    }

    public void transferMoney(long senderId, long receiverId, double amount) {

    }


}
