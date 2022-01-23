package Many_Many;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test_Many_Many {
	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure("Many_Many.xml").buildSessionFactory();

		Address_Many_Many ad = new Address_Many_Many();
		ad.setAddress_id(1000);
		ad.setAddress_name("CTC");
		Address_Many_Many ad1 = new Address_Many_Many();
		ad1.setAddress_id(1001);
		ad1.setAddress_name("BBSR");
		Address_Many_Many ad2 = new Address_Many_Many();
		ad2.setAddress_id(1002);
		ad2.setAddress_name("RKL");
		Address_Many_Many ad3 = new Address_Many_Many();
		ad3.setAddress_id(1003);
		ad3.setAddress_name("BHMPUR");
		// Student 1
		Student_Many_Many st1 = new Student_Many_Many();
		st1.setStd_id(500);
		st1.setStd_name("Pradeep");
		List<Address_Many_Many> ls1 = new ArrayList<Address_Many_Many>();
		ls1.add(ad1);
		ls1.add(ad2);
		st1.setAdd(ls1);
		// Student 2
		Student_Many_Many st2 = new Student_Many_Many();
		st2.setStd_id(501);
		st2.setStd_name("Pinki");
		List<Address_Many_Many> ls2 = new ArrayList<Address_Many_Many>();
		ls2.add(ad);
		ls2.add(ad2);
		st2.setAdd(ls2);
		// Student 3
		Student_Many_Many st3 = new Student_Many_Many();
		st3.setStd_id(502);
		st3.setStd_name("Pramod");
		List<Address_Many_Many> ls3 = new ArrayList<Address_Many_Many>();
		ls3.add(ad1);
		ls3.add(ad3);
		st3.setAdd(ls3);
		// Student 4
		Student_Many_Many st4 = new Student_Many_Many();
		st4.setStd_id(503);
		st4.setStd_name("Dilip");
		List<Address_Many_Many> ls4 = new ArrayList<Address_Many_Many>();
		ls4.add(ad);
		ls4.add(ad2);
		ls4.add(ad3);
		st4.setAdd(ls4);

		// Address
		List<Student_Many_Many> la1 = new ArrayList<Student_Many_Many>();
		la1.add(st2);
		la1.add(st4);
		ad.setStd(la1);
		// Address1
		List<Student_Many_Many> la2 = new ArrayList<Student_Many_Many>();
		la2.add(st1);
		la2.add(st3);
		ad1.setStd(la2);
		// Address1
		List<Student_Many_Many> la3 = new ArrayList<Student_Many_Many>();
		la3.add(st1);
		la3.add(st2);
		la3.add(st4);
		ad2.setStd(la3);
		// Address1
		List<Student_Many_Many> la4 = new ArrayList<Student_Many_Many>();
		la4.add(st3);
		la4.add(st4);
		ad3.setStd(la4);

		// Getting Session and Trasaction process
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		ss.save(ad);
		ss.save(ad1);
		ss.save(ad2);
		ss.save(ad3);
		ss.save(st1);
		ss.save(st2);
		ss.save(st3);
		ss.save(st4);

		tr.commit();

		ss.close();

		Session ss1 = sf.openSession();
		Student_Many_Many stdd = (Student_Many_Many) ss1.get(Student_Many_Many.class, 503);

		System.out.println(stdd.getStd_name());
		System.out.println(stdd.getStd_id());

		for (Address_Many_Many addd : stdd.getAdd()) {
			System.out.println(addd.getAddress_name());
			System.out.println(addd.getAddress_id());

		}

		sf.close();

	}

}
