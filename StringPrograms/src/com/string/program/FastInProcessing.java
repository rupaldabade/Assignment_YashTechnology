package com.string.program;
//5) WAP to demonstrate which is fast in processing StringBuilder or StringBuffer

public class FastInProcessing {
	public static void main(String[] args) {

		long tf = System.currentTimeMillis();//tf - time first
		StringBuffer strBuff = new StringBuffer("Hello");
		for(int i=999999; i>0; i--) {
			strBuff.append("");
		}
		long ts = System.currentTimeMillis();// ts- time second
		StringBuilder strBuil = new StringBuilder("Hello");
		for(int i=999999; i>0; i--) {
			strBuil.append("");
		}
		long tt = System.currentTimeMillis();//tt- time third

		//System.out.println(tt-ts);
		//System.out.println(ts-tf);
		if((tt-ts)>(ts-tf)) {
			System.out.println("StringBuffer is faster");
		}else
			System.out.println("StringBuilder is faster");

	}

}
