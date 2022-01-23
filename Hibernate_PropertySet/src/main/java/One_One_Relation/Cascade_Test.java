package One_One_Relation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Cascade_Test {

	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration().configure("One-One.xml").buildSessionFactory();
		Answer ans = new Answer();
		ans.setAnsid(501);
		ans.setAns("Question");
		Question qt = new Question();
		qt.setQstid(103);
		qt.setQst("Ans");
		qt.setAns(ans);
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		ss.save(qt);
		//We are not saving Answer object but will save the Answer object for Cascade Mapping in the one-one relation.
		tr.commit();
		ss.close();
		sf.close();
		

	}

}
