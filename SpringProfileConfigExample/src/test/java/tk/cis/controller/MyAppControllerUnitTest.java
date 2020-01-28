package tk.cis.controller;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.ContextConfiguration;

import tk.cis.Ser.MyConfigSer;

@SpringBootTest(classes=MyConfigSer.class )
class MyAppControllerUnitTest {

	@Mock
	private MyConfigSer myConfigSer;
	
	@InjectMocks
	private MyAppController myAppController = new MyAppController();
	
	@BeforeEach
    void setMockOutput() {
        when(myConfigSer.toString()).thenReturn("Hello Mockito From Repository");
    }
	
	 @DisplayName("Test Mock MyAppController + MyConfigSer")
	@Test
	void test() {
		assertEquals(myAppController.getRemoteService(), "Hello Mockito From Repository");
	}

}
