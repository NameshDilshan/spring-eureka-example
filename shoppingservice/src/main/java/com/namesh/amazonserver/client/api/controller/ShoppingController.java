package com.namesh.amazonserver.client.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ShoppingController {

	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/amazon-payment/{price}")
	public String invokePaymentService(@PathVariable int price) {
		String url = "http://PAYMENT-SERVICE/payment-provider/paynow/" + price;
		return restTemplate.getForObject(url, String.class);
	}
}
