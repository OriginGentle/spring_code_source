package com.spring.selfAutowired;

import org.springframework.stereotype.Controller;

@Controller
public class LianController {

    @Lian
    private LianService lianService;

    public void show(){
        lianService.show();
    }

	public void setLianService(LianService lianService) {
    	this.lianService = lianService;
	}
}
