package com.employee.employee_management_api.service;

import com.employee.employee_management_api.dto.UserDTO;
import com.employee.employee_management_api.entity.User;
import com.employee.employee_management_api.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ModelMapper modelMapper;

    public UserDTO saveUser(UserDTO userDTO){
        userRepository.save(modelMapper.map(userDTO, User.class));
        return userDTO;
    }

    public List<UserDTO> getAllUsers() {
        List<User> userList = userRepository.findAll();
        return modelMapper.map(userList, new TypeToken<List<UserDTO>>(){}.getType());
    }

    public UserDTO updateUser(UserDTO userDTO) {
        userRepository.save(modelMapper.map(userDTO, User.class));
        return userDTO;
    }

    public Boolean deleteUser(UserDTO userDTO) {
        userRepository.delete(modelMapper.map(userDTO, User.class));
        return true;
    }

    //    userID > user Detail
    public UserDTO getUserByID(String userId){
        User user = userRepository.getUserByID(userId);
        return modelMapper.map(user, UserDTO.class);
    }

    //    userID, Address > user Details
    public  UserDTO getUserByIdAndAddress(String userId, String address){
        User user = userRepository.getUserByIdAndAddress(userId,address);
        return modelMapper.map(user, UserDTO.class);
    }

    public UserDTO updateById(String userId, String name) {
        User user = userRepository.updateById(userId, name);
        return modelMapper.map(user, UserDTO.class);
    }
}
