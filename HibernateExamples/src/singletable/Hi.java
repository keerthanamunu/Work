package singletable;

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
		
		Creditcard cc = new Creditcard();
		cc.setExpMonth("Jan");
		cc.setExpYear("2017");
		cc.setNumber("123456789");
		cc.setId(123);
		cc.setOwner("keerthana");
		//session.save(cc);
		
		BankAccount ba = new BankAccount();
		ba.setId(234);
		ba.setOwner("harshada");
		ba.setAccount("SAVING");
		ba.setBankName("ICICI");
		
		session.save(cc);
		session.save(ba);
		tx.commit();
		session.close();
	}

}
