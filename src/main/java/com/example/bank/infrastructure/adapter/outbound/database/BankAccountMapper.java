package com.example.bank.infrastructure.adapter.outbound.database;

import com.example.bank.domain.model.BankAccount;
import org.springframework.stereotype.Component;

@Component
public class BankAccountMapper {

    public BankAccount toDomain(BankAccountEntity bankAccountEntity) {
        return new BankAccount(0, "Default", 0);
    }

    public BankAccountEntity toEntity(BankAccount bankAccount) {
        return new BankAccountEntity(0, "Default", 0);
    }
}
