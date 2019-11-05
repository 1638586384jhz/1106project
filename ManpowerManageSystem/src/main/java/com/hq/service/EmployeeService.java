package com.hq.service;



import java.util.HashMap;
import java.util.List;

import com.hq.pojo.Employee;

public interface EmployeeService {

	boolean employeeAdd(Employee employee);

	HashMap<String, Object> selectEmployee(Employee employee) ;

	boolean employeeUpdate(Employee employee);

	boolean employeeDel(int id);

}
