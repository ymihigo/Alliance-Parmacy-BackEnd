package com.mihigo.main.models;

import java.util.Date;

import javax.persistence.*;

@Entity
public class Monthly {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private double openingBalance;
	private double salaryone;
	private double salaryTwo;
	private double vat;
	private double rssb;
	private double electricity;
	private double maintenance;
	private double umurenge;
	private double expense;
	private double tpr;
	private double rent;
	private double water;
	private double security;
	private double patent;
	private double totalDaily;
	private Date doneOn = new Date();

	public Monthly() {
		super();
	}

	public Monthly(int id, double openingBalance, double salaryone, double salaryTwo, double vat, double rssb,
			double electricity, double maintenance, double umurenge, double expense, double tpr, double rent,
			double water, double security, double patent, double totalDaily, Date doneOn) {
		this.id = id;
		this.openingBalance = openingBalance;
		this.salaryone = salaryone;
		this.salaryTwo = salaryTwo;
		this.vat = vat;
		this.rssb = rssb;
		this.electricity = electricity;
		this.maintenance = maintenance;
		this.umurenge = umurenge;
		this.expense = expense;
		this.tpr = tpr;
		this.rent = rent;
		this.water = water;
		this.security = security;
		this.patent = patent;
		this.totalDaily = totalDaily;
		this.doneOn = doneOn;
	}

	public Monthly(double openingBalance, double salaryone, double salaryTwo, double vat, double rssb,
			double electricity, double maintenance, double umurenge, double expense, double tpr, double rent,
			double water, double security, double patent, double totalDaily, Date doneOn) {
		this.openingBalance = openingBalance;
		this.salaryone = salaryone;
		this.salaryTwo = salaryTwo;
		this.vat = vat;
		this.rssb = rssb;
		this.electricity = electricity;
		this.maintenance = maintenance;
		this.umurenge = umurenge;
		this.expense = expense;
		this.tpr = tpr;
		this.rent = rent;
		this.water = water;
		this.security = security;
		this.patent = patent;
		this.totalDaily = totalDaily;
		this.doneOn = doneOn;
	}

	public Monthly(double openingBalance, double salaryone, double salaryTwo, double vat, double rssb,
			double electricity, double maintenance, double umurenge, double expense, double tpr, double rent,
			double water, double security, double patent, double totalDaily) {
		this.openingBalance = openingBalance;
		this.salaryone = salaryone;
		this.salaryTwo = salaryTwo;
		this.vat = vat;
		this.rssb = rssb;
		this.electricity = electricity;
		this.maintenance = maintenance;
		this.umurenge = umurenge;
		this.expense = expense;
		this.tpr = tpr;
		this.rent = rent;
		this.water = water;
		this.security = security;
		this.patent = patent;
		this.totalDaily = totalDaily;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getOpeningBalance() {
		return openingBalance;
	}

	public void setOpeningBalance(double openingBalance) {
		this.openingBalance = openingBalance;
	}

	public double getSalaryone() {
		return salaryone;
	}

	public void setSalaryone(double salaryone) {
		this.salaryone = salaryone;
	}

	public double getSalaryTwo() {
		return salaryTwo;
	}

	public void setSalaryTwo(double salaryTwo) {
		this.salaryTwo = salaryTwo;
	}

	public double getVat() {
		return vat;
	}

	public void setVat(double vat) {
		this.vat = vat;
	}

	public double getRssb() {
		return rssb;
	}

	public void setRssb(double rssb) {
		this.rssb = rssb;
	}

	public double getElectricity() {
		return electricity;
	}

	public void setElectricity(double electricity) {
		this.electricity = electricity;
	}

	public double getMaintenance() {
		return maintenance;
	}

	public void setMaintenance(double maintenance) {
		this.maintenance = maintenance;
	}

	public double getUmurenge() {
		return umurenge;
	}

	public void setUmurenge(double umurenge) {
		this.umurenge = umurenge;
	}

	public double getExpense() {
		return expense;
	}

	public void setExpense(double expense) {
		this.expense = expense;
	}

	public double getTpr() {
		return tpr;
	}

	public void setTpr(double tpr) {
		this.tpr = tpr;
	}

	public double getRent() {
		return rent;
	}

	public void setRent(double rent) {
		this.rent = rent;
	}

	public double getWater() {
		return water;
	}

	public void setWater(double water) {
		this.water = water;
	}

	public double getSecurity() {
		return security;
	}

	public void setSecurity(double security) {
		this.security = security;
	}

	public double getPatent() {
		return patent;
	}

	public void setPatent(double patent) {
		this.patent = patent;
	}

	public double getTotalDaily() {
		return totalDaily;
	}

	public void setTotalDaily(double totalDaily) {
		this.totalDaily = totalDaily;
	}

	public Date getDoneOn() {
		return doneOn;
	}

	public void setDoneOn(Date doneOn) {
		this.doneOn = doneOn;
	}

}
