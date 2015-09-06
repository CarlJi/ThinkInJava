package com.jcj.hfdesignpattern.command;

public class SimpleRemoteControl {
	
	Command slot;
	
	public SimpleRemoteControl(){}
	
	public void setCommand(Command command)
	{
		slot = command;
	}
	
	public void buttonQasPresent()
	{
		slot.Execute();
	}

}
