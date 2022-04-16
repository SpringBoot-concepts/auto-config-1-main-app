package com.dev.auto.config.service;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.stereotype.Component;

//@Component
public class CrossBorderTransactionService implements TransactionService{
    @Override
    public String getBeneName() {
        return "CrossBorderTransactionService_Bene";
    }
}
