package com.kata.tdd;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	StringCalculator strCal = new StringCalculator();
	
	/**
     * Rigorous Test :-)
     * @throws InvalidNumberException 
     */
	 @Test
	 public void sumWith_Three_Numbers()
	 {
		 Assert.assertEquals(0, strCal.Add(""));
	     Assert.assertEquals(1, strCal.Add("1"));
	     Assert.assertEquals(3, strCal.Add("1,2,0"));
	 }
}
