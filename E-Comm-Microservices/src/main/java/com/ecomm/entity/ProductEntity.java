package com.ecomm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class ProductEntity {

	@Id
	private int productId;
	private String productName;
	private double productPrice;
	private String productType;
	private String productImage;
	@Column(name = "active")
	private String deleted;

	public ProductEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductEntity(int productId, String productName, double productPrice, String productType,
			String productImage, String deleted) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productType = productType;
		this.productImage = productImage;
		this.deleted = deleted;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getDeleted() {
		return deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

	public String getProductImage() {
		return productImage;
	}

	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}

	@Override
	public String toString() {
		return "ProductEntity [productId=" + productId + ", productName=" + productName + ", productPrice="
				+ productPrice + ", productType=" + productType + "productImage=" + productImage + ", deleted="
				+ deleted + "]";
	}

}
