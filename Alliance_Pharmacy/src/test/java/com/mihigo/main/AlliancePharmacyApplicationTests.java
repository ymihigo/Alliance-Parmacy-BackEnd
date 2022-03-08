package com.mihigo.main;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mihigo.main.models.Monthly;
import com.mihigo.main.payload.Yearly;
import com.mihigo.main.repository.DailyRepo;
import com.mihigo.main.repository.MonthlyRepo;
import com.mihigo.main.services.DailyServices;
import com.mihigo.main.services.YearService;

import java.text.SimpleDateFormat;
import java.util.*;;

@SpringBootTest
class AlliancePharmacyApplicationTests {

	@Autowired
	private DailyRepo rd;

	@Autowired
	private DailyServices ds;
	@Autowired
	private MonthlyRepo mr;

	@Autowired
	private YearService ys;

	@Test
	void contextLoads() {
		List<Yearly> l = ys.getTotals();
		l.forEach(x -> {
			System.out.println(x.getMonth() + " : " + x.getAmount());
		});
	}

}
