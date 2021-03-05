package com.gw.product.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gw.product.model.ProductMaster;
import com.gw.product.repository.ProductRepository;
import com.gw.product.repository.SubSubCategoryRepository;

@Service
public class ProductService {

	@Autowired private ProductRepository repo;
	
	@Autowired private SubSubCategoryRepository subrepo;
		
	public List<ProductMaster> findAll(){
		return repo.findAll();
	}
	
	public List<ProductMaster> findBysscId(int sscId){
		return repo.findBysscId(sscId);
	}
	
	
	public ProductMaster insertProduct(ProductMaster product){
		ProductMaster newproduct = new ProductMaster();
		newproduct.setName(product.getName());
		newproduct.setShort_description(product.getShort_description());
		newproduct.setLong_description(product.getLong_description());
		newproduct.setCreated_at(new Date());
		if(subrepo.findBysscName(product.getSubsubcategory().getSscName()) !=null) {
			newproduct.setSubsubcategory(subrepo.findBysscName(product.getSubsubcategory().getSscName()));
			return repo.save(newproduct);
		}
		else {
			return null;
		}
	}
	
	
	public void deleteById(int id) {
		repo.deleteById(id);
	}
	
	
	public Optional<ProductMaster> findById(int id) {
		return repo.findById(id);
	}
	
}
