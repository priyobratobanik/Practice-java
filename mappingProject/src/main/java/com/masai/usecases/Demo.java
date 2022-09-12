package com.masai.usecases;

import javax.persistence.EntityManager;

import com.masai.model.Address;
import com.masai.model.Employee;
import com.masai.utility.EMUtil;

public class Demo {

	public static void main(String[] args) {
		
	EntityManager em=EMUtil.provideConnection();

	
	Employee emp1=new Employee();
	emp1.setEname("Ramesh");
	emp1.setSalary(78900);
	emp1.getAddresses().add(new Address("Mp", "indore", "564675","home"));
	emp1.getAddresses().add(new Address("Mumbai", "Nagpur", "765786","office"));
	emp1.getAddresses().add(new Address("sikkim", "Gangtok", "365786","other"));
	
	em.getTransaction().begin();
	em.persist(emp1);
	em.getTransaction().commit();
	em.close();
	}

}
