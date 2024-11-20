package test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import beans.Employee;

public class AgregateFunctionUsingProjects {
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("resources/oracle.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Criteria c = session.createCriteria(Employee.class);
		/*Projection p=Projections.avg("salary");
			c.setProjection(p);
			double avg_salary=(Double)c.uniqueResult();
			System.out.println(avg_salary);*/
	
//		Projection p=Projections.max("salary");
//		c.setProjection(p);
//		int hi_salary=(Integer)c.uniqueResult();
//		System.out.println(hi_salary);
		
		
		Projection p=Projections.sum("salary");
		c.setProjection(p);
		long sum_salary=(Long)c.uniqueResult();
		System.out.println(sum_salary);
	}
}
