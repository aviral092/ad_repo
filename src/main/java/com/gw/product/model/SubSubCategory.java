package com.gw.product.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sub_sub_category")
public class SubSubCategory {
	
	@Id
	@GeneratedValue( strategy= GenerationType.IDENTITY )
	@Column(name="subsubcategory_id")
	private int sscId;
	
	private String sscName;
//	
//	@OneToMany(cascade=CascadeType.ALL)
//	private List<ProductMaster> products;
	

	public SubSubCategory() {
		
	}
	
	public SubSubCategory(int sscId, String sscName //, List<ProductMaster> products
			) {
		super();
		this.sscId = sscId;
		this.sscName = sscName;
//		this.products = products;
	}

	public int getSscId() {
		return sscId;
	}

	public void setSscId(int sscId) {
		this.sscId = sscId;
	}

	public String getSscName() {
		return sscName;
	}

	public void setSscName(String sscName) {
		this.sscName = sscName;
	}

	/*
	 * public List<ProductMaster> getProducts() { return products; }
	 * 
	 * public void setProducts(List<ProductMaster> products) { this.products =
	 * products; }
	 */
	@Override
	public String toString() {
		return "SubSubCategory [sscId=" + sscId + ", sscName=" + sscName + ", products=" 
	//+ products 
				+ "]";
	}
	
	
	
}
