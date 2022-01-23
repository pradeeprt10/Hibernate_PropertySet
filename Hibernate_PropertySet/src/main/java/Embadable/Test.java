package Embadable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		SessionFactory ssf = new Configuration().configure("Embed_hibernate.xml").buildSessionFactory();

		Session ss = ssf.openSession();
		Transaction tr = ss.beginTransaction();

		Course cc = new Course();
		cc.setFees(9999);
		cc.setName("Android");
		Std_hibernate hst = new Std_hibernate();
		hst.setStdid(500);
		hst.setPancard("AABBCC123");
		hst.setStdname("Hari");
		hst.setCour(cc);
		ss.save(hst);
		tr.commit();
		ss.close();
		System.out.println(ssf);
	}

}
