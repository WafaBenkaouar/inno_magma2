package com.poetnerd.simonclone;
import java.io.IOException;




public abstract class Robot {
	
	
	public String IP_NAO = "192.168.0.101";
	public int PORT_NAO = 54000;
	public String IP_REETI = "10.42.43.1";
	public  int PORT_REETI = 54001;
	public String IP_DEFAULT = IP_REETI;
	public  int PORT_DEFAULT = PORT_REETI;
	public static final int GREEN = 0;
	public static final int RED = 1;
	public static final int YELLOW = 2;
	public static final int BLUE = 3;
	public static final int VICTORY_SOUND = 4;
	public static final int LOSE_SOUND = 5;
	public static final int SPECIAL_RAZZ = 6;
	
	
	public String ip;
	public Integer port;
	
	public Robot(String IP, Integer PORT) throws IOException{
		this.ip = IP;
		this.port = PORT;
		
	}

	
	public Robot(String nom)throws IOException{
		if(nom.equalsIgnoreCase("nao")){
			this.ip = IP_NAO;
			this.port = PORT_NAO;
			
		}
		else if(nom.equalsIgnoreCase("reeti")){
			this.ip = IP_REETI;
			this.port = PORT_REETI;
		}
		else {
			this.ip = IP_DEFAULT;
			this.port = PORT_DEFAULT;
		}
		
	}
	
	/**
	 * connect the robot
	 * @throws IOException
	 */
	abstract void connectRobot()throws IOException;
	
	/**
	 * set the IP address
	 * @param IP
	 */
	abstract void setIP(String IP);
	
	/**
	 * returns the IP address
	 * @return
	 */
	abstract String getIP();
	
	/**
	 * set the port number 
	 * @param port
	 */
	abstract void setPort(Integer port);
	
	/**
	 * returns the port number
	 * @return
	 */
	abstract Integer getPort();
	
	/**
	 * makes the robot say a message 
	 * @param message
	 * @throws IOException
	 */
	abstract void say(String message);
	
	/**
	 * reaction of the robot to the user click on a color
	 * @param color
	 * @throws IOException
	 */
	abstract void playColor(String color);
	
	
	public void playReaction(Integer rea)  {
		switch (rea) {
		case GREEN:
			playColor("green");
		break;
		case RED:
			playColor("red");
			break;
		case YELLOW:
			playColor("yellow");
			break;
		case BLUE:
			playColor("blue");
			break;
		case VICTORY_SOUND:
			say("bravo");
			break;
		case LOSE_SOUND:
			say("t'es nul");
			break;
		case  SPECIAL_RAZZ :
			say(" razz");
			break;	
		}
	}
	
	/**
	 * changes the colors of the led of the robot
	 * @param color
	 * @throws IOException
	 */
	abstract void changeColor(String color) ;
	
	/**
	 * plays a behaviour that the robot contains
	 * @param behaviourPath
	 * @throws IOException
	 */
	abstract void playBehaviour(String behaviourPath) ;
	
	/**
	 * plays a music file
	 * @param musicPath
	 * @throws IOException
	 */
	abstract void playMusic(String musicPath) ;
	
	/**
	 * disconnect the robot
	 * @throws IOException
	 */
	abstract void disconnectRobot();
	
	
}
