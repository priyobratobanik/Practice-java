package com.masai.usecases;


import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.model.Address;
import com.masai.model.Employee;
import com.masai.utility.EMUtil;



public class GetAllEmployee {

	public static void main(String[] args) {
		
		EntityManager em=EMUtil.provideConnection();
		
		String jpql="from Employee where ename=:name";
		
		Query q =em.createQuery(jpql);
		q.setParameter("name", "Ramesh");
		
		List<Employee> emps=q.getResultList();
		
		for(Employee employee : emps) {
			Set<Address> addrs=employee.getAddresses();
			
			for(Address adr:addrs) {
				
				System.out.println(adr);
			}
			
		}
		
		System.out.println(emps);
		em.close();
		

	}

}
