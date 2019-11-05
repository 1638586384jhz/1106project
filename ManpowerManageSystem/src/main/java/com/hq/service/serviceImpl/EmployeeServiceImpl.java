package com.hq.service.serviceImpl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hq.mapper.EmployeeMapper;
import com.hq.pojo.Employee;
import com.hq.service.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	public EmployeeMapper employeeMapper; 
	@Override
	public boolean employeeAdd(Employee employee) {
		if(employeeMapper.employeeAdd(employee)>0) {
			return true;
		}
		return false;
		
	}
	@Override
	public HashMap<String, Object> selectEmployee(Employee employee) {
		
		HashMap<String,Object>  map = new HashMap<String,Object> ();

		if(employee.geteName()!=null&&!employee.geteName().equals("")){
			employee.seteName("%"+employee.geteName()+"%");
		}
		
		
		
		int start = employee.getRows()*(employee.getPage()-1);
		employee.setStart(start);	
		int total = employeeMapper.selectCount(employee);
	
		map.put("rows", employeeMapper.selectEmployee(employee));
		
		map.put("total", total);
		return map;
	}
	@Override
	public boolean employeeUpdate(Employee employee) {
		// TODO Auto-generated method stub
		if(employeeMapper.employeeUpdate(employee)>0) {
			return true;
		}
		return false;
	}
	@Override
	public boolean employeeDel(int id) {
		if(employeeMapper.employeeDel(id)>0) {
			return true;
		}
		return false;
	}

}
