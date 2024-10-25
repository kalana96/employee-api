package com.employee.employee_management_api.repository;

import com.employee.employee_management_api.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Integer> {
    @Query(value = "SELECT * FROM user WHERE id=?1", nativeQuery = true)
    User getUserByID(String userId);

    @Query(value = "select * from user where id=?1 and address=?2", nativeQuery = true)
    User getUserByIdAndAddress(String userId, String address);

    @Modifying
    @Query(value = "Update user Set name=?2 where id=?1", nativeQuery = true)
    User updateById(String userId, String name);
}
