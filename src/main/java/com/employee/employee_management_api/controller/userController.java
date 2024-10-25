package com.employee.employee_management_api.controller;

import com.employee.employee_management_api.dto.UserDTO;
import com.employee.employee_management_api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/user")
@CrossOrigin
public class userController {
    @Autowired
    private UserService userService;

    @PostMapping("/saveUser")
    public UserDTO SaveUser(@RequestBody UserDTO userDTO) {
        return userService.saveUser(userDTO);
    }

    @GetMapping("/getUser")
    public List<UserDTO> GetUser(){
        return userService.getAllUsers();
    }

    @PutMapping("/updateUser")
    public UserDTO UpdateUser(@RequestBody UserDTO userDTO){
        return userService.updateUser(userDTO);
    }

    @DeleteMapping("/deleteUser")
    public Boolean DeleteUser(@RequestBody UserDTO userDTO){
        return userService.deleteUser(userDTO);
    }

    //    userID > user Detail
    @GetMapping("/getUserById/{userId}")
    public UserDTO getUserById(@PathVariable String userId){
        return userService.getUserByID(userId);
    }

    //    userID, Address > user Details
    @GetMapping("/getUserbyIdAndAddress/{userId}/{address}")
    public UserDTO getUserbyIdAndAddress(@PathVariable String userId, @PathVariable String address){
        return userService.getUserByIdAndAddress(userId,address);
    }

    @PutMapping("/updateById/{userId}/{name}")
    public UserDTO updateById(@PathVariable String userId, @PathVariable String name){
        return userService.updateById(userId,name);
    }
}
