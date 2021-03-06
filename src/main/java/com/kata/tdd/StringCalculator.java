package com.kata.tdd;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.kata.tdd.exception.InvalidNumberException;

public class StringCalculator {
	
	public static int no_of_time_add_fun_called = 0;
	
	public int Add(String numbers) throws InvalidNumberException {
		//System.out.println(numbers);
		no_of_time_add_fun_called += 1;
		if(numbers==null)
			return 0;
		int sum = 0;
		String errorMsg = "negatives not allowed : ";
		Pattern p = Pattern.compile("(-|)[0-9]+");
		Matcher match = p.matcher(numbers);
		while(match.find()){
			int number = Integer.parseInt(numbers.substring(match.start(),match.end()));
			if(number<0)
				errorMsg += number+" ";
			else if(number<1001)
				sum += number;
		}
		System.out.println(errorMsg);
		if(errorMsg.equalsIgnoreCase("negatives not allowed : "))
			return sum;
		else
			throw new InvalidNumberException(errorMsg);
	}
	
	public int GetCalledCount(){
		return no_of_time_add_fun_called;
	}
}
