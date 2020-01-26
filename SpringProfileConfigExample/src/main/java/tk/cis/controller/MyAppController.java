package tk.cis.controller;

import org.springframework.beans.factory.annotation.Autowired;
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
		return myconfigService.toString();
	}
	
}
