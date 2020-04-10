package com.dac.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dac.beans.Employee;

@Repository
public class DaoImpl {

	@Autowired
	private SessionFactory sessionFactoty;
	
	public List<Employee> getEmployee() {
		Session session = sessionFactoty.openSession();
		Query<Employee> qry = session.createQuery("from Employee",Employee.class);
		 List<Employee> list = qry.list();
		 session.close();
		return list;
	}

}
