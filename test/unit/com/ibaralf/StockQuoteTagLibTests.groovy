package com.ibaralf

import grails.test.mixin.*
import org.junit.*
import grails.test.TagLibUnitTestCase
import grails.test.MockUtils

/**
 * See the API for {@link grails.test.mixin.web.GroovyPageUnitTestMixin} for usage instructions
 */
//@TestFor(StockQuoteTagLib)
class StockQuoteTagLibTests extends TagLibUnitTestCase {

	void testQuote() {
		MockUtils.mockCommandObject(StockQuote)
		tagLib.quote symbol:'AAPL', data:'Name'
		assertEquals('Apple Inc.', tagLib.out.toString())
	}
    
}
