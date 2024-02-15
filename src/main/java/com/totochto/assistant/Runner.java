package com.totochto.assistant;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.TimerTask;

import org.apache.log4j.Logger;

public class Runner extends TimerTask {
	
	private final Logger log = Logger.getLogger(Runner.class);
	
    public void run() {
    	try {
    		this.bot();
		} catch (Exception e) {
			e.printStackTrace();
		}
    	
    }
    
    @SuppressWarnings("deprecation")
	public void bot() throws AWTException{
		Robot rob = new Robot();
//		String pat = "yyyy-MM-dd HH:mm:ss";
//		SimpleDateFormat sdf = new SimpleDateFormat(pat);
		
		rob.mouseMove(600, 300);
		rob.mousePress(InputEvent.BUTTON1_MASK);
        rob.mouseRelease(InputEvent.BUTTON1_MASK);

        log.info("Le curseur s'avait deplacé");
    }
    
}
