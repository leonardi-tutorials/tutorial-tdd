package main;

public class CalculadoraFizzBuzz {
	public String calculeFizzBuzz(int i) {
		if (i % 15 == 0) {
            return "fizzbuzz";
        } else if (i % 3 == 0) {
        	return "fizz";
        } else if (i % 5 == 0) {
        	return "buzz";
        } else {
            return String.valueOf(i);
        }
	}
}
