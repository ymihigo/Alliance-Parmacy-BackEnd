package com.mihigo.main.services;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.stereotype.Service;

import com.mihigo.main.models.Monthly;
import com.mihigo.main.repository.MonthlyRepo;

@Service
public class MonthlyServicesImplementation implements MonthlyServices {

	@Autowired
	private MonthlyRepo mr;

	@Override
	public Monthly createMonthly(double openingBalance, double salaryone, double salaryTwo, double vat, double rssb,
			double electricity, double maintenance, double umurenge, double tpr, double rent, double water,
			double security, double patient, int month) {
		try {
			if (month < 1 || month > 12) {
				throw new RuntimeException("Invalid month selection");
			}

			Monthly mm = mr.get_Monthly_By_Month(month);

			if (mm == null) {

				Date d = new Date();
				String day = "28";
				int year = LocalDate.now().getYear();
				String mon = String.valueOf(month);
				DateFormatter format = new DateFormatter("yyyy-MM-dd");
				Date dd = format.parse(year + "-" + mon + "-" + day, Locale.ENGLISH);

				return mr.saveAndFlush(new Monthly(openingBalance, salaryone, salaryTwo, vat, rssb, electricity,
						maintenance, umurenge, tpr, rent, water, security, patient, dd, month));
			} else {
				return mr.saveAndFlush(
						new Monthly(mm.getId(), openingBalance, salaryone, salaryTwo, vat, rssb, electricity,
								maintenance, umurenge, tpr, rent, water, security, patient, mm.getDoneOn(), month));
			}

		} catch (Exception ex) {
			throw new RuntimeException(ex.getMessage());
		}
	}

	@Override
	public Monthly searchMonthlybyMonth(int month) {
		try {
			Monthly mm = mr.get_Monthly_By_Month(month);
			if (mm == null) {
				return new Monthly(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, month);
			} else {
				return mm;
			}
		} catch (Exception ex) {
			throw new RuntimeException(ex.getMessage());
		}
	}

}
