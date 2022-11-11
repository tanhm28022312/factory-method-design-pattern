package com.example.factorymethoddesignpattern.factory;

import com.example.factorymethoddesignpattern.entities.TPBank;
import com.example.factorymethoddesignpattern.entities.VietcomBank;
import com.example.factorymethoddesignpattern.enums.BankType;
import com.example.factorymethoddesignpattern.superclass.Bank;

public class BankFactory {
    public BankFactory() {
    }

    public static  final Bank getBank(BankType bankType){
        switch (bankType){
            case TPBANK:
                return new TPBank();
            case VIETCOMBANK:
                return new VietcomBank();
            default:
                throw  new IllegalArgumentException("This bank type is unsupported");
        }
    }

}
