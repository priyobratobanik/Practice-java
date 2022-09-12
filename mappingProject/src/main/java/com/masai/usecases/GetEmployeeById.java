package com.masai.usecases;

import java.util.Set;

import javax.persistence.EntityManager;

import com.masai.model.Address;
import com.masai.model.Employee;
import com.masai.utility.EMUtil;

public class GetEmployeeById {

	public static void main(String[] args) {
		
		EntityManager em=EMUtil.provideConnection();
		
		Employee emp = em.find(Employee.class, 1);
		//em.close();
		
		System.out.println("name is:"+emp.getEname());
		System.out.println("salary is:"+emp.getSalary());
		System.out.println("id is:"+emp.getEid());
		
		System.out.println("address is :");
		Set<Address> set=emp.getAddresses();
		System.out.println(set);
		
		em.close();

	}

}
