package lk.ijse.gdse66.HelloShoes.service.impl;

import lk.ijse.gdse66.HelloShoes.dto.CustomerDTO;
import lk.ijse.gdse66.HelloShoes.persistence.entity.Customer;
import lk.ijse.gdse66.HelloShoes.persistence.repository.CustomerRepository;
import lk.ijse.gdse66.HelloShoes.service.CustomerService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: Manith Lakvidu,
 * @Runtime version: 11.0.11+9-b1341.60 amd64
 **/

@Service
public class CustomerServiceImpl implements CustomerService {
    CustomerRepository customerRepository;
    ModelMapper modelMapper;

    public CustomerServiceImpl(CustomerRepository customerRepository, ModelMapper modelMapper) {
        this.customerRepository = customerRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<CustomerDTO> getAllCustomers() {
        return customerRepository.findAll().stream().map(
                customer -> modelMapper.map(customer,CustomerDTO.class)
        ).toList();
    }

    @Override
    public CustomerDTO getCustomerDetails(String id) {
        return null;
    }

    @Override
    public CustomerDTO saveCustomer(CustomerDTO customerDTO) {
        return modelMapper.map(customerRepository.save(modelMapper.map(
                customerDTO, Customer.class)), CustomerDTO.class
        );
    }

    @Override
    public void updateCustomer(String id, CustomerDTO customerDTO) {
        return;
    }

    @Override
    public void deleteCustomer(String id) {

    }
}
