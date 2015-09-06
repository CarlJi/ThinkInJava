package com.jcj.hfdesignpattern.command;

public class GarageDoorOpenCommand implements Command{
	
	GarageDoor agrageDoor;
	
	public GarageDoorOpenCommand(GarageDoor garageDoor)
	{
		this.agrageDoor = garageDoor;
	}

	@Override
	public void Execute() {

		agrageDoor.up();
		
	}

}
