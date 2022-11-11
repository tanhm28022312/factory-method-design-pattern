package com.example.factorymethoddesignpattern;

import com.example.factorymethoddesignpattern.enums.BankType;
import com.example.factorymethoddesignpattern.factory.BankFactory;
import com.example.factorymethoddesignpattern.superclass.Bank;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FactoryMethodDesignPatternApplication {

    public static void main(String[] args) {
        SpringApplication.run(FactoryMethodDesignPatternApplication.class, args);
        Bank bank = BankFactory.getBank(BankType.VIETCOMBANK);
        System.out.println(bank.getBankName());
        Bank bank1 = BankFactory.getBank(BankType.TPBANK);
        System.out.println(bank1.getBankName());
    }

}
