package com.company;

public class OracleCustomerDal implements CustomerService{
    @Override
    public void add() {
        System.out.println("Oracle eklendi");
    }
}
