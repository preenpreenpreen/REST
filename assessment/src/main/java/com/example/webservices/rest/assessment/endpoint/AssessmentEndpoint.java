package com.example.webservices.rest.assessment.endpoint;

import java.util.stream.LongStream;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.webservices.rest.assessment.beans.FactorialInput;
import com.example.webservices.rest.assessment.beans.FactorialOutput;
import com.example.webservices.rest.assessment.services.FactorialService;

@RestController
public class AssessmentEndpoint {

	@PostMapping("/api/firstfactorial/{n}")
	public static long factorialStreams(@PathVariable int n) {
		return LongStream.rangeClosed(1, n).reduce(1, (long a, long b) -> a * b);
	}
	
    @PostMapping("/api/firstfactorial")
	public FactorialOutput factorialStreams2(@RequestBody FactorialInput input) {     
    	return FactorialService.findFactorial(input);
	}

}
