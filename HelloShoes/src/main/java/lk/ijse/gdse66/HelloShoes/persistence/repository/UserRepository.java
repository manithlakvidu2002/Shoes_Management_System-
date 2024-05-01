package lk.ijse.gdse66.HelloShoes.persistence.repository;

import lk.ijse.gdse66.HelloShoes.persistence.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,String> {
    Boolean existsByEmail(String email);
    User findByEmailAndRole(String email,String role);
    void deleteByEmail(String email);
    Optional<User> findByEmail(String email);
}
