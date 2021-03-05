package com.gw.product.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="products")
public class ProductMaster {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int product_id;
	
	private String name;
	
	@ManyToOne()
	@JoinColumn(name="subsubcategory_id", referencedColumnName = "subsubcategory_id")
	private SubSubCategory subsubcategory;
	
	private String short_description;
	

	private String long_description;
	private Date created_at;
	
	public ProductMaster() {	
	}
	
	public ProductMaster(int product_id, String name, SubSubCategory subsubcategory, String short_description,
			String long_description, Date created_at) {
		super();
		this.product_id = product_id;
		this.name = name;
		this.subsubcategory = subsubcategory;
		this.short_description = short_description;
		this.long_description = long_description;
		this.created_at = created_at;
	}

	
	  public int getProduct_id() { return product_id; }
	  
	  public void setProduct_id(int product_id) { this.product_id = product_id; }
	  
	  public String getName() { return name; }
	  
	  public void setName(String name) { this.name = name; }
	  
	  public SubSubCategory getSubsubcategory() { return subsubcategory; }
	  
	  public void setSubsubcategory(SubSubCategory subsubcategory) { this.subsubcategory = subsubcategory; }
	  
	  public String getShort_description()	{ return short_description; }
	  
	  public void setShort_description(String short_description) { this.short_description = short_description; }
	  
	  public String getLong_description() { return long_description; }
	  
	  public void setLong_description(String long_description) { this.long_description = long_description; }
	  
	  public Date getCreated_at() { return created_at; }
	  
	  public void setCreated_at(Date created_at) { this.created_at = created_at; }
	  
	 	@Override
	public String toString() {
		return "ProductMaster [product_id=" + product_id + ", name=" + name + ", subsubcategory=" + subsubcategory
				+ ", short_description=" + short_description + ", long_description=" + long_description
				+ ", created_at=" + created_at + "]";
	}

	
}
