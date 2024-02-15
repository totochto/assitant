package com.totochto.assistant;

import java.util.Timer;
import java.util.TimerTask;

import org.apache.log4j.Logger;


public class Clic {

	private final static Logger log = Logger.getLogger(Clic.class);
	
	public static void main(String[] args) {
		log.info("***** COMMENCER LE BOT *****");
    	Timer timer = new Timer();
        TimerTask task = new Runner();
        int period = 60000; //chaque minute
        
        timer.schedule(task, 200, period);

	}
	
	

}
