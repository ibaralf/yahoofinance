package com.ibaralf

import grails.test.mixin.TestFor

import org.junit.Before

/**
 * See the API for {@link grails.test.mixin.web.GroovyPageUnitTestMixin} for usage instructions
 */
@TestFor(StockQuoteTagLib)
class StockQuoteTagLibTests {

	@Before
	void setup() {
		 applicationContext.getBean(StockQuoteTagLib).yahooFinanceYQLService = new YahooFinanceYQLService()
	}

	void testQuote() {
		assert applyTemplate("<yahoofinance:quote symbol='AAPL' stat='Name' />") == 'Apple Inc.'
	}
}
