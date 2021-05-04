package com.company.Concrete;

import com.company.Abstract.BaseCustomerManager;
import com.company.Abstract.CustomerCheckService;
import com.company.Abstract.CustomerService;
import com.company.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

    private CustomerCheckService _customerCheckService;

    @Override
    public void Save(Customer customer) throws Exception {
        if (_customerCheckService.CheckIfRealPerson(customer)==true){
            super.save(customer);
        }
        else{
            throw new Exception("Not a valid person");
        }

    }

    private void CheckIfRealPerson(Customer customer) {
    }
}
