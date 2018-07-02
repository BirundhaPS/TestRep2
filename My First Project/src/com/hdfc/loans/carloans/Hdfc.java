package com.hdfc.loans.carloans;




public class Hdfc implements Rbi{

	public static void main(String[] args) {
		Hdfc h=new Hdfc();
		h.deposit();
		h.withdrawl();
	}

	@Override
	public void withdrawl() {
		System.out.println("Print Withdrawl Amount");
			}

	@Override
	public void deposit() {
		System.out.println("Print Deposit Amount");
	}

}
