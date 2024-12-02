package com.cinemaxify;

import org.springframework.stereotype.Component;

@Component("premiumPlan")
public class PremiumPlan implements Plan {

	@Override
	public String getPlanName() {
		return "premium";
		
	}

}
