package One_One_Relation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test_Hibernate_Obj_States {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure("One-One.xml").buildSessionFactory();

		Answer ans = new Answer();
		ans.setAnsid(500);
		ans.setAns("Spring is Framework which give fexibity to programmer for better coding");

		// Transient State
		Question qt = new Question();
		qt.setQstid(100);
		qt.setQst("What is Spring");
		qt.setAns(ans);
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		ss.save(qt);
		ss.save(ans);
		// Persitent state
		qt.setQst("What is Hibernate");

		tr.commit();
		ss.close();
		// Detached state
		sf.close();
		System.out.println(qt);
		// System.out.println(qt2);

	}

}
