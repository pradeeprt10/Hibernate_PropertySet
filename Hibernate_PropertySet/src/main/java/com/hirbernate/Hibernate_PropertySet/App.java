package com.hirbernate.Hibernate_PropertySet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory ssf= new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    	 /*
    	Session ss = ssf.openSession();
    	Transaction tr = ss.beginTransaction();
    	Hybernate_Student hst = new Hybernate_Student();
    	hst.setStdid(400);
    	hst.setName("Hari Omm");
    	hst.setAddress("BBSR");
    	ss.save(hst);
    	tr.commit();
    	ss.close();
        System.out.println(ssf);
       
       
        Employee_Hibernate  ob = new Employee_Hibernate();
        ob.setEmpid(100);
        ob.setAddress("CTC");
        ob.setMobile(123466);
    	ob.setName("Rout");
    	Session ss1 = ssf.openSession();
    	Transaction tr1 = ss1.beginTransaction();
    	ss1.save(ob);
    	tr.commit();
    	ss1.close();
    	//System.out.println(s);
         */
    	// get and Load method of Hibernate
    	// It will get the data as soon as get () is called.
    	Session ss2= ssf.openSession();    	
    	Hybernate_Student ob =(Hybernate_Student) ss2.get(Hybernate_Student.class,200);
    	Hybernate_Student ob1 =(Hybernate_Student) ss2.load(Hybernate_Student.class,400);
    	System.out.println(ob);
    	System.out.println("===========================");
    	// At the time of operation or call Load will fire HQL Query
    	
    	System.out.println(ob1);
    	ss2.close();
    	ssf.close();
    	
    } 
}
