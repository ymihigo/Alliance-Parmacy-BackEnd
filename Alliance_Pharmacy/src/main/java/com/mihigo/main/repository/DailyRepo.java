package com.mihigo.main.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mihigo.main.models.Daily;

@Repository
public interface DailyRepo extends JpaRepository<Daily, Integer> {

	
	@Query("SELECT SUM(d.amount) FROM Daily d WHERE MONTH(d.date)= :month")
	String get_total_Amount(@Param("month") int mo);
	
}
