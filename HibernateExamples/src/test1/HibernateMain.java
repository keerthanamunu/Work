package test1;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;

public class HibernateMain {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		SessionFactory sessions=new Configuration().configure().buildSessionFactory();
		Session session=sessions.openSession();
		
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
		session.save(keerthana);
		
		System.out.println("before call");
		Query query = session.createSQLQuery("CALL getEmp()").addEntity(Employee.class);
		List<Employee> allFoos = query.list();
		for (Employee employee : allFoos) {
			System.out.println(employee.getFirstName());
		}
		System.out.println("after call");
		
		//for making the object to detached
		//session.evict(keerthana);
		//keerthana.setFirstName("chandra");
		
		
		//session.delete(keerthana);
		tx.commit();
		session.close();
		
		//session.clear();
		
		//Session session1=sessions.openSession();
		//Transaction tx1=session1.beginTransaction();
		
		
		//System.out.println("IDDDDDDDDDDDDDD "+id);
		
		/*Query query = (Query) session.createQuery("from Employee");
		List<Employee> l = query.list();
		for (Employee employee : l) {
			System.out.println(employee.getFirstName()+"  "+ employee.getLastName());
		}
		*/
		
		
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
		/*
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
		
		/**/
		
		/*Criteria ctr = session1.createCriteria(Employee.class).addOrder(Order.asc("lastName"));
		List<Employee> l = ctr.list();
		for (Employee employee : l) {
			System.out.println(employee.getFirstName()+"  "+ employee.getLastName());}*/
		
		/*Criteria ctr = session1.createCriteria(Employee.class)
				.setProjection(Projections.avg("salary"));
				//addOrder(Order.asc("lastName"));
		
		List l = ctr.list();
		System.out.println(l.toString());
		tx1.commit();
		session1.close();*/
		
	
	}

}
