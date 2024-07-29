package com.unittest.unittasks;

public class SumOfDigits {
	private SumOfDigits() {
		
	}
	
	public static int sod(int n) {
		int temp = 0;
		int m;
		
		if(n>0) {
			while(n>0) {
				m = n%10;
				temp = temp+m;
				n = n/10;
			}
			return 1;
		}
		else {
			return 0;
		}
	}

}
