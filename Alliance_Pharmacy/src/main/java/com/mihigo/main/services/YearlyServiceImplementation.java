package com.mihigo.main.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mihigo.main.models.Monthly;
import com.mihigo.main.payload.Yearly;
import com.mihigo.main.repository.DailyRepo;
import com.mihigo.main.repository.MonthlyRepo;

@Service
public class YearlyServiceImplementation implements YearService {

	@Autowired
	private DailyRepo dr;

	@Autowired
	private MonthlyRepo mr;

	@Override
	public List<Yearly> getTotals() {
		try {
			List<Yearly> ll = new ArrayList<>();
			int i;
			for (i = 1; i <= 12; i++) {
				double sum = 0, sumD = 0, sumM = 0;
				if (dr.get_total_Amount(i) == null) {
					sumD = 0;
				} else {
					sumD = Double.parseDouble(dr.get_total_Amount(i));
				}
				Monthly mz = mr.get_Monthly_By_Month(i);
				if (mz == null) {
					sumM = 0;
					mz = new Monthly(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, i);
				} else {
					sumM = (mz.getElectricity() + mz.getMaintenance() + mz.getpatient() + mz.getRent() + mz.getRssb()
							+ mz.getSalaryone() + mz.getSalaryTwo() + mz.getSecurity() + mz.getTpr() + mz.getUmurenge()
							+ mz.getVat() + mz.getWater());
				}

				sum = mz.getOpeningBalance() - (sumD + sumM);

				ll.add(new Yearly(i, sum));

			}

			return ll;
		} catch (Exception ex) {
			// TODO: handle exception
		}
		return null;
	}

}
