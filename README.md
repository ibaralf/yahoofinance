## Description
### This grails plugin uses the yahoo finance web services to retrieve stock information and statistics.

## Features
* Provides all statistical data for multiple stocks as defined by Yahoo web services
* Provides historical data for a single stock

## Usage
### In a service or controller:
You can call the methods available in the YahooFinanceYQLService. 
* yahooFinanceYQLService.quote(String symbols)
* yahooFinanceYQLService.quote(String symbols, String statistics)
* yahooFinanceYQLService.getHistoricalQuotes(String symbol, int numberOfDays)
* yahooFinanceYQLService.getHistoricalQuotes(String symbol, String startDate, String endDate)
* yahooFinanceYQLService.getHistoricalQuotes(String symbol, Date startDate, Date endDate)
* yahooFinanceYQLService.availableStats - list of all statistics that can be retrieved.

### Tag
`<yahoofinance:quote symbol="" stat="" />`

## Examples
### In grails views:
`<yahoofinance:quote symbol="YHOO" stat="lastTrade" />` <br/>
symbol - the company stock symbol <br/>
stat - the name of the statistic to retrieve

### In controller or service:
    `
    class MyClass {
    def yahooFinanceYQLService

    def listOfStandardStats = yahooFinanceYQLService.quote("YHOO")
    // => returns List - symbol: "YHOO", name: "Yahoo Inc.", lastTrade: "15.50", ...
    def multipleStocks = yahooFinanceYQLService.quote("YHOO, MSFT")
    // => returns List [symbol: "YHOO", name: "Yahoo Inc.", lastTrade: "15.50", ...], 
    //    [symbol: "MSFT", name: "Microsoft Inc.", lastTrade: "29.50", ...] 
    def specificStats = yahooFinanceYQLService.quote("HNR", "daysrange, volume")
    // => returns List - [symbol:HNR, name:Harvest Natural R, daysrange:5.35 - 5.42, volume:470356]
    def historicalLast30days = yahooFinanceYQLService.getHistoricalQuotes("YHOO", 30)
    // => Returns list of [Date, Open, High, Low, Close, Volume, Adj Close] for last 30 days
    def historicalLast30days = yahooFinanceYQLService.getHistoricalQuotes("YHOO", "1-1-2013", "1-31-2013")
    // => returns last January historical data for stock YHOO
    
    def sdate = new GregorianCalendar(2012, Calendar.NOVEMBER, 1).getTime()
    def edate = new GregorianCalendar(2012, Calendar.OCTOBER, 1).getTime()
    def historicalLast30days = yahooFinanceYQLService.getHistoricalQuotes("YHOO", sdate, edate)
    // => returns historical data between Nov 1, 2012 and October 1, 2012
    }
`
