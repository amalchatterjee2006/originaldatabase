package dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import models.*;
import dao.employeeDAO;

@Service
public class EmployeeService {
		@Autowired
		employeeDAO pdao;
	
		public List<Employee> getAllEmployees()
		{
			return pdao.getAllEmployees();
		}
		
		@Transactional
		public void addEmployee(Employee employee)
		{  
			  pdao.addEmployee(employee);  
			 }  
		
		//@Transactional
	    public void updatePerson(Employee p) 
	    {
	        pdao.edit(p);
	    }
		
		
		
		
		@Transactional
		public void deleteEmployee(Employee employee) 
		    {  
			  pdao.deleteEmployee(employee);  
			 }  
		
}
