package com.example.factorymethoddesignpattern.entities;

import com.example.factorymethoddesignpattern.superclass.Bank;

public class VietcomBank implements Bank {
    @Override
    public String getBankName() {
        return "VietcomBank";
    }
}
