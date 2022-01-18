package com.javatpoint.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javatpoint.dto.Employee;
import com.javatpoint.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService EmployeeService;

	@RequestMapping("/test")
	public String test() {
		return "index";
	}

	@RequestMapping("/addEmployee")
	public String addStaff(Model model) 
	{
		Employee newEmployee = new Employee();
		model.addAttribute("newEmployee", newEmployee);
		return "AddEmployee";
	}

	@RequestMapping("/insertEmployeeDB")
	public String insertStaffDB(HttpServletRequest req, Model mymodel,
			@ModelAttribute("newEmployee") Employee newEmployee) {
		Boolean b = EmployeeService.addEmployeeDB(newEmployee);
		if (b) {
			return "redirect:index";
		} else {
			return "redirect:index";
		}

	}

}
