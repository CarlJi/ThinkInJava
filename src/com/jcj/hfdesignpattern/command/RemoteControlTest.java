package com.jcj.hfdesignpattern.command;

public class RemoteControlTest {
	
	public static void main(String[] args)
	{
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light();
		LightOnCommand lightOn = new LightOnCommand(light);
		
		GarageDoor ad = new GarageDoor();
		GarageDoorOpenCommand gd = new GarageDoorOpenCommand(ad);
		
		remote.setCommand(lightOn);
		remote.buttonQasPresent();
		
		remote.setCommand(gd);
		remote.buttonQasPresent();
	}

}
