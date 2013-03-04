package com.ibaralf

import java.util.Date;

/**
 * Utility to manipulate or extract date related information.
 * @author ibarra.alfonso@gmail.com
 *
 */
class DateUtilsService {

    static final DEBUG_MODE = false
	
	/**
	 * Pass integer parameters for month and year and this returns a date 
	 * for the first of the month. Not that useful, just a match for the 
	 * getMonthEnd function.
	 * @param month
	 * @param year
	 * @return 
	 */
	Date getMonthStart(int month, int year) {
		def startDay = 1
		def startDate = new Date(month + "/" + startDay + "/" + year)
		return startDate
	}
	
	/**
	 * Pass integer parameters for month and year and this returns a date for 
	 * the last day of the month with time set for 11:59PM. Useful since end of the month
	 * days can be 30 or 31, or for February it can be 28 or 29.
	 * @param month integer value of the month (ex. 1 for January, 12 for December)
	 * @param year  integer value for the year (ex. 2012)
	 * @return      Date object for the last day of the month/year passed
	 */
	Date getMonthEnd(int month, int year) {
		def endDay = getLastDayOfTheMonth(month - 1, year)
		def endDate = new Date(month + "/" + endDay + "/" + year + " 23:59:00")
		return endDate
	}
	
	/**
	 * Returns a future date from the fromDate parameter. The interval 
	 * is determined by the parameter interval. 
	 * Ex. if paramater passed is Jan 15, 2013 and interval 'yearly', 
	 * the return Date object would be Jan 15, 2013.
	 * @param fromDate starting date where to calculate the future date.
	 * @param interval String interval can be any of ("monthly", "every two months", "every three months", "every six months", "yearly" )
	 * @return         Date object of future date
	 */
	Date getFutureDate(Date fromDate, String interval) {
		def rval = fromDate.toCalendar()
		switch(interval) {
			case "monthly":
				rval.add(Calendar.MONTH, 1)
			break
			case "every two months":
				rval.add(Calendar.MONTH, 2)
			break
			case "every three months":
				rval.add(Calendar.MONTH, 3)
			break
			case "every six months":
				rval.add(Calendar.MONTH, 6)
			break
			case "yearly":
			rval.add(Calendar.YEAR, 1)
			break
		}
		return rval.getTime()
	}
	
	/**
	 * Returns the string of the starting date of a quarter. Dates are
	 * start of quarter or year to date with respect to current date.
	 * Ex. 
	 * If the date today is Jun 5, 2012 and interval is 'Current Quarter', 
	 * this returns 04/01/2012 - date of quarter where Jun 5 falls in
	 *  
	 * @param ival String value of interval ("Current Quarter", "Last Quarter", "Year to Date")
	 * @return the string of the date in mm/dd/yyyy format
	 */
	String getIntervalStartDateString(String ival) {
		def currMonth= getDatePart('MONTH').toInteger()
		def startDate = ""
		switch(ival) {
			case 'Current Quarter':
				if (currMonth >=0 && currMonth <=2) {
					startDate = "01/01/" + getCurrentYear()
				} else if (currMonth >=3 && currMonth <=5) {
					startDate = "04/01/" + getCurrentYear()
				} else if (currMonth >=6 && currMonth <=8) {
					startDate = "07/01/" + getCurrentYear()
				} else {
					startDate = "10/01/" + getCurrentYear()
				}
				break
			case 'Last Quarter':
				if (currMonth >=0 && currMonth <=2) {
					startDate = "10/01/" + getPreviousYear()
				} else if (currMonth >=3 && currMonth <=5) {
					startDate = "01/01/" + getCurrentYear()
				} else if (currMonth >=6 && currMonth <=8) {
					startDate = "04/01/" + getCurrentYear()
				} else {
					startDate = "07/01/" + getCurrentYear()
				}
				break
			case 'Year to Date':
				startDate = "01/01/" + getCurrentYear()
				break
			default:
				startDate = getCurrentMonthPlus() + "/01/" + getCurrentYear() 
				break
		}
		return startDate
	}
	
	/**
	 * Returns the string of the ending date of a quarter. Dates are
	 * start of quarter or year to date with respect to current date.
	 * Ex.
	 * If the date today is Jun 5, 2012 and interval is 'Last Quarter',
	 * this returns 06/30/2012 - date of quarter where Jun 5 falls in
	 *
	 * @param ival String value of interval ("Last Quarter", "Year to Date")
	 * @return the string of the date in mm/dd/yyyy format
	 */
	String getIntervalEndDateString(String ival) {
		def currMonth= getDatePart('MONTH')
		def endDate = ""
		switch(ival) {
			case 'Last Quarter':
				if (currMonth >=0 && currMonth <=2) {
					endDate = "12/31/" + getPreviousYear()
				} else if (currMonth >=3 && currMonth <=5) {
					endDate = "03/31/" + getCurrentYear()
				} else if (currMonth >=6 && currMonth <=8) {
					endDate = "06/30/" + getCurrentYear()
				} else {
					endDate = "09/30/" + getCurrentYear()
				}
				break
			default: // year-to-date/current quarter/ or none selected
				endDate = getCurrentMonthPlus()  + "/" + getCurrentDay() + "/" + getCurrentYear()
				break
		}
		return endDate
	}
	
	/**
	 * Returns the Date object of the starting date for a quarter.
	 * @param interval ("Current Quarter", "Last Quarter", "Year to Date")
	 * @return Date object with starting quarter date
	 */
	Date getIntervalStartDate(String interval) {
		def intervalStartDateString = getIntervalStartDateString(interval)
		return (new Date(intervalStartDateString))
	}
	
	/**
	 * Returns the Date object of the ending date for a quarter.
	 * @param interval ("Last Quarter", "Year to Date")
	 * @return Date object with ending quarter date
	 */
	Date getIntervalEndDate(String interval) {
		def intervalEndDateString = getIntervalEndDateString(interval)
		return (new Date(intervalEndDateString))
	}
	
	/**
	 * Returns date object of the current month's first day
	 * Ex. 
	 * If today is Feb 12, 2013, this returns a date object 
	 * with date set for Feb 1, 2013
	 * @return Date object with first day of the current month
	 */
	Date getCurrentMonthDateDay1() {
		def d = getCurrentMonth() + 1
		d += "/01/" + getCurrentYear()
		p("CURRENT DATE: ${d}")
		return new Date(d)
	}
	
	/**
	 * Returns integer value of current month. (January is 0 ... December is 11).
	 * Gregorian/Julian calendars always start with 0 for January.
	 * @return integer value of current month
	 */
	def getCurrentMonth() {
		return getDatePart('MONTH')
	}
	
	/**
	 * Returns integer value of current month with starting value at 1. 
	 * (January is 1 ... December is 12).
	 * @return integer value of current month
	 */
	def getCurrentMonthPlus() {
		def monthPlusOne = getDatePart('MONTH') + 1  
		return monthPlusOne
	}
	
	/**
	 * Returns integer value of current year
	 * @return integer value of current year
	 */
	def getCurrentYear() {
		return getDatePart('YEAR')
	}
	
	/**
	 * Returns integer value of current day 
	 * @return integer value of current day
	 */
	def getCurrentDay() {
		return getDatePart('DAY')
	}
	
	/**
	 * Returns the integer value of last year.
	 * Ex.
	 * If today is December 25, 2012, this returns 2011
	 * @return integer value of last year
	 */
	def getPreviousYear() {
		def year = getDatePart('YEAR')
		return year - 1
	}
	
	/**
	 * Gets the part (DAY, MONTH, YEAR, ...) of the current date.
	 * Ex. 
	 * If today is January 12, 2012, getting date part 'MONTH' returns 0 
	 * @param part the part of the date to extract ("MONTH", "YEAR", "HOUR", "MINUTE", "DAY", "DATE")
	 * @return integer value of extracted part of the date
	 */
	int getDatePart(String part) {
		def c = new GregorianCalendar()
		c = Calendar.instance
		switch(part) {
			case 'MONTH':
				return c.get(Calendar.MONTH)
			case 'YEAR':
				return c.get(Calendar.YEAR)
			case 'HOUR':
				return c.get(Calendar.HOUR)
			case 'MINUTE':
				return c.get(Calendar.MINUTE)
			case 'DAY':
			case 'DATE':
				return c.get(Calendar.DATE)
		}
	}

	/**
	 * Returns integer part of the date to extract depending on parameter passed.
	 * @param d Date object to extract DAY, MONTH, YEAR, ...
	 * @param part Specific part to extract (DATE, DAY, MONTH, YEAR, HOUR, MINUTE, DAY_OF_WEEK, DAY_OF_WEEK_IN_MONTH)
	 * @return integer value of extracted part of the date
	 */
	int extractDateField(Date d, String part) {
		switch(part) {
			case 'DATE':
			case 'DAY':
				return d.getAt(Calendar.DATE)
			case 'MONTH':
				return d.getAt(Calendar.MONTH)
			case 'YEAR':
				return d.getAt(Calendar.YEAR)
			case 'HOUR':
				return d.getAt(Calendar.HOUR)
			case 'MINUTE':
				return d.getAt(Calendar.MINUTE)
			case 'DAY_OF_WEEK':
				return d.getAt(Calendar.DAY_OF_WEEK)
			case 'DAY_OF_WEEK_IN_MONTH':
				return d.getAt(Calendar.DAY_OF_WEEK_IN_MONTH)
		}
	}
	
	/**
	 * Converts month integer value to abbreviated month name.
	 * @param intMonth integer/string of month (ex. 1, 2, ...12)
	 * @return string value of the month (Jan ... Dec)
	 */
	String getMonthName(intMonth) {
		def rval = intMonth
		switch(intMonth) {
			case '1': rval = 'Jan'
				break
			case '2': rval = 'Feb'
				break
			case '3': rval = 'Mar'
				break
			case '4': rval = 'Apr'
				break
			case '5': rval = 'May'
				break
			case '6': rval = 'Jun'
				break
			case '7': rval = 'Jul'
				break
			case '8': rval = 'Aug'
				break
			case '9': rval = 'Sep'
				break
			case '10': rval = 'Oct'
				break
			case '11': rval = 'Nov'
				break
			case '12': rval = 'Dec'
				break
		}
		return rval
	}
	
	/**
	 * Returns the last 2 digits of the year
	 * Ex. 
	 * for 2012, this returns '12'
	 * @param yr year to truncate
	 * @return truncated year value 
	 */
	def truncateYear(yr) {
		def rval = yr.toString()
		if (rval.length() == 4) {
			rval = rval[2..3]
		} 
		return rval
	}
	
	/**
	 * Returns integer value of the last day of the month passed in the parameter
	 * @param mon integer of month (start at 0 for January)
	 * @param yr integer value of year
	 * @return integer value of last day
	 */
	int getLastDayOfTheMonth(mon, yr) {
		def c = new GregorianCalendar()
		c.set(yr, mon, 1)
		return c.getActualMaximum(Calendar.DAY_OF_MONTH)
	}
	
	/**
	 * Returns a date object of the last day of the month, time also set at 11:59PM
	 * @param mon integer of month (start at 0 for January)
	 * @param yr integer value of year
	 * @return date object with value of last day time set 11:59PM
	 */
	Date getLastDayOfTheMonthDate(mon, yr) {
		def c = new GregorianCalendar()
		def lastDay = c.getActualMaximum(Calendar.DAY_OF_MONTH)
		c.set(yr, mon, lastDay, 23, 59, 0)
		return c.getTime()
	}
	
	/**
	 * Returns a date object of the first day of the month
	 * @param mon integer of month (start at 0 for January)
	 * @param yr integer value of year
	 * @return date object with value of first day
	 */
	Date getFirstDayOfTheMonthDate(mon, yr) {
		def c = new GregorianCalendar()
		c.set(yr, mon, 1, 0, 0, 0)
		return c.getTime()
	}
	
	/**
	 * Returns a map [startDate: dateString, endDate: dateString], this function prevents having
	 * the startDate be after the endDate or startDate greaterthan the current date.
	 * 1) If startDate is greater than current date then 
	 * startDate = current Date 
	 * endDate = current Date
	 * 2) If endDate is greater than current date then
	 * endDate = current Date
	 * 3) If startDate is greater than endDate
	 * startDate = endDate
	 * @param startString string of start date (mm/dd/yyyy)
	 * @param endString string of end date (mm/dd/yyyy)
	 * @return map with [startDate: dateString, endDate: dateString]
	 */
	def fixStartEndDates(startString, endString) {
		def tdate = new Date()
		def sdate = new Date(startString)
		def edate = new Date(endString)
		// Check start date not greater than current day
		if (sdate.compareTo(tdate) > 0) {
			sdate = tdate
			edate = tdate
		}
		// Check end date not greater than current day
		if (edate.compareTo(tdate) > 0) {
			edate = tdate
		}
		// Check start not greater than end
		if (sdate.compareTo(edate) > 0) {
			edate = sdate
		}
		return [startDate: dateToString(sdate), endDate: dateToString(edate)]
		
	}
	
	/**
	 * Returns string value of a date in mm/dd/yyyy format
	 * @param dd Date object to convert
	 * @return String of date in mm/dd/yyyy format
	 */
	String dateToString(Date dd) {
		def month = extractDateField(dd, 'MONTH') + 1
		def day = extractDateField(dd, 'DAY')
		def year = extractDateField(dd, 'YEAR')
		return month + "/" + day + "/" + year
	}
	
	 
	/**
	 * Returns a list of week start-end dates. 
	 * @param start Date object with desired starting date
	 * @param end Date object with desired ending date
	 * @return list of weeks Date start of week, Date end of week
	 */
	def getRangeWeeks(Date start, Date end) {
		def startDate = adjustStartDate(start)
		def numberOfWeeks = (int) (end - startDate)/7
		def rval = []
		for (i in 0..numberOfWeeks) {
			def wrange = [:]
			wrange['weekLabel'] = dateToString(startDate)
			wrange['weekStart'] = startDate + i * 7
			def weekEnd = wrange['weekStart'] + 6
			if (end - weekEnd < 0) {
				weekEnd = end
			}
			Calendar cal = Calendar.getInstance()
			cal.setTime(weekEnd)
			cal.add(Calendar.HOUR, 23)
			cal.add(Calendar.MINUTE, 59)
			wrange['weekEnd'] = cal.getTime()
			rval.add(wrange)
		}
		return rval
	}
	
	/**
	 * Returns a list of all years within start date and end date.
	 * @param start starting Date object
	 * @param end ending Date object
	 * @return list of years
	 */
	def getRangeYears(Date start, Date end) {
		def startYear = extractDateField(start, 'YEAR')
		def endYear = extractDateField(end, 'YEAR')
		def allyears = []
		for (k in startYear..endYear) {
			allyears.add(k)
		}
		return allyears
	}
	
	/**
	 * Returns a list of month start-end dates.
	 * @param start starting Date object
	 * @param end ending Date object
	 * @return list of month starting Date, month ending Date
	 */
	def getRangeMonths(Date start, Date end) {
		def startMonth = extractDateField(start, 'MONTH')
		def endMonth = extractDateField(end, 'MONTH')
		def startYear = extractDateField(start, 'YEAR')
		def endYear = extractDateField(end, 'YEAR')
		def rval = []
		def allmonths = []
		if (startYear == endYear) {
			allmonths += getMonthList(startMonth, endMonth, "integer")
			def loopFirst= true
			def lastLoop = allmonths.size()
			def ctr = 0
			allmonths.each {
				ctr++
				def sdate
				if (loopFirst) {
					loopFirst = false
					sdate = start
				} else {
				 	def dstr = (it + 1) + "/01/" + startYear
					sdate = new Date(dstr)
				}
				def mrange = [:]
				mrange['monthLabel'] = getMonthName(it + 1) + truncateYear(startYear)
				mrange['monthStart'] = sdate
				if (ctr >= lastLoop) {
					Calendar cal = Calendar.getInstance()
					cal.setTime(end)
					cal.add(Calendar.HOUR, 23)
					cal.add(Calendar.MINUTE, 59)
					mrange['monthEnd'] = cal.getTime()
				} else {
					mrange['monthEnd'] = getLastDayOfTheMonthDate(it, startYear)
				}
				rval.add(mrange)
			}
		} else {
			def first = true
			for (k in startYear..endYear) {
				allmonths = []
				def sm = startMonth
				def em = endMonth
				if (k != endYear) {
					em = 11
				}
				if (k!= startYear) {
					sm = 0
				}
				allmonths += getMonthList(sm, em, "integer")
				def lastLoop = allmonths.size()
				def ctr = 0
				allmonths.each {
					ctr++
					def sdate
					def mrange = [:]
					if (first) {
						first = false
						sdate = start
					} else {
						def dstr = (it + 1) + "/01/" + k
						sdate = new Date(dstr)
					}
					mrange['monthLabel'] = getMonthName(it + 1) + truncateYear(k)
					mrange['monthStart'] = sdate
					if (ctr >= lastLoop && k == endYear) {
						Calendar cal = Calendar.getInstance()
						cal.setTime(end)
						cal.add(Calendar.HOUR, 23)
						cal.add(Calendar.MINUTE, 59)
						mrange['monthEnd'] = cal.getTime()
					} else {
						mrange['monthEnd'] = getLastDayOfTheMonthDate(it, k)
					}
					rval.add(mrange)
				}
			}
		}
		return rval
	}
	
	/**
	 * 
	 * @param toadjust
	 * @return
	 */
	def adjustStartDate(Date toadjust) {
		def returnDate
		def startDay = extractDateField(toadjust, 'DAY_OF_WEEK')
		if (startDay == 7) {
			returnDate = toadjust + 1
		} else if (startDay != 1) {
			returnDate = toadjust - startDay + 1
		} else {
			returnDate = toadjust
		}
		p "ADJUSTED: ${returnDate}"
		return returnDate
	}
	
	/**
	 * Converts number of seconds to days. 
	 * @param numSecs number of seconds to convert
	 * @param decimalPlaces sets the number of decimal places in returned value.
	 * @return equivalent in days (with decimal values)
	 */
	def convertSecToDays(numSecs, decimalPlaces=1) {
		if (numSecs && numSecs != "") {
			def rem = numSecs.toInteger()
			def days = numSecs/86400
			return days.round(decimalPlaces)
		} else {
			return 0
		}
	}
	
	/**
	 * Converts seconds into days hours:minutes string.
	 * Ex. 2 days 06:23
	 * @param numSecs integer/string for number of seconds
	 * @return DD hh:mm string
	 */
	String convertSecToDHM(numSecs) {
		def rem = numSecs
		def days = (numSecs/86400).toInteger()
		def dayDisplay = "${days} days"
		if (days == 1) {
			dayDisplay = "${days} day"
		}
		rem = rem - (days * 86400)
		def hours = (rem/3600).toInteger()
		def hourDisplay = "${hours}"
		if (hourDisplay.size() == 1) {
			hourDisplay = "0" + "${hours}"
		}
		rem = rem - (hours * 3600)
		def minutes = (rem/60).toInteger()
		def minutesDisplay = "${minutes}"
		if (minutesDisplay.size() == 1) {
			minutesDisplay = "0" + "${minutes}"
		}
		return "${dayDisplay} ${hourDisplay}:${minutesDisplay}"
	}
	
	/**
	 * Converts seconds into minutes seconds.
	 * Ex. 323min 34s
	 * @param millis number of milli seconds to convert
	 * @return minutes seconds string
	 */
	String convertMilliSecToMinSec(millis) {
		def totalSeconds = millis/1000L
		def minutes = (totalSeconds/60L).toInteger()
		def minutesDisplay = "${minutes}"
		def seconds = (totalSeconds - (minutes * 60)).toFloat().round()
		def secondsDisplay = "${seconds.toInteger()}"
		return "${minutesDisplay}min ${secondsDisplay}s"
	}
	
	/**
	 * Returns number of business days within a date range from Date start to Date end
	 * Counts the number of days EXCLUDING saturdays and sundays. Does not put into 
	 * account holidays.
	 * @param start Date object for the starting date
	 * @param end Date object for the ending date
	 * @return number of days
	 */
	def getNumberOfBusinessDays(Date start, Date end) {
		def numBusinessDays = 0
		def lookingAtDate = start
		while (lookingAtDate <= end) {
			p("CURRENT DATE: ${lookingAtDate.toString()}")
			def dayOfWeek = lookingAtDate.getAt(Calendar.DAY_OF_WEEK)
			if (dayOfWeek !=1 && dayOfWeek !=7) {
				numBusinessDays++
			}
			p("DAY: ${dayOfWeek}")
			lookingAtDate += 1
		}
		return numBusinessDays
	}
	
	/**
	 * Probably not used much.
	 * Returns index of year in the array 
	 * @param yearArray List of years
	 * @param yearName year to search index
	 * @return index value 
	 */
	def getYearIndex(yearArray, yearName) {
		def indx = yearArray.indexOf(yearName)
		return indx
	}
	
	/**
	 * Returns a List of month names.
	 * @return  List of all months
	 */
	def getMonthNames() {
		def allmonths = ['January', 'February', 'March' ,'April','May', 'June','July', 'August', 'September', 'October', 'November','December']
		return allmonths
	}
	
	/**
	 * Return index value of the month passed as a parameter. Used to convert month to numerical value. <br/>
	 * Ex. getMonthIndex("April")
	 * returns 4
	 * @param monthName
	 * @return numerical value of month
	 */
	def getMonthIndex(String monthName) {
		def allmonths = ['January', 'February', 'March' ,'April','May', 'June','July', 'August', 'September', 'October', 'November','December']
		def indx = allmonths.indexOf(monthName)
		if (indx >= 0) {
			indx++
		} else {
			indx = 0
		}
		return indx
	}
	
	/**
	 * Returns list of all days. Used for labels. 
	 * List is composed of ['DAY1', ... 'DAY31']
	 * @return list of day labels
	 */
	def getDayNames() {
		def alldays = []
		for(i in 1..31) {
			alldays.add("DAY " + i)
		}
		return alldays
	}
	
	/**
	 * Returns index of day name + 1 <br/>
	 * Ex. getDayIndex("DAY10")
	 * returns 10
	 * @param dayName
	 * @return index value of passed day name
	 */
	def getDayIndex(dayName) {
		def alldays = []
		for(i in 1..31) {
			alldays.add("DAY " + i)
		}
		def indx = alldays.indexOf(dayName)
		if (indx > 0) {
			indx++
		} else {
			indx = 0
		}
		return indx
	}
	
	/**
	 * Returns a list of all the months within a date range (start - end). Month list can 
	 * be names or integer value equivalent.<br/>
	 * Ex. getMonthAxes(start=>11/14/2012, end=>03/22/2013, "string")
	 * returns ["November", "December", "January", "February", "March"]
	 * @param start Date object for starting date
	 * @param end Date object for ending date
	 * @param dformat format desired can be ('integer', 'string')
	 * @return List of months in the date range
	 */
	def getMonthAxes(Date start, Date end, dformat) {
		if (!start || !end) {
			return []
		}
		def startMonth = extractDateField(start, 'MONTH')
		def endMonth = extractDateField(end, 'MONTH')
		def startYear = extractDateField(start, 'YEAR')
		def endYear = extractDateField(end, 'YEAR')
		def rval = []

		if (startYear == endYear) {
			rval += getMonthList(startMonth, endMonth, dformat)
		} else {
			for (k in startYear..endYear) {
				def sm = startMonth
				def em = endMonth
				if (k != endYear) {
					em = 11
				}
				if (k!= startYear) {
					sm = 0
				}
				rval += getMonthList(sm, em, dformat)
			}
		}
		return rval
	}
	
	/**
	 * Used by method getMonthAxes, this loops through the starting index to the ending index.
	 * This only works for a single year. Use getMonthAxes if the range spans over more than one year.<br/>
	 * Ex. getMonthList(0, 5, 'integer') 
	 * returns [0,1,2,3,4,5]
	 * @param sindex integer starting value
	 * @param eindex integer ending value
	 * @param forma format to return ('string', 'integer')
	 * @return List of months (integer or string)
	 */
	def getMonthList(sindex, eindex, forma) {
		def months = []
		if (forma == "string") {
			sindex += 1
			eindex += 1
			for (i in sindex..eindex) {
				months.add(getMonthName(i))
			}
		} else {
			for (i in sindex..eindex) {
				months.add(i)
			}
		}
		return months
	}
	
	/**
	 * Returns list of years within the date range passed.<br/>
	 * Ex. getYearAxes(start=>11/14/2012, end=>03/22/2013)
	 * returns ["2012", "2013"]
	 * @param start Date object for starting date
	 * @param end Date object for ending date
	 * @return List of years within the starting and ending dates
	 */
	def getYearAxes(Date start, Date end) {
		if (!start || !end) {
			return []
		}
		def startMonth = extractDateField(start, 'MONTH')
		def endMonth = extractDateField(end, 'MONTH')
		def startYear = extractDateField(start, 'YEAR')
		def endYear = extractDateField(end, 'YEAR')
		def rval = []

		if (startYear == endYear) {
			for (i in startMonth..endMonth) {
				rval.add(startYear)
			}
		} else {
			for (k in startYear..endYear) {
				def sm = startMonth
				def em = endMonth
				if (k != endYear) {
					em = 11
				}
				if (k!= startYear) {
					sm = 0
				}
				for (i in sm..em) {
					rval.add(k)
				}
			}
		}
		return rval
	}
	
	/**
	 * Converts month name and year into a Date object with the day set for the first day of the month. <br/>
	 * Ex. convertMonthYearStringToDate("July 2009") 
	 * returns Date with 07/01/2009
	 * @param monYear string with month name and year ("December 2012")
	 * @return Date object with date passed in parameter
	 */
	Date convertMonthYearStringToDate(String monYear) {
		def monthStr = getMonthIndex(monYear.split()[0])
		def yearStr = monYear.split()[1]
		def newDate = new Date( monthStr + "/1/" + yearStr)  
		return newDate
	}
	
	/**
	 * Print line to console if DEBUG_MODE is true
	 * @param msg String message to print
	 * @return
	 */
	def p(msg) {
		if (DEBUG_MODE) {
			println "${msg}"
		}
	}
	
	
}