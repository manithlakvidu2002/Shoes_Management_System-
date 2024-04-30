package lk.ijse.gdse66.HelloShoes.persistence.repository;

import lk.ijse.gdse66.HelloShoes.persistence.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,String> {
}
