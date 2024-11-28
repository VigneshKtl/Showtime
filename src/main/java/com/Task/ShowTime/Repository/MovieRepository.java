package com.Task.ShowTime.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.Task.ShowTime.Movies;
import com.Task.ShowTime.Shows;

public interface MovieRepository extends JpaRepository<Movies,Integer>{
	@Query(value="SELECT  * FROM Movies  WHERE A_Moviename= :movie",nativeQuery=true)
    public List<Movies> movieDetails(@Param("movie") String movie);
}
