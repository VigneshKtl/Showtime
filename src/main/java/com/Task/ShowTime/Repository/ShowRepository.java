package com.Task.ShowTime.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.Task.ShowTime.Shows;

public interface ShowRepository extends JpaRepository<Shows, Integer> {
	@Query(value="SELECT Distinct A_Moviename FROM Shows",nativeQuery=true)
	public List<String> getMovies();

	
	@Query(value="SELECT * FROM Shows  WHERE A_Moviename= :movie and D_Date= :date",nativeQuery=true)
    public List<Shows> showDetails(@Param("movie") String movie,@Param("date") LocalDate date);

}
