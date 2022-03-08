package com.mihigo.main.payload;

public class MonthlyPayload {
	private double openingBalance;
	private double salaryone;
	private double salaryTwo;
	private double vat;
	private double rssb;
	private double electricity;
	private double maintenance;
	private double umurenge;
	private double tpr;
	private double rent;
	private double water;
	private double security;
	private double patient;
	private int month;

	public MonthlyPayload() {
		super();
	}

	public MonthlyPayload(double openingBalance, double salaryone, double salaryTwo, double vat, double rssb,
			double electricity, double maintenance, double umurenge, double tpr, double rent, double water,
			double security, double patient, int month) {
		this.openingBalance = openingBalance;
		this.salaryone = salaryone;
		this.salaryTwo = salaryTwo;
		this.vat = vat;
		this.rssb = rssb;
		this.electricity = electricity;
		this.maintenance = maintenance;
		this.umurenge = umurenge;
		this.tpr = tpr;
		this.rent = rent;
		this.water = water;
		this.security = security;
		this.patient = patient;
		this.month = month;
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

	public double getPatient() {
		return patient;
	}

	public void setPatient(double patient) {
		this.patient = patient;
	}

	public int getmonth() {
		return month;
	}

	public void setmonth(int month) {
		this.month = month;
	}
}
