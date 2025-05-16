package com.example.dato;

import java.sql.Date;

public class orderInformation {

	private String orderId;
	private String userid;
	private Date createDate;
	private String  price;
	private String email;
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public orderInformation(String orderId, String userid, Date createDate, String price, String email) {
		super();
		this.orderId = orderId;
		this.userid = userid;
		this.createDate = createDate;
		this.price = price;
		this.email = email;
	}
	public orderInformation() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
