package com.cinemaxify;

import org.springframework.stereotype.Component;

@Component("normalPlan")
public class NormalPlan implements Plan {

	@Override
	public String getPlanName() {
		return "normal";
	}

}
