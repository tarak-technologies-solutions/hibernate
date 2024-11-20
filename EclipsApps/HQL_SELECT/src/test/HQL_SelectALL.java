package test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Employee;

public class HQL_SelectALL {
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("resources/oracle.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
	
		String hql="from Employee";
		Query q=session.createQuery(hql);	
		List<Employee> list=	q.list();
		for(Employee emp:list)
		{
			System.out.println("====================================");
				System.out.println("ID:"+emp.getId());
				System.out.println("NAME:"+emp.getName());
				System.out.println("EMAIL:"+emp.getEmail());
				System.out.println("SALARY:"+emp.getSalary());
		}
		session.close();
		sf.close();
	}
}
