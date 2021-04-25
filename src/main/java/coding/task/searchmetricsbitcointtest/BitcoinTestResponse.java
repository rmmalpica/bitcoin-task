package coding.task.searchmetricsbitcointtest;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *  Java Object to be used as a result of parsing the JSON response of the current rate request.
 *    
 * */
public class BitcoinTestResponse {
	
	

	public BitcoinTestResponse() {
	
	}
	
	static public class Time{
						
	    public Time() {
		}
	    
		@JsonProperty("updated") 
	    public String getUpdated() { 
			 return this.updated; } 
	    public void setUpdated(String updated) { 
			 this.updated = updated; } 
	    String updated;
	    @JsonProperty("updatedISO") 
	    public Date getUpdatedISO() { 
			 return this.updatedISO; } 
	    public void setUpdatedISO(Date updatedISO) { 
			 this.updatedISO = updatedISO; } 
	    Date updatedISO;
	    @JsonProperty("updateduk") 
	    public String getUpdateduk() { 
			 return this.updateduk; } 
	    public void setUpdateduk(String updateduk) { 
			 this.updateduk = updateduk; } 
	    String updateduk;
	}

	static public class USD{
		
		public USD() {
		}
		
	    @JsonProperty("code") 
	    public String getCode() { 
			 return this.code; } 
	    public void setCode(String code) { 
			 this.code = code; } 
	    String code;
	    @JsonProperty("symbol") 
	    public String getSymbol() { 
			 return this.symbol; } 
	    public void setSymbol(String symbol) { 
			 this.symbol = symbol; } 
	    String symbol;
	    @JsonProperty("rate") 
	    public String getRate() { 
			 return this.rate; } 
	    public void setRate(String rate) { 
			 this.rate = rate; } 
	    String rate;
	    @JsonProperty("description") 
	    public String getDescription() { 
			 return this.description; } 
	    public void setDescription(String description) { 
			 this.description = description; } 
	    String description;
	    @JsonProperty("rate_float") 
	    public double getRate_float() { 
			 return this.rate_float; } 
	    public void setRate_float(double rate_float) { 
			 this.rate_float = rate_float; } 
	    double rate_float;
	}

	static public class GBP{
		
		public GBP() {
		}
		
	    @JsonProperty("code") 
	    public String getCode() { 
			 return this.code; } 
	    public void setCode(String code) { 
			 this.code = code; } 
	    String code;
	    @JsonProperty("symbol") 
	    public String getSymbol() { 
			 return this.symbol; } 
	    public void setSymbol(String symbol) { 
			 this.symbol = symbol; } 
	    String symbol;
	    @JsonProperty("rate") 
	    public String getRate() { 
			 return this.rate; } 
	    public void setRate(String rate) { 
			 this.rate = rate; } 
	    String rate;
	    @JsonProperty("description") 
	    public String getDescription() { 
			 return this.description; } 
	    public void setDescription(String description) { 
			 this.description = description; } 
	    String description;
	    @JsonProperty("rate_float") 
	    public double getRate_float() { 
			 return this.rate_float; } 
	    public void setRate_float(double rate_float) { 
			 this.rate_float = rate_float; } 
	    double rate_float;
	}

	static public class EUR{
		
		public EUR() {
		}
		
	    @JsonProperty("code") 
	    public String getCode() { 
			 return this.code; } 
	    public void setCode(String code) { 
			 this.code = code; } 
	    String code;
	    @JsonProperty("symbol") 
	    public String getSymbol() { 
			 return this.symbol; } 
	    public void setSymbol(String symbol) { 
			 this.symbol = symbol; } 
	    String symbol;
	    @JsonProperty("rate") 
	    public String getRate() { 
			 return this.rate; } 
	    public void setRate(String rate) { 
			 this.rate = rate; } 
	    String rate;
	    @JsonProperty("description") 
	    public String getDescription() { 
			 return this.description; } 
	    public void setDescription(String description) { 
			 this.description = description; } 
	    String description;
	    @JsonProperty("rate_float") 
	    public double getRate_float() { 
			 return this.rate_float; } 
	    public void setRate_float(double rate_float) { 
			 this.rate_float = rate_float; } 
	    double rate_float;
	}

	static public class Bpi{
						
	    public Bpi() {
		}
	    
		@JsonProperty("USD") 
	    public USD getUSD() { 
			 return this.uSD; } 
	    public void setUSD(USD uSD) { 
			 this.uSD = uSD; } 
	    USD uSD;
	    @JsonProperty("GBP") 
	    public GBP getGBP() { 
			 return this.gBP; } 
	    public void setGBP(GBP gBP) { 
			 this.gBP = gBP; } 
	    GBP gBP;
	    @JsonProperty("EUR") 
	    public EUR getEUR() { 
			 return this.eUR; } 
	    public void setEUR(EUR eUR) { 
			 this.eUR = eUR; } 
	    EUR eUR;
	}

	
	    @JsonProperty("time") 
	    public Time getTime() { 
			 return this.time; } 
	    public void setTime(Time time) { 
			 this.time = time; } 
	    Time time;
	    @JsonProperty("disclaimer") 
	    public String getDisclaimer() { 
			 return this.disclaimer; } 
	    public void setDisclaimer(String disclaimer) { 
			 this.disclaimer = disclaimer; } 
	    String disclaimer;
	    @JsonProperty("chartName") 
	    public String getChartName() { 
			 return this.chartName; } 
	    public void setChartName(String chartName) { 
			 this.chartName = chartName; } 
	    String chartName;
	    @JsonProperty("bpi") 
	    public Bpi getBpi() { 
			 return this.bpi; } 
	    public void setBpi(Bpi bpi) { 
			 this.bpi = bpi; } 
	    Bpi bpi;	

	
}
