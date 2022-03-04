package com.mihigo.main.models;

import java.util.Date;

import javax.persistence.*;

@Entity
public class Daily {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String details;
	private double amount;
	@Temporal(TemporalType.DATE)
	private Date date;

	public Daily() {
	}

	public Daily(int id, String details, double amount, Date date) {
		this.id = id;
		this.details = details;
		this.amount = amount;
		this.date = date;
	}

	public Daily(String details, double amount, Date date) {
		this.details = details;
		this.amount = amount;
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
