package com.masai.usecases;

import javax.persistence.EntityManager;

import com.masai.model.Department;
import com.masai.model.Employee;
import com.masai.utility.EMUtil;

public class Demo {

	public static void main(String[] args) {
		EntityManager em=EMUtil.provideConnection();
		
		Employee emp1=new Employee();
		emp1.setName("sunil");
		emp1.setSalary(8500);
		
		Employee emp2=new Employee();
		emp2.setName("rahul");
		emp2.setSalary(7500);
		
		Department dept=new Department();
		
		dept.setDname("sales");
		dept.setLocation("mumbai");

		//associating both employee with a dept obj	
		dept.getEmps().add(emp1);
		dept.getEmps().add(emp2);
		
		
		
		em.getTransaction().begin();
//		
//		em.persist(emp1);
//		em.persist(emp2);
		em.persist(dept);
		
		em.getTransaction().commit();
		
		em.close();
		
		System.out.println("done...");

	}

}
