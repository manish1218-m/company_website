package com.Customer.Techno.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Customer.Techno.Entity.DataEntity;

@Repository
public interface CustomerRepo extends JpaRepository<DataEntity, Long>{

	

}
