package com.medifinder.registeration;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

public interface RegisterRepository extends CrudRepository<Register, String> {
	// This is called derived query  
	//  Spring Data JPA automatically understands the method name and generate query
	  List<Register> findByStatus(String status);
	  
	  @Transactional
	  void deleteByStatus(String status);
}
