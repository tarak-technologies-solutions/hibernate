package controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Student;

public class StudentRegServlet extends HttpServlet {
	SessionFactory sf;

	@Override
	public void init(ServletConfig config) throws ServletException {

		Configuration cfg = new Configuration();
		cfg.configure("resources/mysql.cfg.xml");
		sf = cfg.buildSessionFactory();
		System.out.println("session factory init");

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		int marks = Integer.parseInt(req.getParameter("marks"));

		Student st = new Student(0, name, email, marks);

		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		int pk = (Integer) session.save(st);
		transaction.commit();
		session.close();
		resp.getWriter().println("reg succes id="+pk);
	
	
	}

	@Override
	public void destroy() {
		sf.close();
	}

}
