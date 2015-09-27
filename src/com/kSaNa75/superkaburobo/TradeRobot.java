package com.kSaNa75.superkaburobo;

import java.util.ArrayList;

import jp.tradesc.superkaburobo.sdk.robot.AbstractRobot;
import jp.tradesc.superkaburobo.sdk.trade.TradeAgent;

// Screening
import jp.tradesc.superkaburobo.sdk.trade.InformationManager;
import jp.tradesc.superkaburobo.sdk.trade.data.Stock;

// Asset
import jp.tradesc.superkaburobo.sdk.trade.AssetManager;
// Order
import jp.tradesc.superkaburobo.sdk.trade.OrderManager;
// log
import com.kSaNa75.log.*;
import com.kSaNa75.log.logger75.level;

public class TradeRobot extends AbstractRobot {

    @Override
	public void order(TradeAgent arg0) {
        InformationManager im = InformationManager.getInstance();
        ArrayList<Stock> stockList = im.getStockList();
        Stock stock = stockList.get(0);
        OrderManager om = OrderManager.getInstance();
        int quantity = stock.getUnit();
        om.orderActualNowMarket(stock, quantity);
    }

	@Override
	public void screening(TradeAgent arg0) {
		
		// Asset
		AssetManager am = AssetManager.getInstance();
		logger75.i("資産評価額:" + am.getTotalAssetValue());
		logger75.i("株価評価額:" + am.getTotalStockValue());
		logger75.i("取引余力:" + am.getTradableMoney());
		// Screening
        InformationManager im = InformationManager.getInstance();
        ArrayList<Stock> stockList = im.getStockList();
        for (Stock stock:stockList) {
            logger75.i(stock.getStockName());
        }
	}
}
