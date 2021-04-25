package coding.task.searchmetricsbitcointtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import coding.task.searchmetricsbitcointtest.BitcoinTestResponse.USD;

@RestController
public class BitcoinTestRestController {
	
	@Autowired
	BitcoinTestService bitcoinTestService;
	
	
	/**
	 *  Endpoint to get the current bitcoin rate
	 *    
	 * */
	@RequestMapping(method=RequestMethod.GET, path = "/bitcoin-latest")
	public USD getCurrentBitcoinLatestRate() {
		return bitcoinTestService.getBitcoinTestResponse().getBpi().uSD;
	}
	
	/**
	 *  Endpoint to get historical bitcoin rates.
	 *  
	 *  @param startDate
	 *  @param endDate
	 *    
	 * */
	@RequestMapping(method=RequestMethod.GET, path = "/bitcoin-historical/{startDate}/{endDate}")
	public String getCurrentBitcoinHistoricalRates(@PathVariable String startDate, @PathVariable String endDate) {
		return bitcoinTestService.getHistoricalRates(startDate, endDate);		
	}

}
