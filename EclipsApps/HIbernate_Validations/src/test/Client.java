package test;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Student;

public class Client {
public static void main(String[] args) {
	
	Configuration cfg=new Configuration();
	cfg.configure("resources/oracle.cfg.xml");
	SessionFactory sf=cfg.buildSessionFactory();
	Session ses=sf.openSession();
	Transaction t=ses.beginTransaction();
	
	
	Student st=new  Student();
	st.setId(222);
	st.setName("aaa");
	st.setEmail("aaa@gmail.com");
	st.setAddress("aaa");

	ValidatorFactory vf = Validation.buildDefaultValidatorFactory();
	Validator v = vf.getValidator();

	Set<ConstraintViolation<Student>> seterror = v.validate(st);

	if (!seterror.isEmpty()) {
		for (ConstraintViolation<Student> error : seterror) {
			System.out.println(error.getPropertyPath()+":=====:"+error.getMessage());
		}
	}
	else{
		
		ses.save(st);
		t.commit();
		
	}
	
	
	
	
}
}
