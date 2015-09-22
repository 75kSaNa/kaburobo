package com.kSaNa75.superkaburobo;
import jp.tradesc.superkaburobo.sdk.robot.AbstractRobot;
import jp.tradesc.superkaburobo.sdk.trade.TradeAgent;

import com.kSaNa75.log.*;
import com.kSaNa75.log.logger75.level;

public class TradeRobot extends AbstractRobot {

    @Override
	public void order(TradeAgent arg0) {
    	logger75.setDefaultLogLevel(level.debug);
	    logger75.c("îÑîÉÇ∑ÇÈÇÃÇÕÇ‹ÇæëÅÇ¢");
	}

	@Override
	public void screening(TradeAgent arg0) {
    	logger75.setDefaultLogLevel(level.debug);
	    logger75.d("âΩÇ‡ÇµÇΩÇ≠Ç»Ç¢");

	}
}
