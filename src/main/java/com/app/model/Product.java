package com.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	
	@Id
	private Integer prodId;
	private String prodCode;
	private Double prodcost;
	public Product(Integer prodId, String prodCode, Double prodcost) {
		super();
		this.prodId = prodId;
		this.prodCode = prodCode;
		this.prodcost = prodcost;
	}
	public Product() {
		super();
	}
	public Integer getProdId() {
		return prodId;
	}
	public void setProdId(Integer prodId) {
		this.prodId = prodId;
	}
	public String getProdCode() {
		return prodCode;
	}
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}
	public Double getProdcost() {
		return prodcost;
	}
	public void setProdcost(Double prodcost) {
		this.prodcost = prodcost;
	}
	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodCode=" + prodCode + ", prodcost=" + prodcost + "]";
	}
	
	
	

}
