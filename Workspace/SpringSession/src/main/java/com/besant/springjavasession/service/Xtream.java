package com.besant.springjavasession.service;

import org.springframework.stereotype.Component;

@Component
public class Xtream {
	
	public int details()
	{
		int a=0;
		int b=8;
		int c=9;
		a=b*c;
		System.out.println(a);
		return a;
	}
}
