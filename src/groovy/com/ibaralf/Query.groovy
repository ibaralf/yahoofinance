
package com.ibaralf;

import java.util.List;

/**
 * 
 * @author ialfonso
 *
 */
public class Query{
   	private Number count;
   	private String created;
   	private String lang;
   	private Results results;

 	public Number getCount(){
		return this.count;
	}
	public void setCount(Number count){
		this.count = count;
	}
 	public String getCreated(){
		return this.created;
	}
	public void setCreated(String created){
		this.created = created;
	}
 	public String getLang(){
		return this.lang;
	}
	public void setLang(String lang){
		this.lang = lang;
	}
 	public Results getResults(){
		return this.results;
	}
	public void setResults(Results results){
		this.results = results;
	}
}
