package test1;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainStored {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory sessions=new Configuration().configure().buildSessionFactory();
		Session session=sessions.openSession();
		
		Transaction tx=session.beginTransaction();
		
		Employee ramesh=new Employee();
		ramesh.setEmployeeSSN(1001);
		ramesh.setFirstName("ramesh");
		ramesh.setLastName("kumar");
		ramesh.setSalary(15000);
		ramesh.setDepartment("MS");
		session.save(ramesh);
		
		
		Employee suresh=new Employee();
		suresh.setEmployeeSSN(1002);
		suresh.setFirstName("suresh");
		suresh.setLastName("kumar");
		suresh.setDepartment("CSE");
		suresh.setSalary(12000);
		session.save(suresh);
		
		Query query = session.getNamedQuery("empDetails");
		List<Employee> allFoos = query.list();
		System.out.println("hekkkooooo"+allFoos.size());
		for (Employee employee : allFoos) {
			System.out.println(employee.getFirstName());
		}
		tx.commit();
		session.close();

	}

}
