package com.hq.mapper;

import java.util.List;

import com.hq.pojo.Employee;

public interface EmployeeMapper {

	int employeeAdd(Employee employee);

	List<Employee> selectEmployee(Employee employee);

	int employeeUpdate(Employee employee);

	int employeeDel(int eId);

	int selectCount(Employee employee);

}
