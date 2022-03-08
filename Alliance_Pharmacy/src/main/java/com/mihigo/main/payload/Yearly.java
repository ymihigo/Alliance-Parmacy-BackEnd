package com.mihigo.main.payload;

import org.springframework.stereotype.Component;

@Component
public class Yearly {
	private int month;
	private double amount;

	public Yearly() {
		super();
	}

	public Yearly(int month, double amount) {
		this.month = month;
		this.amount = amount;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

}
