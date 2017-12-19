package fr.dta.tpSpringData.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import fr.dta.tpSpringData.model.Customer;

@RepositoryRestResource(collectionResourceRel="customer", path="customer")
public interface CustomerRepository extends CrudRepository<Customer, Long>{
	
	@Query("SELECT c FROM Customer c WHERE c.email LIKE %:emailSuffix")
	public List<Customer> findByEmailSuffix(@Param("emailSuffix") String emailSuffix);
	
	public Customer findByEmail(String email);
	
	@Query("SELECT c FROM Customer c WHERE c.lastname=:lastname")
	public List<Customer> findByLastname(@Param("lastname") String lastname);
	
	@Query("SELECT c FROM Customer c WHERE c.firstname=:firstname AND c.lastname=:lastname")
	public Customer findByFirstnameAndLastname(@Param("firstname") String firstname, @Param("lastname") String lastname);
	

}
