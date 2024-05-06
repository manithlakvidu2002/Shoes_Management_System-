package lk.ijse.finalcoursework.shoeshop.persistence.repository;


import lk.ijse.finalcoursework.shoeshop.dto.CustomerDTO;
import lk.ijse.finalcoursework.shoeshop.persistence.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author: Manith Lakvidu,
 * @Runtime version: 11.0.11+9-b1341.60 amd64
 **/


public interface EmployeeRepository extends JpaRepository<Employee,String> {
    //List<Employee>findAllByAndOrderByDobDesc();
    Boolean existsByEmployeeCode(String id);
    Employee findByEmployeeCode(String id);
    void deleteByEmployeeCode(String id);
}