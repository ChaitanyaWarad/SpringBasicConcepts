package com.javatpoint.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javatpoint.model.Student;
import com.javatpoint.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	StudentService studentService;

	@RequestMapping("/hello")
	public String helloworld() {
		return "helloWorld";
	}
	
	@RequestMapping("/studentDashBoardPage")
	public String StudentDashBoardPage() {
		return "StudentDashBoardPage";
	}
	
	@RequestMapping("/addStudent")
	public String addStudent(Model model) {
		Student stu=new Student();
		model.addAttribute("student",stu);
		return "AddStudent";
	}
	
	@RequestMapping(value = "/addStudentInDB", method = RequestMethod.POST)
	public String addStudentInDB(@ModelAttribute("student") Student stu, Model myModel) {
		boolean b = studentService.addStudentInDB(stu);
		if (b) {
			myModel.addAttribute("message", "Student Inserted");
			return "success";
		} else {
			myModel.addAttribute("message", "Student Not Inserted");
			return "fail";
		}
	}
	
	@RequestMapping(value="/getALlStudents")
	public String getALlStudents(Model model) {
		List<Student> stuList=studentService.getAllStudents();
		model.addAttribute("stuList",stuList);
		System.out.println(stuList);
		return "GetALlStudents";
	}
	
	@RequestMapping("/updatestudent")
	public String updatestudent(Model myModel, HttpServletRequest req) {
		int studentid = Integer.parseInt(req.getParameter("studentid"));
		Student student = studentService.getStudent(studentid);
		myModel.addAttribute("updatestudent", student);
		return "UpdateStudent";
	}
	
	@RequestMapping(value = "/updateStudentInDB")
	public String updateEmployeeInDB(@ModelAttribute("updatestudent") Student stu, Model myModel) {
		boolean b = studentService.updateStudentInDB(stu);
		if (b) {
			myModel.addAttribute("message", "Student Updated");
			return "success";
		} else {
			myModel.addAttribute("message", "Student Not Updated");
			return "fail";
		}
	}

}
