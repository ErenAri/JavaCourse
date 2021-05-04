package com.company;

public class MySqlCustomerDal implements CustomerService, RepositoryService{
    @Override
    public void add() {
        System.out.println("My sql eklendi");
    }
}
