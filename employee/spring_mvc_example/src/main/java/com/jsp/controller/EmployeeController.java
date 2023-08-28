package com.jsp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.dao.EmployeeDao;
import com.jsp.dto.Employee;

@RestController
public class EmployeeController {
	// autowiring
	@Autowired
	EmployeeDao dao;
	// request mapping
	// new comment
	@RequestMapping("/emp")
	public ModelAndView getEmployee()
	{
		ModelAndView view = new ModelAndView();
		view.addObject("employee", new Employee());
		view.setViewName("create.jsp");
		return view;
	}
	
	@RequestMapping("/save")
	public String saveEmployee(@ModelAttribute Employee employee)
	{
		dao.saveEmployee(employee);
		return "employee details added ";
	}
	
	@RequestMapping("/search")
	public ModelAndView searchEmployee()
	{
		ModelAndView view = new ModelAndView();
		view.addObject("employee", new Employee());
		view.setViewName("get.jsp");
		return view;
	}
	
	@RequestMapping("view")
	public ModelAndView findEmp(@ModelAttribute Employee employee)
	{
			ModelAndView view = new ModelAndView();
			Employee emp = dao.getEmployeeById(employee.getId());
			view.addObject("employee", emp);
			view.setViewName("display.jsp");
			return view;
	}
	
	@RequestMapping("/update")
	public ModelAndView updateEmployee() {
		ModelAndView view=new ModelAndView();
		view.addObject("employee", new Employee());
		view.setViewName("update.jsp");
		return view;
	}
	
	@RequestMapping("/edit")
	public String updateEmployee(@ModelAttribute Employee employee) {
		dao.updateEmployee(employee);
		return "Employee details updated";
	}
	
	@RequestMapping("/deleteemp")
	public ModelAndView deleteEmployee() {
		ModelAndView view=new ModelAndView();
		view.addObject("employee",new Employee());
		view.setViewName("delete.jsp");
		return view;
	}
	
	@RequestMapping("/delete")
	public String deleteEmployee(@ModelAttribute Employee employee) {
		dao.deleteEmployee(employee.getId());
		return "Employee details deleted";
	}
	
	@RequestMapping("/getemp")
	public ModelAndView getAllStudents() {
		ModelAndView view=new ModelAndView();
		view.addObject("employeelist",dao.getAllEmployee());
		view.setViewName("displayAll.jsp");
		return view;
	}
	
	
}
