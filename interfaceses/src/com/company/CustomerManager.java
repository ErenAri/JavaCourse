package com.company;

public class CustomerManager {

    private CustomerService customerService;

    public CustomerManager(CustomerService customerService){
        this.customerService = customerService;
    }

    public void add(){
        //business codes
        customerService.add();
    }
}
