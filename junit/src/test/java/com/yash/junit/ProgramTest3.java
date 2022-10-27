package com.yash.junit;
/**
 * 
 */
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ProgramTest3 {
Program3 e = new Program3();
	
    @Test
    public void testFindTotalEvenOddDigit1(){  
    	assertEquals("3 4",e.findTotalEvenOddDigit(1234567));  
    } 
    
    @Test
    public void testFindTotalEvenOddDigit2(){  
    	assertEquals("5 6",e.findTotalEvenOddDigit(1234567));  
    } 
}
