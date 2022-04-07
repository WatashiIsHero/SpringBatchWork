package com.example.demo.form;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class WeatherForm implements Serializable {

	private static final long serialVersionUID = 1L;
	
	/**
	* 地域名
	*/
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}