package com.namedquerydemo;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.omg.CORBA.PRIVATE_MEMBER;

public class TestManageEmployee {

	private static org.apache.log4j.Logger log = Logger.getLogger(TestManageEmployee.class);

	public static void main(String[] args) {
		
		log.fatal("this is fatal level");
		log.error("this is error level");
		log.warn("this is warn level");
		log.info("this is info level");
		log.debug("this is debug level");
		//log.trace("this is trace level");
		
		SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session =sf.openSession();
		Transaction tx = session.beginTransaction();
	
		SQLQuery query = (SQLQuery) session.getNamedQuery(Employee.SHOW_ALL_EMPLOYEES);
		
		query.addEntity(Employee.class);
		//Query query = session.getNamedQuery("SHOW_ALL_EMPLOYEES");
		List <Employee> emps = query.list();    
		 for (Employee employee : emps) {
			
			 System.out.println(employee);
		}
	 		  tx.commit();
		  session.close();
	}


	}
