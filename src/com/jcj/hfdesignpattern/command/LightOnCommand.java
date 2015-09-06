package com.jcj.hfdesignpattern.command;

public class LightOnCommand implements Command {
	
	Light light;
	
	public LightOnCommand(Light light)
	{
		this.light = light;
	}

	@Override
	public void Execute() {
		light.on();
	}
}
