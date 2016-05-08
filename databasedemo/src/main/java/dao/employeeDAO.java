package dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import models.*;

@Repository
@Transactional
public class employeeDAO 
{

	@Autowired
  private	SessionFactory sessionFactory;
	
	public List<Employee> getAllEmployees()
	{
		Session session=sessionFactory.getCurrentSession();
		List<Employee> empList=session.createQuery(" from Employee").list();
		return empList;
	}
	
	//addtion form adding data
	 public void addEmployee(Employee p)
	 {  
		   sessionFactory.getCurrentSession().saveOrUpdate(p);  
     }  
		  
	
	//for updation
	  public void edit(Employee p) 
	    {
	     sessionFactory.getCurrentSession().update(p);  
	        //logger.info("Person updated successfully, Person Details="+p);
	    }
	 
	
	  public void deleteEmployee(Employee p)
	  {  
		  sessionFactory.getCurrentSession().createQuery("DELETE FROM Employee WHERE empid = "+p.getId()).executeUpdate();
		 // sessionFactory.getCurrentSession().delete(getId());
		  
		 }  

	    
	
}
