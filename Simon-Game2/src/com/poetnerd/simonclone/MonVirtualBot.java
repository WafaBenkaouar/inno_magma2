package com.poetnerd.simonclone;

import java.io.IOException;



public class MonVirtualBot extends Robot {

	public String IP_REETI = "127.0.0.1";
	public int PORT_REETI = 54001;
	
	
	public MonVirtualBot(String nom) throws IOException {
		super("tablette");	
	}

	public void connectRobot(){
		super.ip = IP_REETI;
		super.port = PORT_REETI;
		
	}
	
	public void playColor(String color) {
		this.say(color);
		changeColor(color);
		
	}
	
	public void say(String message) {
		
	}
	
	public void changeColor(String color){
		

	}

	@Override
	void disconnectRobot() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void playBehaviour(String behaviourPath) {
		// TODO Auto-generated method stub
		
	}

	@Override
	void setIP(String IP) {
		// TODO Auto-generated method stub
		
	}

	@Override
	String getIP() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	void setPort(Integer port) {
		// TODO Auto-generated method stub
		
	}

	@Override
	Integer getPort() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	void playMusic(String musicPath)  {
		// TODO Auto-generated method stub
		
	}


	
	
}
