package com.Task.ShowTime.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.Task.ShowTime.Entity.*;


public interface MovieRepository extends JpaRepository<Movies,String>{
	@Query(value="select * movies where A_Moviename= :movies",nativeQuery=true)
	public Optional<Movies> getMovieDetails(@Param("movies")String movies);
}
