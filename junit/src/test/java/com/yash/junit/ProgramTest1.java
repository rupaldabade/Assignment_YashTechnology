package com.yash.junit;

import static org.junit.Assert.assertEquals;

public class ProgramTest1 {
	  Program1 con = new Program1();
	    
	    @Test
	    public void testConsecutive1(){  
	    	int a[] = {1,2,3,4,5,6,7,8,9};
	        assertEquals(45,con.findConsecutive(a));  
	    } 
	    
	    @Test
	    public void testConsecutive2(){  
	    	int a[] = {1,2,3,4,5,6,7,8,9};
	        assertEquals(46,con.findConsecutive(a));  
	    }
}
