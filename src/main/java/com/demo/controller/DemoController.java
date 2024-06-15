package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	
	
	@GetMapping("/cities")
	public String getCities () {
		return "mumbai,pune,banglore,Delhi,Hyderabad,Nagpur,Pandharpur,satara,shivajainagar,sambhajinagar,ulhasnagar,panvel,Khopili,dombivali,Airoli,Rabale,Turbhe,SANPADA,ahmadabad";
	}

	@GetMapping("/contries")
	public String getContries () {
		return "India,Japan,China,America,Peru,Canada,Pakistan,afganistan,taiwan,Russia,uzbegistan,Ukren";

	}

	
}
