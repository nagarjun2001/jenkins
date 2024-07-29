package com.unittest.unittasks;

public class MOD {
	private MOD(){
		
	}
	public static int mod(int n) {
		int temp=0;
		int m;

		System.Logger logger = System.getLogger("MOD");
		if(n>0) {
			while(n>0) {
				m = n % 10;
				if(m > temp) {
					temp = m;
				}
				n = n / 10;
			}
			logger.log(System.Logger.Level.INFO, temp);
			return 1;
		}
		else {
			return 0;
		}
	}
}
