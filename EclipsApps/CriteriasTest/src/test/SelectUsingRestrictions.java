package test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import beans.Employee;

public class SelectUsingRestrictions {
public static void main(String[] args) {
	
	Configuration cfg=new Configuration();
	cfg.configure("resources/oracle.cfg.xml");
	SessionFactory sf=cfg.buildSessionFactory();
	
	Session session=sf.openSession();
	
	Criteria c=	session.createCriteria(Employee.class);
	
			//where =
	//Criterion cr=Restrictions.eq("id", 111);
	//where >
	Criterion cr=Restrictions.gt("salary",70000);
	c.add(cr);
		List<Employee>	emplist=c.list();
		for(Employee emp:emplist) 
	System.out.println(emp.getName()+";"+emp.getEmail());
}
}
