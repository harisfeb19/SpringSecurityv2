package com.haris.demo.controller;

import java.security.Principal;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import com.haris.demo.model.*;
import com.haris.demo.dao.*;

@Controller
public class EmpController {

	@Autowired
	EmpDao dao;

	@RequestMapping("/")
	public String home() {
		return "home.jsp" ;
	}
	@RequestMapping("/login")
	public String loginPage() {
		
		return "login.jsp";
	}
	
	@RequestMapping("/logout-success")
	public String logoutPage() {
		
		return "logout.jsp";
	}

	@RequestMapping("/AddEmployees")
	public ModelAndView AddEmployees(Employee emp) {

		ModelAndView mv = new ModelAndView("home.jsp");
		dao.save(emp);
		return mv;
	}

	@ResponseBody
	@PostMapping(path = "/emp")
	public Employee Add(@RequestBody Employee emp) {
		dao.save(emp);
		return emp;
	}

	@ResponseBody
	@DeleteMapping("/emp/{id}")
	public String delete(@PathVariable int id) {

		Employee emp = dao.getOne(id);
		if (emp == null) throw new EmployeeNotFoundException();
		dao.delete(emp);
		return "Record Deleted Sucessfully";
	}

	@ResponseBody
	@PutMapping(path = "/emp")
	public Employee Update(@RequestBody Employee emp) {
		dao.save(emp);
		return emp;
	}

	@RequestMapping(value = "/view")
	public ModelAndView View(@RequestParam int id) {
			ModelAndView mv = new ModelAndView("showemp.jsp");
			Employee employee = dao.findById(id).orElse(null);	
			//if (employee == null) throw new EmployeeNotFoundException();
			mv.addObject(employee);
			return mv;
	}

	@RequestMapping(value = "/delete")
	public ModelAndView DeleteEmp(@RequestParam int id) {
		ModelAndView mv = new ModelAndView("showemp.jsp");
		Employee employee = dao.getOne(id);
		dao.delete(employee);
		mv.addObject(employee);
		return mv;
	}
	
	@SuppressWarnings("serial")
	@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="No such Employee")  // 404
	 public class EmployeeNotFoundException extends RuntimeException {
	     // ...
	 }


	@RequestMapping("/emp")
	@ResponseBody
	public List<Employee> getEmployees() {

		return dao.findAll();
	}

	@RequestMapping("/emp/{id}")
	@ResponseBody
	public Optional<Employee> getEmployee(@PathVariable("id") int id) {

		return dao.findById(id);
	}
	


	  @RequestMapping(value = "/user")
	  @ResponseBody public String currentUserName(Principal principal) {
	  String getuname = principal.getName(); 
	  return getuname;
	  }
	  
		/*
		 * @RequestMapping("user")
		 * 
		 * @ResponseBody public Principal user(Principal principal) {
		 * 
		 * return principal; }
		 */
		/*
		 * //@RequestMapping(value="/login") public ModelMap printUser(ModelMap model) {
		 * 
		 * User user =
		 * (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		 * String name = user.getUsername(); //get logged in username
		 * 
		 * return model.addAttribute("username", name);
		 * 
		 * }
		 */
		/*
		 * @RequestMapping("/getEmployees") public ModelAndView
		 * getEmployees(@RequestParam int id) {
		 * 
		 * ModelAndView mv = new ModelAndView("showemp.jsp");
		 * 
		 * Employee employee = dao.findById(id).orElse(null);
		 * 
		 * System.out.println(dao.findByDesignation("Software"));
		 * mv.addObject(employee);
		 * 
		 * return mv; }
		 */
		// @RequestMapping(path ="/emp" , produces = {"application/xml"}) For Support
		// Xml Only
	  
		/*
		 * @Autowired UserRepository userR;
		 * 
		 * @GetMapping("/user") public ModelAndView
		 * currentUser(@ModelAttribute("User") @Valid UserRepository uname) {
		 * 
		 * ModelAndView mv = new ModelAndView("user.jsp"); Authentication loggedInUser =
		 * SecurityContextHolder.getContext().getAuthentication(); String username =
		 * loggedInUser.getName();
		 * 
		 * 
		 * User user = userR.findByUsername(username); String name = user.getUsername();
		 * 
		 * mv.addObject(username); return mv;
		 * 
		 * }
		 */	
	 

}
