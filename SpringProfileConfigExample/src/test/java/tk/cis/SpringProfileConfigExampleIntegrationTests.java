package tk.cis;


import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.net.URL;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class SpringProfileConfigExampleIntegrationTests {

	// bind the above RANDOM_PORT
    @LocalServerPort
    private int port;
	
    @Autowired
    private TestRestTemplate restTemplate;
    
    
	@Test
	void contextLoads() throws Exception {
		 ResponseEntity<String> response = restTemplate.getForEntity(
					new URL("http://localhost:" + port + "/getRemoteService").toString(), String.class);
		        assertNotEquals("Hello Controller", response.getBody());
	}

}
