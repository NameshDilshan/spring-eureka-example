package com.namesh.amazonserver.provider.api.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment-provider")
public class PaymentController {
	
	@RequestMapping("/paynow/{price}")
	public String payNow(@PathVariable int price) {
		return "Payment Successful :"+ price + "";
	}
}
