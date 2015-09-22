package com.kSaNa75.log;

import jp.tradesc.superkaburobo.sdk.trade.RobotLogManager;
import java.lang.String;
import java.lang.Integer;;
public class logger75 {
	private static RobotLogManager logger = RobotLogManager.getInstance();

    public static class level {
    	// priority 1 is higher than 5
		public static final Integer critical = 1;
		public static final Integer error = 2;
		public static final Integer warning = 3;
		public static final Integer information = 4;
		public static final Integer debug = 5;	
	}

    public static void c(String msg) {
    	if (level.critical <= logger.getDefaultLevel()) {
	        logger.log(msg, level.critical);
    	}
	}

	public static void e(String msg) {
    	if (level.error <= logger.getDefaultLevel()) {
    		logger.log(msg, level.error);
    	}
	}

	public static void w(String msg) {
    	if (level.warning <= logger.getDefaultLevel()) {
    		logger.log(msg, level.warning);
    	}
	}

	public static void i(String msg) {
    	if (level.information <= logger.getDefaultLevel()) {
            logger.log(msg, level.information);
    	}
	}

	public static void d(String msg) {
    	if (level.debug <= logger.getDefaultLevel()) {
    		logger.log(msg, level.debug);
    	}
	}
	public static void setDefaultLogLevel(Integer level) {
		logger.setDefaultLevel(level);
	}
}
