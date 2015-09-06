package com.jcj.hfdesignpattern.builder;

public class ConcreteBuilder extends Builder {

	Product p;
	
	@Override
	public void buildPart() {
		
	}
	
	public void getResult()
	{
		p = new Product();
	}


}
