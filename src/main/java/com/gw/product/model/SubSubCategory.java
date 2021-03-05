package com.gw.product.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "sub_sub_category")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SubSubCategory {
	
	@Id
	@GeneratedValue( strategy= GenerationType.IDENTITY )
	@Column(name="subsubcategory_id")
	private int sscId;
	
	private String sscName;

}