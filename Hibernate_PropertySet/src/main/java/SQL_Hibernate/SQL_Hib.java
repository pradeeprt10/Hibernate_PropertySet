package SQL_Hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

import One_Many_Relation.Emp_Hib;

public class SQL_Hib {

	public static void main(String[] args) {

		SessionFactory ssf = new Configuration().configure("One-Many.xml").buildSessionFactory();
		Session ss = ssf.openSession();
		String sql= "select * from emp_hib where emp_id=101";
		NativeQuery crtQry = ss.createSQLQuery(sql);
		List<Object[]> lis= crtQry.list();
		for(Object[] row : lis){
			Emp_Hib ob = new Emp_Hib();
			System.out.println(row[0].toString());
			System.out.println(row[1].toString());	
			
		}
			
		ss.close();
		ssf.close();

	}

}
