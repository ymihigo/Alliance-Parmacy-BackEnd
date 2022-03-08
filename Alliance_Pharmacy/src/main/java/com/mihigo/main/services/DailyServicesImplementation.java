package com.mihigo.main.services;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mihigo.main.models.Daily;
import com.mihigo.main.repository.DailyRepo;
import com.mihigo.main.repository.MonthlyRepo;

@Service
public class DailyServicesImplementation implements DailyServices {

	@Autowired
	private DailyRepo dr;


	@Override
	public Daily createDaily(String details, String amount, String date) {

		try {
			if (details.isEmpty() || amount.isEmpty()) {
				throw new RuntimeException("please fill all requirement");
			}

			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			Date d = format.parse(date);

			if (d.after(new Date())) {
				throw new RuntimeException("Invalid Date");
			}
			double am = Double.parseDouble(amount);

			if (am < 1) {
				throw new RuntimeException("Invalid Amount");
			}

			return dr.saveAndFlush(new Daily(details, am, d));
		} catch (Exception ex) {
			throw new RuntimeException(ex.getMessage());
		}
	}

	@Override
	public double totalDailPerMonth(int month) {
		try {
			String c = dr.get_total_Amount(month);
			if (c == null) {
				return 0;
			} else {
				return Double.parseDouble(c);
			}
		} catch (Exception ex) {

		}
		return 0;
	}

	@Override
	public List<Daily> get_All_Dailly() {
		try {
			return dr.findAll();
		} catch (Exception ex) {
			throw new RuntimeException(ex.getMessage());
		}
	}

}
