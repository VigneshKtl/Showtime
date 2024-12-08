package com.Task.ShowTime.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.Task.ShowTime.Entity.*;

public interface ShowRepository extends JpaRepository<Shows, Integer> {
	@Query(value="select * from shows where date= :date",nativeQuery=true)
public List<Shows> getShowsByDate(@Param("date") LocalDate date);
	@Query(value="select * from shows where theater= :theatername",nativeQuery=true)
public List<Shows> getShowTimimgsForTheater(@Param("theatername")String theatername);
}
