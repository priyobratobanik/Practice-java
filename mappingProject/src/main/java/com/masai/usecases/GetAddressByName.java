package com.masai.usecases;




import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.model.Address;
import com.masai.utility.EMUtil;







public class GetAddressByName {

	public static void main(String[] args) {
		
		
		EntityManager em=EMUtil.provideConnection();
		
		String jpql="select salary from Employee  where ename=:name";
	    Query q=em.createQuery(jpql,Address.class);
	    q.setParameter("name", "Ramesh");
	    
	    List<Set<Address>> addrs=q.getResultList();
	    
	    if(addrs.size()>0) {
	    	for(Set<Address> set : addrs) {
	    		System.out.println(set);
	    	}
	    }else {
			System.out.println("No record is there");
		}
		

	}

}
