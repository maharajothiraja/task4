package org.test;

import javax.annotation.processing.SupportedSourceVersion;

public class Sample {
	public static void main(String[] args) {
		int s[]=new int[4];
		s[0]=10;
		s[1]=20;
		s[2]=30;
		s[3]=40;
		int a=s.length;
		System.out.println(a);
		System.out.println("iteration use normal for loop");
		for (int j : s) {
			
		
			System.out.println(j);
		}
	}

}
