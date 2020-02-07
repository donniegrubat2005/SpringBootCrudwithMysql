package com.example.SpringBootCrudwithMysql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.SpringBootCrudwithMysql.model.Employee;
import com.example.SpringBootCrudwithMysql.services.EmployeeService;

@Controller
public class HomeController {
	
    @Autowired
	private EmployeeService service;
	
    @RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView employeeList() 
	{
		ModelAndView model=new ModelAndView("index");
		List<Employee> list=service.listAll();
		model.addObject("employeelist",list);
		
		return model;
	}
    
    @RequestMapping(value="/create", method = RequestMethod.GET)
    public ModelAndView createEmployee() 
    {
    	ModelAndView model = new ModelAndView("create");
    	Employee employee =new Employee();
    	model.addObject("employee", employee);	
    	
    	return model;
    }
    
    @RequestMapping(value="/save", method=RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("employee") Employee employee) 
	{
		service.save(employee);		
		return new ModelAndView("redirect:/");
	}
    
    @RequestMapping(value="/update/{id}", method=RequestMethod.GET)
	public ModelAndView update(@PathVariable("id") Long id) 
	{
		ModelAndView model=new ModelAndView("create");
		Employee employee=service.getById(id);
		model.addObject("employee",employee);
		
		return model;
	}
    
    @RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
	public ModelAndView delete(@PathVariable("id") Long id) 
	{
		service.delete(id);
		return new ModelAndView("redirect:/");
	}
    
    
}
