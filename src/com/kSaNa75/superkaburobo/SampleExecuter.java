package com.kSaNa75.superkaburobo;

import jp.tradesc.superkaburobo.sdk.driver.RobotDriver;

public class SampleExecuter {

	public static void main(String[] args) {
		RobotDriver.main(new String[]{"-n", "com.kSaNa75.superkaburobo.TradeRobot"});
	}

}
