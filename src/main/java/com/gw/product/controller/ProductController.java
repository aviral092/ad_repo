package com.gw.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gw.product.model.ProductMaster;
import com.gw.product.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private ProductService productservice;

	@GetMapping("/")
	public List<ProductMaster> findAll() {
		return productservice.findAll();
	}

	@PostMapping("/post")
	public ResponseEntity<ProductMaster> insertProduct(@RequestBody ProductMaster product) {
		ProductMaster savedproduct = productservice.insertProduct(product);
		if(productservice.findById(savedproduct.getProduct_id()).isPresent()) {
			return ResponseEntity.ok().build();
		}
		else {
			return ResponseEntity.unprocessableEntity().body(savedproduct);
		}
	}
	

	@DeleteMapping("/{pro_id}")
	public ResponseEntity<ProductMaster> deleteById(@PathVariable int pro_id) {
		productservice.deleteById(pro_id);
		return ResponseEntity.noContent().build();
	}

	@GetMapping("/{sscId}")
	public List<ProductMaster> findBysscId(@PathVariable int sscId) {
		return productservice.findBysscId(sscId);
	}

}
