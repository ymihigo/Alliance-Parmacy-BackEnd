package com.mihigo.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mihigo.main.models.Monthly;

@Repository
public interface MonthlyRepo extends JpaRepository<Monthly, Integer> {

}
