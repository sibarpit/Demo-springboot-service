package io.springbootstart.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
   
	@RequestMapping("/hello") 
	public String sayHello() {
		return "Hello" ;
	}

}
