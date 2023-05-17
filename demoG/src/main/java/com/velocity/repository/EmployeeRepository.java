package com.velocity.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.velocity.model.PremiumDetail;
@Repository
public interface EmployeeRepository extends CrudRepository<PremiumDetail,Serializable>{

	public PremiumDetail findById(Integer id); //2
}
