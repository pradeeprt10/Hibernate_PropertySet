package One_Many_Relation;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		SessionFactory ssf = new Configuration().configure("One-Many.xml").buildSessionFactory();
	
		project p1 = new project();
		p1.setProj_id(10);
		p1.setProj_name("Emerson1");
		project p2 = new project();
		p2.setProj_id(11);
		p2.setProj_name("Emerson2");
		project p3 = new project();
		p3.setProj_id(12);
		p3.setProj_name("Emerson3");
		project p4 = new project();
		p4.setProj_id(13);
		p4.setProj_name("Emerson4");
		
		List<project> list1= new ArrayList<project>();
		list1.add(p1);
		list1.add(p2);	
		
		Emp_Hib emp1 = new Emp_Hib();
		emp1.setEmp_id(102);
		emp1.setEmp_name("Pradeep_Rout");
		emp1.setProj(list1);
		p1.setEmpl(emp1);
		p2.setEmpl(emp1);
		
		List<project> list2= new ArrayList<project>();
		list1.add(p3);
		list1.add(p4);
		list1.add(p2);
		
		Emp_Hib emp2 = new Emp_Hib();
		emp2.setEmp_id(103);
		emp2.setEmp_name("Pradeep_Rout1");
		emp2.setProj(list2);
		p3.setEmpl(emp2);
		p4.setEmpl(emp2);
		//p2.setEmpl(emp2);
	 
		Session ss = ssf.openSession();
		Transaction tr = ss.beginTransaction();				
		ss.save(emp1);
		ss.save(emp2);
		ss.save(p1);
		ss.save(p2);
		ss.save(p3);
		ss.save(p4);	
		tr.commit();
		ss.close();		
		System.out.println(p2.getProj_name());
		System.out.println(p3.getProj_name());

	}
}
