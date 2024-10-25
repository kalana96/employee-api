package com.employee.employee_management_api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class EmployeeDTO {
    private int empID;
    private String employeeName;
    private String contactNumber;
    private String email;
    private String address;
}
