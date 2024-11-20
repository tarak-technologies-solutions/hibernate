package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import beans.Student;

public class GetDataServlet extends HttpServlet {

	SessionFactory sf;

	@Override
	public void init(ServletConfig config) throws ServletException {
		Configuration cfg = new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		sf = cfg.buildSessionFactory();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		Session s = sf.openSession();
		int fr = Integer.parseInt(req.getParameter("fr"));
		int mr = Integer.parseInt(req.getParameter("mr"));

		Criteria cr = s.createCriteria(Student.class);
		cr.setFirstResult(fr);
		cr.setMaxResults(mr);
		
		List<Student> list = cr.list();
		for (Student st : list) {
			out.println("ID=" + st.getId() + "\t NAME=" + st.getName()
					+ "\t email=" + st.getEmail() + "\t marks=" + st.getMarks());

		}

		s.close();

	}

	@Override
	public void destroy() {
		sf.close();
		super.destroy();
	}

}
