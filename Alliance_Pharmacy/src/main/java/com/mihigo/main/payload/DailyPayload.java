package com.mihigo.main.payload;

public class DailyPayload {
	private String date;
	private String details;
	private String amount;

	public DailyPayload() {
		super();
	}

	public DailyPayload(String date, String details, String amount) {
		this.date = date;
		this.details = details;
		this.amount = amount;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

}
