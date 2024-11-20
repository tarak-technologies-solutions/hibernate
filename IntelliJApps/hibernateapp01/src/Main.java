import com.taraktech.entities.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        Configuration configuration = new Configuration();
        configuration.configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Employee employee2 = new Employee();
        employee2.setEno(222);
        /*
        Transaction transaction = session.beginTransaction();


        Employee employee1 = new Employee();
        employee1.setEno(111);
        employee1.setEname("Tarak");
        employee1.setEsal(60000F);
        employee1.setEaddr("CVM");

        Employee employee2 = new Employee();
        employee2.setEno(222);
        employee2.setEname("Amar");
        employee2.setEsal(100000F);
        employee2.setEaddr("CVM");

        Employee employee3 = new Employee();
        employee3.setEno(333);
        employee3.setEname("Lally");
        employee3.setEsal(45000F);
        employee3.setEaddr("CVM");

        Employee employee4 = new Employee();
        employee4.setEno(444);
        employee4.setEname("Saroja");
        employee4.setEsal(30000F);
        employee4.setEaddr("CVM");

        Integer primaryValue = (Integer) session.save(employee1);
        session.persist(employee2);
        session.saveOrUpdate(employee3);
        session.persist(employee4);

        transaction.commit();
*/
        Employee employee = (Employee) session.get(Employee.class,222);
        if (employee== null){
            System.out.println("Employee record not exits");
        }else {
            System.out.println(employee.getEno());
            System.out.println(employee.getEname());
            System.out.println(employee.getEsal());
            System.out.println(employee.getEaddr());
        }
        session.close();
        sessionFactory.close();
    }
}