package com.mihigo.main.services;

import java.util.List;

import com.mihigo.main.models.Daily;

public interface DailyServices {

	Daily createDaily(String details, String amount, String date);

	double totalDailPerMonth(String date);

	List<Daily> get_All_Dailly();
}
