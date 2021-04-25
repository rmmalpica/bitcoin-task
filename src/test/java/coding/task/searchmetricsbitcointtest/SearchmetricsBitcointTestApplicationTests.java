package coding.task.searchmetricsbitcointtest;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SearchmetricsBitcointTestApplicationTests {

	@Autowired
	BitcoinTestService bitcoinTestService;
	
	@Test
	void testCurrentRate() {
		
		bitcoinTestService.getCurrentRate();
		BitcoinTestResponse bitcoinTestResponse = bitcoinTestService.getBitcoinTestResponse();
		assertThat(bitcoinTestResponse).isNotNull();
		assertThat(bitcoinTestResponse.getBpi().uSD.rate_float).isNotZero();
	}
	
	@Test
	void testHistoricalRates() {
		
		String response = bitcoinTestService.getHistoricalRates("2020-10-10", "2020-10-20");		
		assertThat(response).isNotNull();
		assertThat(response).isNotEmpty();
	}

}
