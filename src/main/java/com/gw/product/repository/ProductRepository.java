package com.gw.product.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.gw.product.model.ProductMaster;

public interface ProductRepository extends JpaRepository<ProductMaster, Integer>{
	
	@Query(value="select * from products where subsubcategory_id=:sscId" , nativeQuery = true)
	List<ProductMaster> findBysscId(@Param("sscId") int sscId);
	
}
