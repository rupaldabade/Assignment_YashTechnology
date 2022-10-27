package com.yash.junit;

import junit.framework.Assert;


public class FibonacciProgTest {
	
	FibonacciProg fb = new FibonacciProg();
	
	@Test
	void testSeris1() {
		//assertEquals("0 1 1", fb.fibonacciSeris(3));
		Assert.assertEquals("0 1 1",fb.fibonacciSeris(3));
	}
	
	@Test
	void testSeris2() {
		//assertEquals("0 1 1", fb.fibonacciSeris(3));
		Assert.assertEquals("0 1 1 2",fb.fibonacciSeris(4));
	}
	
	@Test  
    public void testSeries3(){  
		Assert.assertEquals("0 1 1 2 3",fb.fibonacciSeris(5));  
    }
	
	@Test  
    public void testSeries4(){  
		Assert.assertEquals("0 1 1 2 3 5",fb.fibonacciSeris(6));  
    }
	
	@Test  
    public void testSeries5(){  
		Assert.assertEquals("0 1 1 2 3 5",fb.fibonacciSeris(7));  
    }
	@Test  
    public void testSeries6(){  
		Assert.assertEquals("0 1 1 2 3 5 9",fb.fibonacciSeris(7));  
    }


}
