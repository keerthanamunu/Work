package onetomany;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Client{

	public static void main(String []a){

		SessionFactory sf=null;
		Session session=null;
		Transaction tr=null;
		try{
			sf=HibernateUtil.getSessionFactory();
			session=sf.openSession();
			tr=session.beginTransaction();

			Department javaDepartment=new Department(1001,"chennai","java");
			
			Employee ramesh=new Employee("ramesh kumar",1,"java");
			Employee suresh=new Employee("suresh kumar",2,"java");
			Employee dhinesh=new Employee("dhinesh kumar",3,"java");
			ramesh.setDepartment(javaDepartment);
			suresh.setDepartment(javaDepartment);
			dhinesh.setDepartment(javaDepartment);

			Set <Employee>employeeSet=new HashSet<Employee>();
			employeeSet.add(ramesh);
			employeeSet.add(suresh);
			employeeSet.add(dhinesh);
			
			javaDepartment.setEmployees(employeeSet);
			Integer departmentId=(Integer)session.save(javaDepartment);
			System.out.println(departmentId);
			tr.commit();
			
			tr=session.beginTransaction();
			sf=HibernateUtil.getSessionFactory();
			session=sf.openSession();
			//Department depObj = (Department)session.get(Department.class, 1001);
			
			//System.out.println(depObj.getLocation()+"Location");
			System.out.println("before Employeeee object");
			
			Employee empObj =(Employee)session.get(Employee.class, new Integer(1));
			
			
			System.out.println("DepartmentName "+empObj.getDepartment().getName());
			
			System.out.println("before list");
			/*System.out.println("***************LIST **************");
			List l1= session.createQuery("from Department where departmentId="+1001).list();
			System.out.println("after retreiving department");
			Department department=null;
			for( int i=0;i<l1.size();i++)
			{
				department=(Department)l1.get(i);
				Set <Employee>Employeelist=department.getEmployees();
				for(Employee employee : Employeelist){
					System.out.println(employee.getStaffName()+", "+employee.getSpecialization());
				}
			}*/
			
			
			session.close();
			tr.commit();
		}

		catch(Exception e){
			System.out.println(e +"  Error with insert block");
			session.close();
		}
	}
}