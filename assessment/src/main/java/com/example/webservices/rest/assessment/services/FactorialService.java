package com.example.webservices.rest.assessment.services;

import java.util.stream.LongStream;

import com.example.webservices.rest.assessment.beans.FactorialInput;
import com.example.webservices.rest.assessment.beans.FactorialOutput;

public interface FactorialService {

	static FactorialOutput findFactorial(FactorialInput input) {

		// Calculate factorial
		long n = input.getInput();
		long o = LongStream.rangeClosed(1, n).reduce(1, (long a, long b) -> a * b);

		// Set output
		FactorialOutput output = new FactorialOutput();
		output.setOutput(o);

		// return output
		return output;
	}

}
