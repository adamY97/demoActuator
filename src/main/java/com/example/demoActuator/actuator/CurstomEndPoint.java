package com.example.demoActuator.actuator;

import org.springframework.boot.actuate.endpoint.web.annotation.RestControllerEndpoint;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@RestControllerEndpoint(id = "customEndpoint")
public class CurstomEndPoint {

	@GetMapping("/")
	public ResponseEntity<String> customEndponit(){
		return new ResponseEntity<>("Prueba del controller", HttpStatus.OK);
	}
}
