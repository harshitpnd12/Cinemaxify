package com.cinemaxify;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("spouse")
public class Spouse implements User {
	String name;
	int age;
	Long contact;
	String address;
	private Plan plan;
	
	@Autowired
	public Spouse(@Qualifier("premiumPlan")Plan plan) {
		super();
		this.plan = plan;
	}

	@Override
	public String toString() {
		return "Spouse [name=" + name + ", age=" + age + ", contact=" + contact + ", address=" + address + ", plan="
				+ plan + "]";
	}

	@Override
	public void setUserDetails(String name, int age, Long contact, String address) {
		this.name = name;
		this.age = age;
		this.contact = contact;
		this.address = address;
	}

	@Override
	public void getUserDetails() {
		System.out.println(this.toString());
	}

	@Override
	public Plan getUserPlan() {
		return plan;
	}
	
	public void setPlan(Plan plan) {
        this.plan = plan;
    }
}
