package com.kata.tdd;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {
	
	public int Add(String numbers) {
		//System.out.println(numbers);
		int sum = 0;
		Pattern p = Pattern.compile("[0-9]+");
		Matcher match = p.matcher(numbers);
		while(match.find()){
			int number = Integer.parseInt(numbers.substring(match.start(),match.end()));
			sum += number;
		}
		return sum;
	}

}
