package nvc.it.testfinal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nvc.it.testfinal.model.Customer;
import nvc.it.testfinal.repository.CustomerRepository;

@Service
public class CustomerService {
    
    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getCustomers(){
        return customerRepository.findAll();
    }

    public Optional<Customer> getById(String id){
        return customerRepository.findById(id);
    }

    public Customer addCustomer(Customer customer){
        return customerRepository.save(customer);
    }

    public Optional<Customer> updateProduct(String id, Customer customer){
        // Get Product เดิม จาก ID
        Customer currenCustomer = customerRepository.findById(id).get();
        // Change Data
        currenCustomer.setName(customer.getName());
        currenCustomer.setAddress(customer.getAddress());
        currenCustomer.setTel(customer.getTel());
        // Send ค่ากลับไป
        return Optional.of(customerRepository.save(currenCustomer));
    }


}
