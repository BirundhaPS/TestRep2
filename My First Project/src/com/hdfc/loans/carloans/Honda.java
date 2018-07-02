package com.hdfc.loans.carloans;

public class Honda {

	int a=10, b=20, c;
	public void add() {
		c=a+b;
		System.out.println(c);
		}
	public void Sub() {
		c=a-b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		System.out.println("Hello World!");
		Honda obj=new Honda();
		obj.add();
		obj.Sub();
	}
}
