package org.rahul.cms.service;

import org.rahul.cms.dao.CustomerDAO;
import org.rahul.cms.exception.CustomerNotFoundException;
import org.rahul.cms.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;

@Component
public class CustomerService {

    @Autowired
    private CustomerDAO customerDAO;

    private int customerIdCount = 1;
    private List<Customer> customerList = new CopyOnWriteArrayList<>();

    public Customer addCustomer(Customer customer) {
//        customer.setCustomerId(customerIdCount);
//        customerList.add(customer);
//        customerIdCount++;
//
//        return customer;

        return customerDAO.save(customer);
    }

    public List<Customer> getCustomers() {
//        return customerList;

        return customerDAO.findAll();
    }

    public Customer getCustomer(int customerId) {
//        return customerList
//                .stream()
//                .filter(c -> c.getCustomerId() == customerId)
//                .findFirst()
//                .get();

        Optional<Customer> optionalCustomer = customerDAO.findById(customerId);

        if (optionalCustomer.isEmpty()) {
            throw new CustomerNotFoundException("Customer record with id " + customerId + " not found.");
        }

        return optionalCustomer.get();
    }

    public Customer updateCustomer(int customerId, Customer customer) {
//        customerList.stream().forEach(c -> {
//            if (c.getCustomerId() == customerId) {
//                c.setCustomerFirstName(customer.getCustomerFirstName());
//                c.setCustomerLastName(customer.getCustomerLastName());
//                c.setCustomerEmail(customer.getCustomerEmail());
//            }
//        });
//
//        return customerList
//                .stream()
//                .filter(c -> c.getCustomerId() == customerId)
//                .findFirst()
//                .get();

        customer.setCustomerId(customerId);
        return customerDAO.save(customer);
    }

    public String deleteCustomer(int customerId) {
//        customerList.stream().forEach(c -> {
//            if (c.getCustomerId() == customerId) {
//                customerList.remove(c);
//            }
//        });

        customerDAO.deleteById(customerId);

        return "Customer with id " + customerId + " removed successfully.";
    }
}
