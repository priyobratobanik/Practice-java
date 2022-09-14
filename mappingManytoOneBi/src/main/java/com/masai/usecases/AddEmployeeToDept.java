package com.masai.usecases;

import java.util.List;

import javax.persistence.EntityManager;

import com.masai.model.Department;
import com.masai.model.Employee;
import com.masai.utility.EMUtil;

public class AddEmployeeToDept {

	public static void main(String[] args) {
		
		EntityManager em=EMUtil.provideConnection();
		
		
		Employee emp=new Employee();
		emp.setName("Vinay");
		emp.setSalary(6500);
		
		Department dept= em.find(Department.class, 3);
		
		List<Employee> emps= dept.getEmps();
		
		em.getTransaction().begin();
		
		emps.add(emp);
		
		em.getTransaction().commit();
		
		
		System.out.println("done...");
		
	}

}
