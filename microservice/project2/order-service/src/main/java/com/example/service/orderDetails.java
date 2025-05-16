package com.example.service;

public class orderDetails {

  private String orderid;
  private String name ;
  private String email;
  private String address;
  private Boolean payment=false;
  private Boolean orderstatus;
  private int userid;
public String getOrderid() {
	return orderid;
}
public void setOrderid(String string) {
	this.orderid = string;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public Boolean getPayment() {
	return payment;
}
public void setPayment(Boolean payment) {
	this.payment = payment;
}
public Boolean getOrderstatus() {
	return orderstatus;
}
public void setOrderstatus(Boolean orderstatus) {
	this.orderstatus = orderstatus;
}
public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
}
public orderDetails(String orderid, String name, String email, String address, Boolean payment, Boolean orderstatus,
		int userid) {
	super();
	this.orderid = orderid;
	this.name = name;
	this.email = email;
	this.address = address;
	this.payment = payment;
	this.orderstatus = orderstatus;
	this.userid = userid;
}
public orderDetails() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "orderDetails [orderid=" + orderid + ", name=" + name + ", email=" + email + ", address=" + address
			+ ", payment=" + payment + ", orderstatus=" + orderstatus + ", userid=" + userid + "]";
}

	
}

