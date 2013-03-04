package com.ibaralf

import com.ibaralf.YahooFinanceYQLService

class StockQuoteTagLib {

	static namespace = 'yahoofinance'
	def yahooFinanceYQLService = new YahooFinanceYQLService()
		
	def quote = { attrs, body ->
		println "\n\nINTAGLIB ${attrs.symbol} && ${attrs.data}"
		out << yahooFinanceYQLService.taglibQuote(attrs.symbol, attrs.stat)		
	}
}
