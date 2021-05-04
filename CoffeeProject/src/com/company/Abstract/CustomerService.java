package com.company.Abstract;

import com.company.Entities.Customer;
import com.company.Entities.Entity;

public interface CustomerService extends Entity {
    void Save(Customer customer) throws Exception;

}
