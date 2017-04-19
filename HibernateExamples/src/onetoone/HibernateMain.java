package onetoone;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateMain {

	public static void main(String[] args) {
		SessionFactory sessions=
				new Configuration().configure().buildSessionFactory();
		Session session=sessions.openSession();
		Transaction tx=session.beginTransaction();

		Address a = new Address();
		a.setAddressId(345);
		a.setCity("hyd");
		a.setState("Telangana");
		
		
		Employee e=new Employee();
		e.setEmpId(123);
		e.setEmpName("keerthana");
		e.setAddress(a);
		
		//a.setEmp(e);
		
		session.save(e);
		tx.commit();
		session.close();
	
	}

}
