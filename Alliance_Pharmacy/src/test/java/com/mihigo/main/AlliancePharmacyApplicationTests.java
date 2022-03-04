package com.mihigo.main;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mihigo.main.repository.DailyRepo;

import java.text.SimpleDateFormat;
import java.util.*;;
@SpringBootTest
class AlliancePharmacyApplicationTests {

	@Autowired
	private DailyRepo rd;
	
	@Test
	void contextLoads() {
		SimpleDateFormat f=new SimpleDateFormat("MM");
		
		Date d=new Date();
		int df=Integer.parseInt(f.format(d));
		String re=rd.get_total_Amount(2);
		
		if(re == null) {
			System.out.println("Hello");
		}
	}

}
