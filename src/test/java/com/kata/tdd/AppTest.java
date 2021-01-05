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
	 
	 @Test
	    public void sumWith_N_Numbers()
	    {
	        Assert.assertEquals(278, strCal.Add("1,2,0,23,11]236y5"));
	    }
	    
	    @Test
	    public void sumWith_newLine_Numbers()
	    {
	        Assert.assertEquals(267, strCal.Add("1,2,0\n23,\n236\n5"));
	    }
	    
	    @Test
	    public void sumWith_Different_delimiter_Numbers()
	    {
	        Assert.assertEquals(3, strCal.Add("//[;]\n1;2"));
	    }
	    
	    @Test
	    public void sumWith_Multiple_delimiter_Numbers()
	    {
	        Assert.assertEquals(6, strCal.Add("//[;][%]\n1;2%3"));
	    }
	    
	    @Test
	    public void sumWith_Multiple_delimiter_Numbers_case2()
	    {
	        Assert.assertEquals(6, strCal.Add("//[;;][%%]\n1;;2%%3"));
	    }
}
