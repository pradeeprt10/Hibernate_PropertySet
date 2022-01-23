package One_One_Relation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure("One-One.xml").buildSessionFactory();

		Answer ans = new Answer();
		ans.setAnsid(502);
		ans.setAns("Spring is Framework which give fexibity to programmer for better coding");
		Question qt = new Question();
		qt.setQstid(102);
		qt.setQst("What is Spring");
		qt.setAns(ans);
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		ss.save(qt);
		ss.save(ans);
		tr.commit();
		ss.close();

		// second transaction
		Answer ans2 = new Answer();
		ans2.setAnsid(503);
		ans2.setAns("Hibernate is ORM Tool");
		Question qt2 = new Question();
		qt2.setQstid(101);
		qt2.setQst("What is Hibernate");
		qt2.setAns(ans2);

		Session ss2 = sf.openSession();
		Transaction tr2 = ss2.beginTransaction();
		ss2.save(qt2);
		ss2.save(ans2);
		tr2.commit();
		ss2.close();
		sf.close();
		System.out.println(qt);
		System.out.println(qt2);

	}

}
