package onetomany;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Hi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessions=
				new Configuration().configure().buildSessionFactory();
		Session session=sessions.openSession();
		Transaction tx=session.beginTransaction();
		
		Category c = new Category();
		c.setCatId(123);
		c.setCatName("mobiles");
		
		Category c1 = new Category();
		c1.setCatId(789);
		c1.setCatName("Lipsticks");
		
		Items i = new Items();
		i.setItemId(234);
		i.setItemName("samsung");
		
		
		Items i1 = new Items();
		i1.setItemId(456);
		i1.setItemName("apple");
		
		
		Items i3 = new Items();
		i3.setItemId(198);
		i3.setItemName("MAC");
		
		
		Items i4 = new Items();
		i4.setItemId(623);
		i4.setItemName("ELF");
		
		Set<Items> s = new HashSet<Items>();
		s.add(i);
		s.add(i1);
		
		Set<Items> s1 = new HashSet<Items>();
		s1.add(i3);
		s1.add(i4);
		
		/*Set<Category> cat = new HashSet<Category>();
		cat.add(c);
		cat.add(c1);
		
		c.setItemList(s);
		c.setItemList(s1);*/
		
		i.getcList().add(c);
		i1.getcList().add(c);
		i3.getcList().add(c1);
		i4.getcList().add(c1);
		
		/*c.getItemList().add(i);
		c.getItemList().add(i1);
		c1.getItemList().add(i3);
		c1.getItemList().add(i4);*/
		
		//session.save(c);
		//session.save(c1);
		//session.save(i3);
		//session.save(i4);
		
		//session.save(cat);
		
//		session.save(c1);
		session.save(i);
		session.save(i1);
		session.save(i3);
		session.save(i4);
		
		/*session.delete(i);
		session.delete(i1);*/
		tx.commit();
		session.close();
	}

}
