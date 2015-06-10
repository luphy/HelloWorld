package com.sharemarking.helloworld.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.sharemarking.helloworld.service.EmployeeManager;

public class EmployeeController implements Controller {

	private EmployeeManager employeeManager;
	
	public EmployeeManager getEmployeeManager() {
		return employeeManager;
	}
	
	public void setEmployeeManager(EmployeeManager employeeManager) {
		this.employeeManager = employeeManager;
	}
	
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("in EmployeeController");
		ModelAndView mv = new ModelAndView("employeeList");
		mv.addObject("employeeList", this.employeeManager.getEmployeeList());
		return mv;
	}

}
