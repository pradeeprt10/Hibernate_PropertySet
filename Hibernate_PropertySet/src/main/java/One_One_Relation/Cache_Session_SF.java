package One_One_Relation;
import org.hibernate.cache.ehcache.internal.EhcacheRegionFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

public class Cache_Session_SF {

	public static void main(String[] args) {
 		
		SessionFactory sf = new Configuration().configure("One-One.xml").buildSessionFactory();
		Session ss = sf.openSession();
		// Session Cache - start
		System.out.println("===== 1st Session========");
		Question question = ss.get(Question.class, 100);
		System.out.println(question.getQst());
		System.out.println(question.getQstid());
		System.out.println(question.getAns());
		System.out.println("==============");
		//When we retrieve same object then it will not hit from DB and it will retrieve from Session cache
		Question question1 = ss.get(Question.class, 101);
		System.out.println(question1.getQst());
		System.out.println(question1.getQstid());
		System.out.println(question1.getAns());
		// Session Cache - end
		ss.close();
		System.out.println("===== 2nd Session========");
		Session ss1 = sf.openSession();
		Question question2 = ss1.get(Question.class, 101);
		System.out.println(question2.getQst());
		System.out.println(question2.getQstid());
		System.out.println(question2.getAns());
		ss1.close();
		sf.close();

	}

}
