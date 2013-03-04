
package com.ibaralf;

import java.util.List;

/**
 * Class that is used to get specific stock data.
 * @author ialfonso
 *
 */
public class StockQuote{
   	private Query query;

	/**
	 * Gets a List of Mapped stock data. 
	 * @return List of Map containing stock data
	 */
	public List getQuotes() {
		if (this.query) {
			Results results =  this.query.getResults()
			if (results) {
				return this.query.getResults().getQuote()
			}
		}
		return null
	}
	
	public Results getResults() {
		if (this.query) {
			Results results =  this.query.getResults()
			return results
		}
		return null
	}
	
	/**
	 * Returns the Last Trade Price
	 * @param stockSymbol stock symbol (Ex. YHOO)
	 * @return stock last trade price
	 */
	public String getLastTrade(String stockSymbol) {
		def returnVal = ""
		def stock_result = this.query.getResults().getQuote()
		def quote = this.query.getResults().findStockData(stockSymbol)
		if (quote) {
			returnVal = quote['LastTradePriceOnly']
		}
		return returnVal
	}
	
	/**
	 * Returns the specific stock statistic passed in the parameter. <br/>
	 * Ex. getValue("YHOO", "volume")
	 * @param stockSymbol String stock symbol
	 * @param whichStat String statistic
	 * @return value of statistic requested in String
	 */
	public String getValue(String stockSymbol, String whichStat) {
		def returnVal = ""
		def results = getResults()
		if (results) {
			def quote = results.findStockData(stockSymbol)
			if (quote) {
				returnVal = quote[whichStat]
			}
		}
		return returnVal
	}
	
	/**
	 * Retrieves all data of a specific stock
	 * @param stockSymbol company stock symbol
	 * @return 
	 */
	public String getAllStockData() {
		def results = getResults()
		if (results) {
			return results.getQuote()
		}
	}
	
 	public Query getQuery(){
		return this.query;
	}
	 
	public void setQuery(Query query){
		this.query = query;
	}
	
	public String toString() {
		def stock_result = this.query.getResults().getQuote()
		return "com.ibaralf.StockQuote ${stock_result.size()}"
	}
	
	
	
}
