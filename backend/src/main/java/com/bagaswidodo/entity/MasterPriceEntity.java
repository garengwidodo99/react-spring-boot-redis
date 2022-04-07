package com.bagaswidodo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "master_price")
public class MasterPriceEntity implements Serializable{
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "origin_code")
	private String originCode;
	
	@Column(name = "destination_code")
	private String destinationCode;
	
	
	private double price;	
	private String product;

	
	public MasterPriceEntity() {
	}

	public MasterPriceEntity( String originCode, String destinationCode, double price, String product) {
		this.originCode = originCode;
		this.destinationCode = destinationCode;
		this.price = price;
		this.product = product;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getOriginCode() {
		return originCode;
	}
	public void setOriginCode(String originCode) {
		this.originCode = originCode;
	}
	public String getDestinationCode() {
		return destinationCode;
	}
	public void setDestinationCode(String destinationCode) {
		this.destinationCode = destinationCode;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	
	public String toString(){
		return "MasterPrice{" 
				+ "id=" + this.id + ", originCode='" 
				+ this.originCode + '\'' + ", destinationCode='" 
				+ this.destinationCode + '\'' 
				+ ", price='" + this.price+ '\''
				+ ", product='" + this.product+ '\''
				+ '}';
	}
}
