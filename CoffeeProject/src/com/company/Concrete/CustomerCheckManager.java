package com.company.Concrete;

import com.company.Abstract.CustomerCheckService;
import com.company.Abstract.CustomerService;
import com.company.Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

    @Override
    public boolean CheckIfRealPerson(Customer customer) {
        return true;
    }
}
