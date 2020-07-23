package com.epam.LoggersEpam;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{

	private static Logger LOGGER = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
        
    	LOGGER.info(CLeanCode.getSimpleIntrest(1000, 0.5, 8));
		LOGGER.info(CLeanCode.getCompoundIntrest(2000, 0.1, 4,3));
		LOGGER.info(CLeanCode.getConstructionCost("standard", 1500, true));
		
		
    }
}
