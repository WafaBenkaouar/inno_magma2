package com.poetnerd.simonclone;

import java.io.IOException;

import liburbi.UClient;

import android.graphics.Color;

public class MonReeti extends Robot{

	public String IP_REETI = "10.42.43.1";
	public int PORT_REETI = 54001;
	private UClient cli  ;
	
	
	public MonReeti(String IP, Integer PORT) throws IOException {
		super(IP, PORT);
		cli = new UClient(IP, PORT, UClient.URBI_BUFLEN) ;
	}
	
	
	public MonReeti(String nom) throws IOException {
		super("reeti");
		cli = new UClient(this.IP_REETI, this.PORT_REETI, UClient.URBI_BUFLEN) ;
	}

	public void connectRobot(){
		super.ip = IP_REETI;
		super.port = PORT_REETI;
		cli = new UClient(ip, port, UClient.URBI_BUFLEN) ;
	}
	
	public void playColor(String color) {
		//this.say(color);
		//changeColor(color);
		playBehaviour(color+"Seq");
		
		//
		//+"player.playMus(\"/home/reeti/reetiDocuments/Music/SimonGame/red_long.ogg\");"
		//);
		
	}
	
	public void say(String message) {
		try {
			cli.send("tts.say(\" "+message+"\");");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void changeColor(String color){
		try {
			cli.send("servo.changeLedColor(\""+color+"\"); ");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


	@Override
	void disconnectRobot() {
		cli.disconnect();
		
	}


	@Override
	void playBehaviour(String behaviourPath) {
		try {
			cli.send("player.playSequence(\"/home/reeti/reetiDocuments/Sequences/Simon_Game/"+behaviourPath+"\");");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


	@Override
	void setIP(String IP) {
		ip = IP;		
	}


	@Override
	String getIP() {
		return ip;
	}


	@Override
	void setPort(Integer port) {
		super.port = port;
	}


	@Override
	Integer getPort() {
		return super.port;
	}


	@Override
	void playMusic(String musicPath)  {
		try {
			cli.send("player.playMus(\"/home/reeti/reetiDocuments/Music/SimonGame/"+musicPath+"\");");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}


	
}
