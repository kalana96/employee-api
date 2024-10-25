package com.employee.employee_management_api.service;

import com.employee.employee_management_api.Utility.VarList;
import com.employee.employee_management_api.dto.EmployeeDTO;
import com.employee.employee_management_api.entity.Employee;
import com.employee.employee_management_api.repository.EmployeeRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private ModelMapper modelMapper;

    public String SaveEmployee(EmployeeDTO employeeDTO) {
        if (employeeRepository.existsById(employeeDTO.getEmpID())) {
            return VarList.RES_DUPLICATE;
        }else {
            employeeRepository.save(modelMapper.map(employeeDTO, Employee.class));
            return VarList.RES_SUCCESS;
        }
    }

    public List<EmployeeDTO> GetAllEmployee() {
        List<Employee> empList = employeeRepository.findAll();
        return modelMapper.map(empList, new TypeToken<List<EmployeeDTO>>(){}.getType());
    }

    public String UpdateEmployee(EmployeeDTO employeeDTO) {
        if (employeeRepository.existsById(employeeDTO.getEmpID())){
            employeeRepository.save(modelMapper.map(employeeDTO, Employee.class));
            return VarList.RES_SUCCESS;
        }else {
            return VarList.RES_NO_DATE_FOUND;
        }
    }

    public String DeleteEmployee(int empId) {
        if (employeeRepository.existsById(empId)){
            employeeRepository.deleteById(empId);
            return VarList.RES_SUCCESS;
        }else {
            return VarList.RES_NO_DATE_FOUND;
        }
    }

    public EmployeeDTO SearchEmployee(int empId){
        if (employeeRepository.existsById(empId)){
            Employee emp = employeeRepository.findById(empId).orElse(null);
            return modelMapper.map(emp, EmployeeDTO.class);
        }else {
            return null;
        }
    }
}
