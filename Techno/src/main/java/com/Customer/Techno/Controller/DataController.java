package com.Customer.Techno.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.Customer.Techno.Entity.DataEntity;
import com.Customer.Techno.Repository.CustomerRepo;

@RestController
@CrossOrigin(origins = {"http://localhost:3000"})
public class DataController {
	
	@Autowired
	CustomerRepo customerRepo;
	
	@PostMapping("/data")
	public ResponseEntity<DataEntity>saveCustomer(@RequestBody DataEntity customer) {
		return new ResponseEntity<>(customerRepo.save(customer),HttpStatus.CREATED);
	}
	
}
