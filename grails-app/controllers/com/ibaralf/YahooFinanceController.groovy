package com.ibaralf

import com.ibaralf.YahooFinanceYQLService;

class YahooFinanceController {

	def yahooFinanceYQLService 
	
    def index() {
		def result = yahooFinanceYQLService.quote("TGT", "symbol, name, volume")
		result.each {
			println "${it.symbol} ${it.lastTrade}"
		}
		//println "RE: ${result}"
		//def result = yahooFinanceYQLService.test_YahooQuote()
//		def dstart = new GregorianCalendar(2012, Calendar.NOVEMBER, 1).getTime()
//		def dend = new GregorianCalendar(2012, Calendar.OCTOBER, 1).getTime()
//		
//		//def result = yahooFinanceYQLService.getHistoricalQuotes("JCP", dstart, dend)
		//def result = yahooFinanceYQLService.getHistoricalQuotes("TGT", "2-1-2013", "2-12-2013")
		//def result = yahooFinanceYQLService.getHistoricalQuotes("JCP", 15)
//		
		//def qts = yahooFinanceYQLService.getQuotes("BBW, HLF")
		// println "QTS ${qts}"
		render "DONE ${result}" 
	}
	
	def addList = {
		def res = '{"query":{"count":1,"created":"2013-02-22T00:32:28Z","lang":"en-US","results":{"quote":[{"symbol":"HLF","Ask":null,"AverageDailyVolume":"10307200","Bid":null,"AskRealtime":"37.24","BidRealtime":"37.05","BookValue":"3.442","Change_PercentChange":"+0.01 - +0.03%","Change":"+0.01","Commission":null,"ChangeRealtime":"+0.01","AfterHoursChangeRealtime":"N/A - N/A","DividendShare":"1.20","LastTradeDate":"2/21/2013","TradeDate":null,"EarningsShare":"3.869","ErrorIndicationreturnedforsymbolchangedinvalid":null,"EPSEstimateCurrentYear":"4.64","EPSEstimateNextYear":"5.36","EPSEstimateNextQuarter":"1.26","DaysLow":"36.25","DaysHigh":"37.93","YearLow":"24.24","YearHigh":"73.00","HoldingsGainPercent":"- - -","AnnualizedGain":null,"HoldingsGain":null,"HoldingsGainPercentRealtime":"N/A - N/A","HoldingsGainRealtime":null,"MoreInfo":"cnprmiIed","OrderBookRealtime":null,"MarketCapitalization":"4.081B","MarketCapRealtime":null,"EBITDA":"708.8M","ChangeFromYearLow":"+13.55","PercentChangeFromYearLow":"+55.90%","LastTradeRealtimeWithTime":"N/A - <b>37.79</b>","ChangePercentRealtime":"N/A - +0.03%","ChangeFromYearHigh":"-35.21","PercebtChangeFromYearHigh":"-48.23%","LastTradeWithTime":"Feb 21 - <b>37.79</b>","LastTradePriceOnly":"37.79","HighLimit":null,"LowLimit":null,"DaysRange":"36.25 - 37.93","DaysRangeRealtime":"N/A - N/A","FiftydayMovingAverage":"38.9724","TwoHundreddayMovingAverage":"45.4687","ChangeFromTwoHundreddayMovingAverage":"-7.6787","PercentChangeFromTwoHundreddayMovingAverage":"-16.89%","ChangeFromFiftydayMovingAverage":"-1.1824","PercentChangeFromFiftydayMovingAverage":"-3.03%","Name":"Herbalife Ltd. Co","Notes":null,"Open":"37.54","PreviousClose":"37.78","PricePaid":null,"ChangeinPercent":"+0.03%","PriceSales":"1.05","PriceBook":"10.98","ExDividendDate":"Nov  9","PERatio":"9.76","DividendPayDate":"Mar 19","PERatioRealtime":null,"PEGRatio":"0.55","PriceEPSEstimateCurrentYear":"8.14","PriceEPSEstimateNextYear":"7.05","Symbol":"HLF","SharesOwned":null,"ShortRatio":"2.50","LastTradeTime":"4:02pm","TickerTrend":"&nbsp;+===--&nbsp;","OneyrTargetPrice":"63.29","Volume":"4764870","HoldingsValue":null,"HoldingsValueRealtime":null,"YearRange":"24.24 - 73.00","DaysValueChange":"- - +0.03%","DaysValueChangeRealtime":"N/A - N/A","StockExchange":"NYSE","DividendYield":"3.18","PercentChange":"+0.03%"}]}}}"'
		def openBrace = res.indexOf('"results":{"quote":{')
		
		def closeBrace = res.lastIndexOf('}}}}')
		def results = "INDEX SEARCH ${openBrace}  :: ${closeBrace}"
		
		res = res.replace('"quote":{"symbol"', '"quote":[{"symbol"')
		res = res.replace('}}}}', '}]}}}')
		
		println "RES: ${res}"
		render results
	}
	
}
