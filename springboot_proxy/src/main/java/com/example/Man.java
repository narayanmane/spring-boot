package com.example;

public class Man implements Person {
	
	private int age;
	private String name;
	private String address;

	public Man(int age, String name, String address) {
		super();
		this.age = age;
		this.name = name;
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	

	@Override
	public String toString() {
		return "Man [age=" + age + ", name=" + name + ", address=" + address + "]";
	}

	@Override
	public void introduce(String name) {
		// TODO Auto-generated method stub
		System.out.println("my name "+this.name);
		
		
	}

	@Override
	public void welcome() {
		// TODO Auto-generated method stub
		System.out.println("my address"+getAddress());
		
	}

	@Override
	public void age() {
		// TODO Auto-generated method stub
		System.out.println("my age is "+getAge());
		
	}

}
