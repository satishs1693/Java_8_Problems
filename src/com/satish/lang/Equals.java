package com.satish.lang;

public class Equals {
	
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Emp st = new Emp(1, "satish");
		
		Adress ad = new Adress("Davuluru");
		Emp st2 = new Emp(1, "satish",ad);
		Emp st6 = (Emp) st2.clone();
		
		
	}
}
