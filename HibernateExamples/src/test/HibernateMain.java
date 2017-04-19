package test;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateMain {

	public static void main(String[] args) {
		SessionFactory sessions=new Configuration().configure().buildSessionFactory();
		Session session=sessions.openSession();
		Session session1=sessions.openSession();
		Session session2=sessions.openSession();
		Session session3=sessions.openSession();
		Session session4=sessions.openSession();
		Transaction tx=session.beginTransaction();
		
		
		
		Employee ramesh=new Employee();
		ramesh.setEmployeeSSN(1001);
		ramesh.setFirstName("ramesh");
		ramesh.setLastName("kumar");
		ramesh.setSalary(15000);
		ramesh.setDepartment("MS");
		
		
		Employee suresh=new Employee();
		suresh.setEmployeeSSN(1002);
		suresh.setFirstName("suresh");
		suresh.setLastName("kumar");
		suresh.setDepartment("CSE");
		suresh.setSalary(12000);
		session.save(suresh);
		
		Employee keerthana=new Employee();
		keerthana.setEmployeeSSN(1003);
		keerthana.setFirstName("keerthana");
		keerthana.setLastName("g");
		keerthana.setDepartment("MS");
		keerthana.setSalary(20000);
		//int id=(int)session.save(keerthana);
		
		session.save(ramesh);
		session.save(suresh);
		session1.save(suresh);
		
		
		tx.commit();
		session.evict(keerthana);
		keerthana.setFirstName("chandra");
		
		
		//session.delete(e);
		
		//session.clear();
		
		session.close();
		
		
		//System.out.println("IDDDDDDDDDDDDDD "+id);
		/*Query query = (Query) session.createQuery("from Employee");
		List<Employee> l = query.list();
		for (Employee employee : l) {
			System.out.println(employee.getFirstName()+"  "+ employee.getLastName());
		}*/
		
		
		
		/*
		Query query =session.createQuery("select e.salary from Employee e"
				+" where e.lastName like :ln")
				.setString("ln", "kumar");*/
		/*List<Employee> l = query.list();
		for (Employee employee : l) {
			System.out.println(employee.getFirstName()+"  "+ employee.getLastName());
		}*/
		
		/*ScrollableResults rs = query.scroll();
		while(rs.next())
		{
			System.out.println(rs.get(0));
		}
		
		
		Query q = session.createQuery("select count(*) from Employee");
		ScrollableResults rs1 = query.scroll();
		while(rs1.next())
		{
			System.out.println(rs1.get(0));
		}*/
		/*Session session1=sessions.openSession();
		Transaction tx1=session1.beginTransaction();
		harshada.setEmployeeSSN(id);
		harshada.setFirstName("Harshadaaaaa");
		harshada.setLastName("g");
		harshada.setDepartment("CSE");
		harshada.setSalary(1800);
		session1.saveOrUpdate(harshada);
		
		
		
		//session1.delete(Employee.class);
		System.out.println("newwwwwwwwwwwwwwwwwwww");
		Employee e=(Employee)session1.get(Employee.class,new Integer(id));
		System.out.println(e.getDepartment());
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@");
		*/
		
		/*tx1.commit();
		session1.close();*/
		
		
		
	
	}

}
