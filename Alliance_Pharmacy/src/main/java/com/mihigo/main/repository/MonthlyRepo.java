package com.mihigo.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mihigo.main.models.Monthly;

@Repository
public interface MonthlyRepo extends JpaRepository<Monthly, Integer> {

	@Query("FROM Monthly m WHERE MONTH(m.doneOn)= :month AND YEAR(m.doneOn) = YEAR(NOW())")
	Monthly get_Monthly_By_Month(@Param("month") int mo);
}
