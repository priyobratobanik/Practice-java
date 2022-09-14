package com.masai.usecases;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.model.Employee;
import com.masai.utility.EMUtil;

public class GetAllEmployeeWhereDept {

	public static void main(String[] args) {
		EntityManager em=EMUtil.provideConnection();
		
		String jpql="select emps from Department where dname='hr'";
		
		Query query=em.createQuery(jpql);
		
		List<Employee> empList=query.getResultList();
		
    	System.out.println(empList);
		
		
		em.close();
		
		
		

	}

}
