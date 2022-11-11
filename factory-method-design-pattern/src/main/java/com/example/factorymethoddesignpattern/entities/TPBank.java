package com.example.factorymethoddesignpattern.entities;

import com.example.factorymethoddesignpattern.superclass.Bank;

public class TPBank implements Bank {
    @Override
    public String getBankName() {
        return "TPBank";
    }
}
