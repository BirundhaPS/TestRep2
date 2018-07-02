package com.hdfc.loans.carloans;

public class AbstractClass extends Firstabstract {

	public static void main(String[] args) {
			AbstractClass AC=new AbstractClass();
			AC.m1();
			AC.m2();
	}
	@Override
	public void m2() {
		System.out.println("Abstract method and abstract behaviour");		
	}
}
