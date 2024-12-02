package com.cinemaxify;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("self")
public class Self implements User {
	String name;
	int age;
	long contact;
	String address;
	private Plan plan;

	@Autowired
	public Self(@Qualifier("normalPlan") Plan plan) {
		super();
		this.plan = plan;
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

	@Override
	public String toString() {
		return "Self [name=" + name + ", age=" + age + ", contact=" + contact + ", address=" + address + ", plan="
				+ plan + "]";
	}

	
}
