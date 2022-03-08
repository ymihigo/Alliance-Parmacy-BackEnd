package com.mihigo.main.services;

import com.mihigo.main.models.Monthly;

public interface MonthlyServices {
	Monthly createMonthly(double openingBalance, double salaryone, double salaryTwo, double vat, double rssb,
			double electricity, double maintenance, double umurenge, double tpr, double rent, double water,
			double security, double patient,int month);
	
	Monthly searchMonthlybyMonth(int month);
}
