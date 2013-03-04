
package com.ibaralf;

import java.util.List
import org.codehaus.jackson.annotate.JsonIgnoreProperties
import org.codehaus.jackson.annotate.JsonProperty

/**
 * Class that contains different stock data. Uses jackson @Json annotation.
 * @author ialfonso
 *
 */
@JsonIgnoreProperties(["Ask"])
public class Quote{
   	private String afterHoursChangeRealtime;
   	private String annualizedGain;
   	private String ask;
   	private String askRealtime;
   	private String averageDailyVolume;
   	private String bid;
   	private String bidRealtime;
   	private String bookValue;
   	private String change;
   	private String changeFromFiftydayMovingAverage;
   	private String changeFromTwoHundreddayMovingAverage;
   	private String changeFromYearHigh;
   	private String changeFromYearLow;
   	private String changePercentRealtime;
   	private String changeRealtime;
   	private String change_PercentChange;
   	private String changeinPercent;
   	private String commission;
   	private String daysHigh;
   	private String daysLow;
   	private String daysRange;
   	private String daysRangeRealtime;
   	private String daysValueChange;
   	private String daysValueChangeRealtime;
   	private String dividendPayDate;
   	private String dividendShare;
   	private String dividendYield;
   	private String eBITDA;
   	private String ePSEstimateCurrentYear;
   	private String ePSEstimateNextQuarter;
   	private String ePSEstimateNextYear;
   	private String earningsShare;
   	private String errorIndicationreturnedforsymbolchangedinvalid;
   	private String exDividendDate;
   	private String fiftydayMovingAverage;
   	private String highLimit;
   	private String holdingsGain;
   	private String holdingsGainPercent;
   	private String holdingsGainPercentRealtime;
   	private String holdingsGainRealtime;
   	private String holdingsValue;
   	private String holdingsValueRealtime;
   	private String lastTradeDate;
   	private String lastTradePriceOnly;
   	private String lastTradeRealtimeWithTime;
   	private String lastTradeTime;
   	private String lastTradeWithTime;
   	private String lowLimit;
   	private String marketCapRealtime;
   	private String marketCapitalization;
   	private String moreInfo;
   	private String name;
   	private String notes;
   	private String oneyrTargetPrice;
   	private String open;
   	private String orderBookRealtime;
   	private String pEGRatio;
   	private String pERatio;
   	private String pERatioRealtime;
   	private String percebtChangeFromYearHigh;
   	private String percentChange;
   	private String percentChangeFromFiftydayMovingAverage;
   	private String percentChangeFromTwoHundreddayMovingAverage;
   	private String percentChangeFromYearLow;
   	private String previousClose;
   	private String priceBook;
   	private String priceEPSEstimateCurrentYear;
   	private String priceEPSEstimateNextYear;
   	private String pricePaid;
   	private String priceSales;
   	private String sharesOwned;
   	private String shortRatio;
   	private String stockExchange;
   	private String symbol;
   	private String tickerTrend;
   	private String tradeDate;
   	private String twoHundreddayMovingAverage;
   	private String volume;
   	private String yearHigh;
   	private String yearLow;
   	private String yearRange;
   	private String sSymbol;
	   
	public String toString() {
		return this.symbol
	}

	@JsonProperty("AfterHoursChangeRealtime")
 	public String getAfterHoursChangeRealtime(){
		return this.afterHoursChangeRealtime;
	}
	@JsonProperty("AfterHoursChangeRealtime")
	public void setAfterHoursChangeRealtime(String afterHoursChangeRealtime){
		this.afterHoursChangeRealtime = afterHoursChangeRealtime;
	}
	@JsonProperty("AnnualizedGain")
 	public String getAnnualizedGain(){
		return this.annualizedGain;
	}
	@JsonProperty("AnnualizedGain")
	public void setAnnualizedGain(String annualizedGain){
		this.annualizedGain = annualizedGain;
	}
	@JsonProperty("Ask")
 	public String getAsk(){
		return this.ask;
	}
	@JsonProperty("Ask")
	public void setAsk(String ask){
		this.ask = ask;
	}
	@JsonProperty("AskRealtime")
 	public String getAskRealtime(){
		return this.askRealtime;
	}
	@JsonProperty("AskRealtime")
	public void setAskRealtime(String askRealtime){
		this.askRealtime = askRealtime;
	}
	@JsonProperty("AverageDailyVolume")
 	public String getAverageDailyVolume(){
		return this.averageDailyVolume;
	}
	@JsonProperty("AverageDailyVolume")
	public void setAverageDailyVolume(String averageDailyVolume){
		this.averageDailyVolume = averageDailyVolume;
	}
	@JsonProperty("Bid")
 	public String getBid(){
		return this.bid;
	}
	@JsonProperty("Bid")
	public void setBid(String bid){
		this.bid = bid;
	}
	@JsonProperty("BidRealtime")
 	public String getBidRealtime(){
		return this.bidRealtime;
	}
	@JsonProperty("BidRealtime")
	public void setBidRealtime(String bidRealtime){
		this.bidRealtime = bidRealtime;
	}
	@JsonProperty("BookValue")
 	public String getBookValue(){
		return this.bookValue;
	}
	@JsonProperty("BookValue")
	public void setBookValue(String bookValue){
		this.bookValue = bookValue;
	}
	@JsonProperty("Change")
 	public String getChange(){
		return this.change;
	}
	@JsonProperty("Change")
	public void setChange(String change){
		this.change = change;
	}
	@JsonProperty("ChangeFromFiftydayMovingAverage")
 	public String getChangeFromFiftydayMovingAverage(){
		return this.changeFromFiftydayMovingAverage;
	}
	@JsonProperty("ChangeFromFiftydayMovingAverage")
	public void setChangeFromFiftydayMovingAverage(String changeFromFiftydayMovingAverage){
		this.changeFromFiftydayMovingAverage = changeFromFiftydayMovingAverage;
	}
	@JsonProperty("ChangeFromTwoHundreddayMovingAverage")
 	public String getChangeFromTwoHundreddayMovingAverage(){
		return this.changeFromTwoHundreddayMovingAverage;
	}
	@JsonProperty("ChangeFromTwoHundreddayMovingAverage")
	public void setChangeFromTwoHundreddayMovingAverage(String changeFromTwoHundreddayMovingAverage){
		this.changeFromTwoHundreddayMovingAverage = changeFromTwoHundreddayMovingAverage;
	}
	@JsonProperty("ChangeFromYearHigh")
 	public String getChangeFromYearHigh(){
		return this.changeFromYearHigh;
	}
	@JsonProperty("ChangeFromYearHigh")
	public void setChangeFromYearHigh(String changeFromYearHigh){
		this.changeFromYearHigh = changeFromYearHigh;
	}
	@JsonProperty("ChangeFromYearLow")
 	public String getChangeFromYearLow(){
		return this.changeFromYearLow;
	}
	 @JsonProperty("ChangeFromYearLow")
	public void setChangeFromYearLow(String changeFromYearLow){
		this.changeFromYearLow = changeFromYearLow;
	}
	@JsonProperty("ChangePercentRealtime")
 	public String getChangePercentRealtime(){
		return this.changePercentRealtime;
	}
	 @JsonProperty("ChangePercentRealtime")
	public void setChangePercentRealtime(String changePercentRealtime){
		this.changePercentRealtime = changePercentRealtime;
	}
	@JsonProperty("ChangeRealtime")
 	public String getChangeRealtime(){
		return this.changeRealtime;
	}
	 @JsonProperty("ChangeRealtime")
	public void setChangeRealtime(String changeRealtime){
		this.changeRealtime = changeRealtime;
	}
	@JsonProperty("Change_PercentChange")
 	public String getChange_PercentChange(){
		return this.change_PercentChange;
	}
	 @JsonProperty("Change_PercentChange")
	public void setChange_PercentChange(String change_PercentChange){
		this.change_PercentChange = change_PercentChange;
	}
	@JsonProperty("ChangeinPercent")
 	public String getChangeinPercent(){
		return this.changeinPercent;
	}
	 @JsonProperty("ChangeinPercent")
	public void setChangeinPercent(String changeinPercent){
		this.changeinPercent = changeinPercent;
	}
	@JsonProperty("Commission")
 	public String getCommission(){
		return this.commission;
	}
	 @JsonProperty("Commission")
	public void setCommission(String commission){
		this.commission = commission;
	}
	@JsonProperty("DaysHigh")
 	public String getDaysHigh(){
		return this.daysHigh;
	}
	 @JsonProperty("DaysHigh")
	public void setDaysHigh(String daysHigh){
		this.daysHigh = daysHigh;
	}
	@JsonProperty("DaysLow")
 	public String getDaysLow(){
		return this.daysLow;
	}
	 @JsonProperty("DaysLow")
	public void setDaysLow(String daysLow){
		this.daysLow = daysLow;
	}
	@JsonProperty("DaysRange")
 	public String getDaysRange(){
		return this.daysRange;
	}
	 @JsonProperty("DaysRange")
	public void setDaysRange(String daysRange){
		this.daysRange = daysRange;
	}
	@JsonProperty("DaysRangeRealtime")
 	public String getDaysRangeRealtime(){
		return this.daysRangeRealtime;
	}
	 @JsonProperty("DaysRangeRealtime")
	public void setDaysRangeRealtime(String daysRangeRealtime){
		this.daysRangeRealtime = daysRangeRealtime;
	}
	@JsonProperty("DaysValueChange")
 	public String getDaysValueChange(){
		return this.daysValueChange;
	}
	 @JsonProperty("DaysValueChange")
	public void setDaysValueChange(String daysValueChange){
		this.daysValueChange = daysValueChange;
	}
	@JsonProperty("DaysValueChangeRealtime")
 	public String getDaysValueChangeRealtime(){
		return this.daysValueChangeRealtime;
	}
	 @JsonProperty("DaysValueChangeRealtime")
	public void setDaysValueChangeRealtime(String daysValueChangeRealtime){
		this.daysValueChangeRealtime = daysValueChangeRealtime;
	}
	@JsonProperty("DividendPayDate")
 	public String getDividendPayDate(){
		return this.dividendPayDate;
	}
	 @JsonProperty("DividendPayDate")
	public void setDividendPayDate(String dividendPayDate){
		this.dividendPayDate = dividendPayDate;
	}
	@JsonProperty("DividendShare")
 	public String getDividendShare(){
		return this.dividendShare;
	}
	 @JsonProperty("DividendShare")
	public void setDividendShare(String dividendShare){
		this.dividendShare = dividendShare;
	}
	@JsonProperty("DividendYield")
 	public String getDividendYield(){
		return this.dividendYield;
	}
	 @JsonProperty("DividendYield")
	public void setDividendYield(String dividendYield){
		this.dividendYield = dividendYield;
	}
	@JsonProperty("EBITDA")
 	public String getEBITDA(){
		return this.eBITDA;
	}
	 @JsonProperty("EBITDA")
	public void setEBITDA(String eBITDA){
		this.eBITDA = eBITDA;
	}
	@JsonProperty("EPSEstimateCurrentYear")
 	public String getEPSEstimateCurrentYear(){
		return this.
		ePSEstimateCurrentYear;
	}
	 @JsonProperty("EPSEstimateCurrentYear")
	public void setEPSEstimateCurrentYear(String ePSEstimateCurrentYear){
		this.ePSEstimateCurrentYear = ePSEstimateCurrentYear;
	}
	@JsonProperty("EPSEstimateNextQuarter")
 	public String getEPSEstimateNextQuarter(){
		return this.ePSEstimateNextQuarter;
	}
	 @JsonProperty("EPSEstimateNextQuarter")
	public void setEPSEstimateNextQuarter(String ePSEstimateNextQuarter){
		this.ePSEstimateNextQuarter = ePSEstimateNextQuarter;
	}
	@JsonProperty("EPSEstimateNextYear")
 	public String getEPSEstimateNextYear(){
		return this.ePSEstimateNextYear;
	}
	 @JsonProperty("EPSEstimateNextYear")
	public void setEPSEstimateNextYear(String ePSEstimateNextYear){
		this.ePSEstimateNextYear = ePSEstimateNextYear;
	}
	@JsonProperty("EarningsShare")
 	public String getEarningsShare(){
		return this.earningsShare;
	}
	 @JsonProperty("EarningsShare")
	public void setEarningsShare(String earningsShare){
		this.earningsShare = earningsShare;
	}
	@JsonProperty("ErrorIndicationreturnedforsymbolchangedinvalid")
 	public String getErrorIndicationreturnedforsymbolchangedinvalid(){
		return this.errorIndicationreturnedforsymbolchangedinvalid;
	}
	 @JsonProperty("ErrorIndicationreturnedforsymbolchangedinvalid")
	public void setErrorIndicationreturnedforsymbolchangedinvalid(String errorIndicationreturnedforsymbolchangedinvalid){
		this.errorIndicationreturnedforsymbolchangedinvalid = errorIndicationreturnedforsymbolchangedinvalid;
	}
	@JsonProperty("ExDividendDate")
 	public String getExDividendDate(){
		return this.exDividendDate;
	}
	 @JsonProperty("ExDividendDate")
	public void setExDividendDate(String exDividendDate){
		this.exDividendDate = exDividendDate;
	}
	@JsonProperty("FiftydayMovingAverage")
 	public String getFiftydayMovingAverage(){
		return this.fiftydayMovingAverage;
	}
	 @JsonProperty("FiftydayMovingAverage")
	public void setFiftydayMovingAverage(String fiftydayMovingAverage){
		this.fiftydayMovingAverage = fiftydayMovingAverage;
	}
	@JsonProperty("HighLimit")
 	public String getHighLimit(){
		return this.highLimit;
	}
	 @JsonProperty("HighLimit")
	public void setHighLimit(String highLimit){
		this.highLimit = highLimit;
	}
	@JsonProperty("HoldingsGain")
 	public String getHoldingsGain(){
		return this.holdingsGain;
	}
	 @JsonProperty("HoldingsGain")
	public void setHoldingsGain(String holdingsGain){
		this.holdingsGain = holdingsGain;
	}
	@JsonProperty("HoldingsGainPercent")
 	public String getHoldingsGainPercent(){
		return this.holdingsGainPercent;
	}
	 @JsonProperty("HoldingsGainPercent")
	public void setHoldingsGainPercent(String holdingsGainPercent){
		this.holdingsGainPercent = holdingsGainPercent;
	}
	@JsonProperty("HoldingsGainPercentRealtime")
 	public String getHoldingsGainPercentRealtime(){
		return this.holdingsGainPercentRealtime;
	}
	 @JsonProperty("HoldingsGainPercentRealtime")
	public void setHoldingsGainPercentRealtime(String holdingsGainPercentRealtime){
		this.holdingsGainPercentRealtime = holdingsGainPercentRealtime;
	}
	@JsonProperty("HoldingsGainRealtime")
 	public String getHoldingsGainRealtime(){
		return this.holdingsGainRealtime;
	}
	 @JsonProperty("HoldingsGainRealtime")
	public void setHoldingsGainRealtime(String holdingsGainRealtime){
		this.holdingsGainRealtime = holdingsGainRealtime;
	}
	@JsonProperty("HoldingsValue")
 	public String getHoldingsValue(){
		return this.holdingsValue;
	}
	 @JsonProperty("HoldingsValue")
	public void setHoldingsValue(String holdingsValue){
		this.holdingsValue = holdingsValue;
	}
	@JsonProperty("HoldingsValueRealtime")
 	public String getHoldingsValueRealtime(){
		return this.holdingsValueRealtime;
	}
	 @JsonProperty("HoldingsValueRealtime")
	public void setHoldingsValueRealtime(String holdingsValueRealtime){
		this.holdingsValueRealtime = holdingsValueRealtime;
	}
	@JsonProperty("LastTradeDate")
 	public String getLastTradeDate(){
		return this.lastTradeDate;
	}
	 @JsonProperty("LastTradeDate")
	public void setLastTradeDate(String lastTradeDate){
		this.lastTradeDate = lastTradeDate;
	}
	@JsonProperty("LastTradePriceOnly")
 	public String getLastTradePriceOnly(){
		return this.lastTradePriceOnly;
	}
	 @JsonProperty("LastTradePriceOnly")
	public void setLastTradePriceOnly(String lastTradePriceOnly){
		this.lastTradePriceOnly = lastTradePriceOnly;
	}
	@JsonProperty("LastTradeRealtimeWithTime")
 	public String getLastTradeRealtimeWithTime(){
		return this.lastTradeRealtimeWithTime;
	}
	 @JsonProperty("LastTradeRealtimeWithTime")
	public void setLastTradeRealtimeWithTime(String lastTradeRealtimeWithTime){
		this.lastTradeRealtimeWithTime = lastTradeRealtimeWithTime;
	}
	@JsonProperty("LastTradeTime")
 	public String getLastTradeTime(){
		return this.lastTradeTime;
	}
	 @JsonProperty("LastTradeTime")
	public void setLastTradeTime(String lastTradeTime){
		this.lastTradeTime = lastTradeTime;
	}
	@JsonProperty("LastTradeWithTime")
 	public String getLastTradeWithTime(){
		return this.lastTradeWithTime;
	}
	 @JsonProperty("LastTradeWithTime")
	public void setLastTradeWithTime(String lastTradeWithTime){
		this.lastTradeWithTime = lastTradeWithTime;
	}
	@JsonProperty("LowLimit")
 	public String getLowLimit(){
		return this.lowLimit;
	}
	 @JsonProperty("LowLimit")
	public void setLowLimit(String lowLimit){
		this.lowLimit = lowLimit;
	}
	@JsonProperty("MarketCapRealtime")
 	public String getMarketCapRealtime(){
		return this.marketCapRealtime;
	}
	 @JsonProperty("MarketCapRealtime")
	public void setMarketCapRealtime(String marketCapRealtime){
		this.marketCapRealtime = marketCapRealtime;
	}
	@JsonProperty("MarketCapitalization")
 	public String getMarketCapitalization(){
		return this.marketCapitalization;
	}
	 @JsonProperty("MarketCapitalization")
	public void setMarketCapitalization(String marketCapitalization){
		this.marketCapitalization = marketCapitalization;
	}
	@JsonProperty("MoreInfo")
 	public String getMoreInfo(){
		return this.moreInfo;
	}
	 @JsonProperty("MoreInfo")
	public void setMoreInfo(String moreInfo){
		this.moreInfo = moreInfo;
	}
	@JsonProperty("Name")
 	public String getName(){
		return this.name;
	}
	 @JsonProperty("Name")
	public void setName(String name){
		this.name = name;
	}
	@JsonProperty("Notes")
 	public String getNotes(){
		return this.notes;
	}
	 @JsonProperty("Notes")
	public void setNotes(String notes){
		this.notes = notes;
	}
	@JsonProperty("OneyrTargetPrice")
 	public String getOneyrTargetPrice(){
		return this.oneyrTargetPrice;
	}
	 @JsonProperty("OneyrTargetPrice")
	public void setOneyrTargetPrice(String oneyrTargetPrice){
		this.oneyrTargetPrice = oneyrTargetPrice;
	}
	@JsonProperty("Open")
 	public String getOpen(){
		return this.open;
	}
	 @JsonProperty("Open")
	public void setOpen(String open){
		this.open = open;
	}
	@JsonProperty("OrderBookRealtime")
 	public String getOrderBookRealtime(){
		return this.orderBookRealtime;
	}
	 @JsonProperty("OrderBookRealtime")
	public void setOrderBookRealtime(String orderBookRealtime){
		this.orderBookRealtime = orderBookRealtime;
	}
	@JsonProperty("PEGRatio")
 	public String getPEGRatio(){
		return this.pEGRatio;
	}
	 @JsonProperty("PEGRatio")
	public void setPEGRatio(String pEGRatio){
		this.pEGRatio = pEGRatio;
	}
	@JsonProperty("PERatio")
 	public String getPERatio(){
		return this.pERatio;
	}
	 @JsonProperty("PERatio")
	public void setPERatio(String pERatio){
		this.pERatio = pERatio;
	}
	@JsonProperty("PERatioRealtime")
 	public String getPERatioRealtime(){
		return this.pERatioRealtime;
	}
	 @JsonProperty("PERatioRealtime")
	public void setPERatioRealtime(String pERatioRealtime){
		this.pERatioRealtime = pERatioRealtime;
	}
	@JsonProperty("PercebtChangeFromYearHigh")
 	public String getPercebtChangeFromYearHigh(){
		return this.percebtChangeFromYearHigh;
	}
	 @JsonProperty("PercebtChangeFromYearHigh")
	public void setPercebtChangeFromYearHigh(String percebtChangeFromYearHigh){
		this.percebtChangeFromYearHigh = percebtChangeFromYearHigh;
	}
	@JsonProperty("PercentChange")
 	public String getPercentChange(){
		return this.percentChange;
	}
	 @JsonProperty("PercentChange")
	public void setPercentChange(String percentChange){
		this.percentChange = percentChange;
	}
	@JsonProperty("PercentChangeFromFiftydayMovingAverage")
 	public String getPercentChangeFromFiftydayMovingAverage(){
		return this.percentChangeFromFiftydayMovingAverage;
	}
	 @JsonProperty("PercentChangeFromFiftydayMovingAverage")
	public void setPercentChangeFromFiftydayMovingAverage(String percentChangeFromFiftydayMovingAverage){
		this.percentChangeFromFiftydayMovingAverage = percentChangeFromFiftydayMovingAverage;
	}
	@JsonProperty("PercentChangeFromTwoHundreddayMovingAverage")
 	public String getPercentChangeFromTwoHundreddayMovingAverage(){
		return this.percentChangeFromTwoHundreddayMovingAverage;
	}
	 @JsonProperty("PercentChangeFromTwoHundreddayMovingAverage")
	public void setPercentChangeFromTwoHundreddayMovingAverage(String percentChangeFromTwoHundreddayMovingAverage){
		this.percentChangeFromTwoHundreddayMovingAverage = percentChangeFromTwoHundreddayMovingAverage;
	}
	@JsonProperty("PercentChangeFromYearLow")
 	public String getPercentChangeFromYearLow(){
		return this.percentChangeFromYearLow;
	}
	 @JsonProperty("PercentChangeFromYearLow")
	public void setPercentChangeFromYearLow(String percentChangeFromYearLow){
		this.percentChangeFromYearLow = percentChangeFromYearLow;
	}
	@JsonProperty("PreviousClose")
 	public String getPreviousClose(){
		return this.previousClose;
	}
	 @JsonProperty("PreviousClose")
	public void setPreviousClose(String previousClose){
		this.previousClose = previousClose;
	}
	@JsonProperty("PriceBook")
 	public String getPriceBook(){
		return this.priceBook;
	}
	 @JsonProperty("PriceBook")
	public void setPriceBook(String priceBook){
		this.priceBook = priceBook;
	}
	@JsonProperty("PriceEPSEstimateCurrentYear")
 	public String getPriceEPSEstimateCurrentYear(){
		return this.priceEPSEstimateCurrentYear;
	}
	 @JsonProperty("PriceEPSEstimateCurrentYear")
	public void setPriceEPSEstimateCurrentYear(String priceEPSEstimateCurrentYear){
		this.priceEPSEstimateCurrentYear = priceEPSEstimateCurrentYear;
	}
	@JsonProperty("PriceEPSEstimateNextYear")
 	public String getPriceEPSEstimateNextYear(){
		return this.priceEPSEstimateNextYear;
	}
	 @JsonProperty("PriceEPSEstimateNextYear")
	public void setPriceEPSEstimateNextYear(String priceEPSEstimateNextYear){
		this.priceEPSEstimateNextYear = priceEPSEstimateNextYear;
	}
	@JsonProperty("PricePaid")
 	public String getPricePaid(){
		return this.pricePaid;
	}
	 @JsonProperty("PricePaid")
	public void setPricePaid(String pricePaid){
		this.pricePaid = pricePaid;
	}
	@JsonProperty("PriceSales")
 	public String getPriceSales(){
		return this.priceSales;
	}
	 @JsonProperty("PriceSales")
	public void setPriceSales(String priceSales){
		this.priceSales = priceSales;
	}
	@JsonProperty("SharesOwned")
 	public String getSharesOwned(){
		return this.sharesOwned;
	}
	 @JsonProperty("SharesOwned")
	public void setSharesOwned(String sharesOwned){
		this.sharesOwned = sharesOwned;
	}
	@JsonProperty("ShortRatio")
 	public String getShortRatio(){
		return this.shortRatio;
	}
	 @JsonProperty("ShortRatio")
	public void setShortRatio(String shortRatio){
		this.shortRatio = shortRatio;
	}
	@JsonProperty("StockExchange")
 	public String getStockExchange(){
		return this.stockExchange;
	}
	 @JsonProperty("StockExchange")
	public void setStockExchange(String stockExchange){
		this.stockExchange = stockExchange;
	}
	@JsonProperty("symbol")
 	public String getSymbol(){
		return this.symbol;
	}
	 @JsonProperty("symbol")
	public void setSymbol(String symbol){
		this.symbol = symbol;
	}
	@JsonProperty("TickerTrend")
 	public String getTickerTrend(){
		return this.tickerTrend;
	}
	 @JsonProperty("TickerTrend")
	public void setTickerTrend(String tickerTrend){
		this.tickerTrend = tickerTrend;
	}
	@JsonProperty("TradeDate")
 	public String getTradeDate(){
		return this.tradeDate;
	}
	 @JsonProperty("TradeDate")
	public void setTradeDate(String tradeDate){
		this.tradeDate = tradeDate;
	}
	@JsonProperty("TwoHundreddayMovingAverage")
 	public String getTwoHundreddayMovingAverage(){
		return this.twoHundreddayMovingAverage;
	}
	 @JsonProperty("TwoHundreddayMovingAverage")
	public void setTwoHundreddayMovingAverage(String twoHundreddayMovingAverage){
		this.twoHundreddayMovingAverage = twoHundreddayMovingAverage;
	}
	@JsonProperty("Volume")
 	public String getVolume(){
		return this.volume;
	}
	 @JsonProperty("Volume")
	public void setVolume(String volume){
		this.volume = volume;
	}
	@JsonProperty("YearHigh")
 	public String getYearHigh(){
		return this.yearHigh;
	}
	 @JsonProperty("YearHigh")
	public void setYearHigh(String yearHigh){
		this.yearHigh = yearHigh;
	}
	@JsonProperty("YearLow")
 	public String getYearLow(){
		return this.yearLow;
	}
	 @JsonProperty("YearLow")
	public void setYearLow(String yearLow){
		this.yearLow = yearLow;
	}
	@JsonProperty("YearRange")
 	public String getYearRange(){
		return this.yearRange;
	}
	 @JsonProperty("YearRange")
	public void setYearRange(String yearRange){
		this.yearRange = yearRange;
	}
	@JsonProperty("Symbol")
 	public String getSSymbol(){
		return this.sSymbol;
	}
	 @JsonProperty("Symbol")
	public void setSSymbol(String symbol){
		this.symbol = sSymbol;
	}
	
}
