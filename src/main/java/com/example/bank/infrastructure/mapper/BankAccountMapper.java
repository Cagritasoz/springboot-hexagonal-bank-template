package com.example.bank.infrastructure.mapper;

import com.example.bank.domain.model.BankAccount;
import com.example.bank.infrastructure.entity.BankAccountEntity;
import org.springframework.stereotype.Component;

@Component
public class BankAccountMapper {

    public BankAccount toDomain(BankAccountEntity bankAccountEntity) {
        return null;
    }

    public BankAccountEntity toEntity(BankAccount bankAccount) {
        return null;
    }
}
