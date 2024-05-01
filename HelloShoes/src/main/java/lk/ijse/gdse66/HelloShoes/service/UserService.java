package lk.ijse.gdse66.HelloShoes.service;

import lk.ijse.gdse66.HelloShoes.dto.UserDTO;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService {
    UserDetailsService userDetailService();
    List<UserDTO> getAllUser();
    UserDTO getUserDetails(String email,String role);
    UserDTO saveUser(UserDTO userDTO);
    void updateUser(String email, UserDTO userDTO);
    void deleteUser(String email);
}
