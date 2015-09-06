package com.jcj.hfdesignpattern.decorator;

public class ConcreteDecoratorA extends Decorator {

	Component comObj;
	
	public ConcreteDecoratorA(Component comObj) {
		this.comObj = comObj;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void methodA() {
		// TODO Auto-generated method stub
		comObj.methodA();
		System.out.println("Test");
	}

	@Override
	public void methodB() {
		// TODO Auto-generated method stub
		
	}

}
