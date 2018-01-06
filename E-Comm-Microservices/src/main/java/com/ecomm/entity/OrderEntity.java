package com.ecomm.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "productorder")
public class OrderEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int orderId;
	@Temporal(TemporalType.DATE)
	private Date orderDate;
	private int quantity;
	private double bill;
	private String orderStatus;
	@Column(name = "active")
	private String stat;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "productid")
	private ProductEntity product;
/*	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "userid")
	private UserEntity user;*/

	public OrderEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderEntity(int orderId, Date orderDate, int quantity, double bill, String orderStatus, String stat,
			ProductEntity product, UserEntity user) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.quantity = quantity;
		this.bill = bill;
		this.orderStatus = orderStatus;
		this.stat = stat;
		this.product = product;
		//this.user = user;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getBill() {
		return bill;
	}

	public void setBill(double bill) {
		this.bill = bill;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getStat() {
		return stat;
	}

	public void setStat(String stat) {
		this.stat = stat;
	}

	public ProductEntity getProduct() {
		return product;
	}

	public void setProduct(ProductEntity product) {
		this.product = product;
	}

/*	public UserEntity getUser() {
		return user;
	}

	public void setUser(UserEntity user) {
		this.user = user;
	}*/

	@Override
	public String toString() {
		return "OrderEntity [orderId=" + orderId + ", orderDate=" + orderDate + ", quantity=" + quantity + ", bill="
				+ bill + ", orderStatus=" + orderStatus + ", stat=" + stat + ", product=" + product + "]";
	}

}
