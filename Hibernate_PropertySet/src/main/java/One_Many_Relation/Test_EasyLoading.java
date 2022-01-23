package One_Many_Relation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test_EasyLoading {
	
	public static void main(String[] args) {
		
		SessionFactory ssf = new Configuration().configure("One-Many.xml").buildSessionFactory();
		
		Session ss = ssf.openSession();
		
		Emp_Hib ob = (Emp_Hib) ss.get(Emp_Hib.class,101);
		
		
		System.out.println(ob.getEmp_name());
		//System.out.println(ob.getProj().size());
		
	}
	

}
