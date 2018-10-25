package com.fab.digital.incubation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/mobileserver")
public class AwsMobileBackendApplicationController {
	@Autowired
    RestTemplate restTemplate;
}
