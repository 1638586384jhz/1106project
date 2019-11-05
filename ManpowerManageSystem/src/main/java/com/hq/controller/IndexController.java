package com.hq.controller;


import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hq.pojo.Agreement;
import com.hq.pojo.Employee;
import com.hq.pojo.Files;
import com.hq.service.AgreementService;
import com.hq.service.EmployeeService;
import com.hq.service.FilesService;

@Controller
public class IndexController {
	@Autowired
	public EmployeeService employeeService;
	@Autowired
	public FilesService filesService;
	@Autowired 
	public AgreementService agreementService;
	@RequestMapping("indexPage.do")
	public String indexPage() {
		return "index";
		
	}
	@RequestMapping("shouye.do")
	public String shouye() {
		return "shouye";
	}
	@RequestMapping("employeePage.do")
	public String studentPage() {
		return "employee";
	}
	/**插入员工信息**/
	@RequestMapping("employeeAdd.do")
	@ResponseBody
	public boolean employeeAdd(HttpServletRequest request) {
		
		  Employee employee=new Employee();
		  employee.seteName(request.getParameter("eName"));
		  employee.seteSex(request.getParameter("eSex"));
		  employee.setePhone(request.getParameter("ePhone"));
		  employee.seteDepartment(request.getParameter("eDepartment"));
		  employee.seteEducation(request.getParameter("eEducation"));
		  employee.seteEmail(request.getParameter("eEmail"));
		  employee.seteJob(request.getParameter("eJob"));
		  employee.seteRemark(request.getParameter("eRemark"));
		  employee.seteState(request.getParameter("eState"));
		  employee.seteBirthDate(request.getParameter("eBirthDate"));
		  employee.seteEntryDate(request.getParameter("eEntryDate")); 
		   
		  return employeeService.employeeAdd(employee);
	}
	/**员工信息分页查询**/
	@RequestMapping("selectEmpolyee.do")
	@ResponseBody
	public HashMap<String, Object> selectEmpolyee(Employee employee) {
		HashMap<String, Object> hashMap=employeeService.selectEmployee(employee);
		return hashMap;
	}
	/**修改员工信息**/
	@RequestMapping("employeeUpdate.do")
	@ResponseBody
	public boolean employeeUpdate(HttpServletRequest request) {
		Employee employee=new Employee();
			employee.seteId(Integer.parseInt(request.getParameter("eId")));
		  employee.seteName(request.getParameter("eName"));
		  employee.seteSex(request.getParameter("eSex"));
		  employee.setePhone(request.getParameter("ePhone"));
		  employee.seteDepartment(request.getParameter("eDepartment"));
		  employee.seteEducation(request.getParameter("eEducation"));
		  employee.seteEmail(request.getParameter("eEmail"));
		  employee.seteJob(request.getParameter("eJob"));
		  employee.seteRemark(request.getParameter("eRemark"));
		  employee.seteState(request.getParameter("eState")); 
		  
		  employee.seteBirthDate(request.getParameter("eBirthDate"));
		  employee.seteEntryDate(request.getParameter("eEntryDate"));
		  
		  
		return employeeService.employeeUpdate(employee);
	}
	/**删除员工信息**/
	@RequestMapping("employeeDel.do")
	@ResponseBody
	public boolean employeeDel(int eId) {
		  
		return employeeService.employeeDel(eId);
	}

	@RequestMapping("filesPage.do")
	public String filesPage() {
		return "files";
	}
	/**添加员工档案**/
	@RequestMapping("filesAdd.do")
	@ResponseBody
	public boolean filesAdd(Files files) {
		return filesService.filesAdd(files);
		
	}
	/**档案查询**/
	@RequestMapping("selectFiles.do")
	@ResponseBody
	public HashMap<String , Object> selectFiles(Files files){
		
		return filesService.selectFiles(files);
	}
	/**档案修改**/
	@RequestMapping("filesUpdate.do")
	@ResponseBody
	public boolean filesUpdate(Files files) {
		return filesService.filesUpdate(files);
	}
	/**档案删除**/
	@RequestMapping("filesDel.do")
	@ResponseBody
	public boolean filesDel(Integer fId) {
		System.out.println(fId);
		return filesService.filesDel(fId);
	}
	/**跳转合同页面**/
	@RequestMapping("agreementPage.do")
	public String agreementPage() {
		return "agreement";
	}
	/**添加合同**/
	@RequestMapping("agreementAdd.do")
	@ResponseBody
	public boolean agreementAdd(Agreement agreement) {
		System.out.println(agreement);
		return agreementService.agreementAdd(agreement);
	}
	/**查询合同**/
	
	  @RequestMapping("selectAgreement.do")
	  
	  @ResponseBody 
	  public HashMap<String, Object> selectAgreement(Agreement agreement){ 
		  System.out.println(agreement);
	  
	  return agreementService.selectAgreement(agreement); }
	 
	/**修改合同**/
	@RequestMapping("agreementUpdate.do")
	@ResponseBody
	public boolean agreementUpdate(Agreement agreement) {
		return agreementService.agreementUpdate(agreement);
	}
	/**删除合同**/
	@RequestMapping("agreementDel.do")
	@ResponseBody
	public boolean agreementDel(Integer aId) {
		return agreementService.agreementDel(aId);
	}
}
