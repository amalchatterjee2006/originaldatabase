package controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sun.javafx.collections.MappingChange.Map;

import dao.EmployeeService;
import models.*;

@Controller
public class HomeController 
{

	@Autowired
	EmployeeService p;
	@RequestMapping("/")
	public String showHome()
	{
		return "index";
	}
	
	@RequestMapping("productdetails")
	public ModelAndView showProducts()
	{
		ModelAndView mv=new ModelAndView("productdetails");
		List<Employee> employeeList=new ArrayList<Employee>();
		employeeList=p.getAllEmployees();
		mv.addObject("listfromtab",employeeList);
		return mv;
	}
	/*@RequestMapping("add")
	public ModelAndView showProducts1()
	{
		ModelAndView mv=new ModelAndView("add");
		List<Employee> employeeList=new ArrayList<Employee>();
		employeeList=p.getAllEmployees();
		mv.addObject("listfromtab",employeeList);
		return mv;
	}*/
	
	
	
	/*@RequestMapping(value="/em",method=RequestMethod.POST)
	public String doActions(@ModelAttribute Employee employee,BindingResult result,@RequestParam  String action,Map<String,object>map)
	{
		Employee e=new Employee();
		switch(action.toLowerCase())
		{
		case 1 :p.addEmployee(e);
		e=employee;
		
		map.put()
		
		
		case "edit":p.updatePerson(e);
		
			e=employee;
		case "delete":
			p.updatePerson(e);
			
			e=employee;
			
			
			
		}
	}*/

	@RequestMapping("/regis")
	public String showNextMessage() 
	{
			return "regis";
	}
	
	
	@RequestMapping("/back")
	public String showNextMessage1() 
	{
			return "intro";
	}
	
	@RequestMapping("add")
	public String shownext()
	{
		return "intro";
	}
	
	@RequestMapping("edit")
	public String shownext1()
	{
		return "Edit";
	}
	
	@RequestMapping("delete")
	public String shownext2()
	{
		return "delete";
	}
	
	@RequestMapping("form")
	public String shownext3()
	{
		return "spring";
	}
}