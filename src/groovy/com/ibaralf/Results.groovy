package com.ibaralf;

import java.util.List;

/**
 * Used by Query.groovy class. Used by StockQuote to get a specific stock statistical data.
 * @author ialfonso
 *
 */
public class Results{
   	private List quote;

 	public List getQuote(){
		return this.quote;
	}
	public void setQuote(List quote){
		this.quote = quote;
	}
	
	/**
	 * Gets the specific stock list of statistics from a Map
	 * @param stockSymbol
	 * @return Map of stock data
	 */
	public findStockData(String stockSymbol) {
		def foundQuote = null
		for(Map m : this.quote) {
			if (m.symbol == stockSymbol) {
				foundQuote = m
				break
			}
		}
		return foundQuote
	}
	
	
}
