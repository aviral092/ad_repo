package com.gw.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gw.product.model.SubSubCategory;


public interface SubSubCategoryRepository extends JpaRepository<SubSubCategory, Integer>{
	 
	@Query("select u from SubSubCategory u where u.sscName = ?1")
	SubSubCategory findBysscName(String sscName);
}
