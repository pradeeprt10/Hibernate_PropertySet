package One_Many_Relation;

import java.util.List;




import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Testing_HQL_DML {

	public static void main(String[] args) {
		SessionFactory ssf = new Configuration().configure("One-Many.xml").buildSessionFactory();

//		Session ss = ssf.openSession();
//		Transaction tr = ss.beginTransaction();	
//		tr.commit();

		// select Stement - no need Transaction object ------------------- Start
		// Hard Coded value 101
		// Query qry = ss.createQuery("from Emp_Hib where emp_id=101");
//		Query qry = ss.createQuery("from Emp_Hib where emp_id=:x");
//		qry.setParameter("x", 101);
//		List<Emp_Hib> em = qry.list();
//		for (Emp_Hib emp : em) {
//			System.out.println(emp.getEmp_name());
//			System.out.println(emp.getEmp_id());
//			System.out.println(emp.getProj());
//		}
		// select Statement ---------------------------------------------End
		
		// Update statement ---------------------------------------- Start
//		Session ss = ssf.openSession();
//		Transaction tr = ss.beginTransaction();
//		Query qr = ss.createQuery("update Emp_Hib set emp_name=:x where emp_id=:y");
//		qr.setParameter("x", "Pradeep");
//		qr.setParameter("y", 100);
//		int count = qr.executeUpdate();		
//		System.out.println(count);
//		// Update statement ------------------------------------------- End
		
		// Delete statement ---------------------------------------- Start
		Session ss = ssf.openSession();
		Transaction tr = ss.beginTransaction();
		//Query qr = ss.createQuery("delete from Emp_Hib where emp_id=:x");
		Query qr = ss.createQuery("delete from Emp_Hib where emp_id=:x");
		qr.setParameter("x", 101);
		int count = qr.executeUpdate();		
		System.out.println(count);
		// Dpdate statement ------------------------------------------- End
		
		tr.commit();
		ss.close();
		ssf.close();

	}

}
