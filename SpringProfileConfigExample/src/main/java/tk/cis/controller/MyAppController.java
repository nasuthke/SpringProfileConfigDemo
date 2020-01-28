package tk.cis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tk.cis.Ser.MyConfigSer;



@RestController
public class MyAppController {

	@Autowired
	MyConfigSer myconfigService;

	public void setMyconfigService(MyConfigSer myconfigService) {
		this.myconfigService = myconfigService;
	}
	
	
	@RequestMapping("/getRemoteService")
	public String getRemoteService() {
		System.out.println("inside getRemoteService..");
		String value="";
		try {
		value = myconfigService.toString();
		}catch(Exception e) {
			throw new RuntimeException(e);
		}
		return value;
	}
	
	@ExceptionHandler(RuntimeException.class)
	public final ResponseEntity<Exception> handleAllExceptions(RuntimeException ex) {
	    return new ResponseEntity<Exception>(ex, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
}
