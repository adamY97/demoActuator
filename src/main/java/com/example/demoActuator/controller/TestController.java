package com.example.demoActuator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;

@RestController
public class TestController {

	private Counter counter;
	
	public TestController(MeterRegistry registry) {
		this.counter = Counter.builder("invocaciones.hola").description("Invocaciones totales").register(registry);
	}
	
	@GetMapping("/holaMundo")
	public String holaMundo() {
		counter.increment();
		return "Hola Mundo";
	}
}
