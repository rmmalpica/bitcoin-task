package coding.task.searchmetricsbitcointtest;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Service;
import org.springframework.boot.CommandLineRunner;
import org.springframework.web.reactive.function.client.WebClient;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 *  The BitcoinTestService class provides methods to request the Coindesk API and create
 *  a scheduled executor service to check the bitcoin rate every n seconds.
 *  Also checks the validity of the check period passed as parameter.
 *    
 * */  

@Service
public class BitcoinTestService implements CommandLineRunner{
	
	
	int defaultPeriod = 5000; //Five seconds
	int period = 0;
	WebClient webClient;
	
	private ScheduledExecutorService scheduledExecutorService;
	private BitcoinTestResponse bitcoinTestResponse;
	
	/**
	 *  Inits the root url to request the API
	 *    
	 * */

	public BitcoinTestService(WebClient.Builder webClientBuilder) {
		
		this.webClient = webClientBuilder.baseUrl("https://api.coindesk.com/v1/bpi").build();
	}


	/**
	 *  Sets the scheduler to check the current rate every n seconds passed by parameter
	 *    
	 * */
	@Override
	public void run(String... args) throws Exception {

		if(args.length == 0 || !isValid(args[0])) {
			
			period = defaultPeriod;
			System.out.println("Using default (5 seconds)");	 
		}
		else {
			
			period =  Integer.valueOf(args[0]);
		}
		
		scheduledExecutorService = Executors.newScheduledThreadPool(1);
		scheduledExecutorService.scheduleWithFixedDelay(() -> {
			
			getCurrentRate();
			
		}, 1, period, TimeUnit.MILLISECONDS);
	}
	
	/**
	 *  Request the current rate to the API and uses Jackson to convert JSON to a Java Object
	 *    
	 * */
	public void getCurrentRate() {

		 String response = this.webClient.get().uri("/currentprice.json")
		.retrieve()
		.bodyToMono(String.class)
		.block();
		
		 ObjectMapper om = new ObjectMapper();
		 try {
			bitcoinTestResponse = om.readValue(response, BitcoinTestResponse.class);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		 
		System.out.println(bitcoinTestResponse.getBpi().getUSD().rate);

	}		
	
	/**
	 *  Request the the historicals rates to the API
	 *    
	 * */
	public String getHistoricalRates(String startDate, String endDate) {

		 String response = this.webClient.get().uri("/historical/close.json?start=" + startDate + "&end=" + endDate)
		.retrieve()
		.bodyToMono(String.class)
		.block();
		
		 return response; 		
	}
	
	/**
	 *  Checks the validity of the parameter.
	 *    
	 * */
	private boolean isValid(String arg) {
		
		int value = 0;
		
		try {
			value = Integer.valueOf(arg);
		}
		catch(Exception e) {
			
			System.out.println("ERROR - Request period is not a valid number");
			return false;
		}
		
		if(value < 1000 || value > 60000) {
			System.out.println("ERROR - Request period should be between one second and one minute");
			return false;
		}
		
		return true;
	}

	/**
	 *  Return the Java Object with the last information about the current rate
	 *    
	 * */
	public BitcoinTestResponse getBitcoinTestResponse() {
		return bitcoinTestResponse;
	}

		
}
