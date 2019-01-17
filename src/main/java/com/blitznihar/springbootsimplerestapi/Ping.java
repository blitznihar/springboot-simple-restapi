package com.blitznihar.springbootsimplerestapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ping {

	@Autowired
	public PingDataRepository repository;

	@RequestMapping("/ping")
	public ResponseEntity<?> ping(@RequestParam(value = "bounce", defaultValue = "") String bounce) {
		String timestamp = java.time.LocalDateTime.now().toString();
		repository.save(new PingData("Simple-RestAPI", bounce, timestamp));
		if (bounce.contains("error")) {
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		} else {
			return new ResponseEntity<>(bounce + "@" + timestamp, HttpStatus.OK);

		}
	}

}
