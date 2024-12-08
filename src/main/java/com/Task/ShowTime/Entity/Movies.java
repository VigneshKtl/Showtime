package com.Task.ShowTime.Entity;

import java.sql.Blob;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Movies {
	@Id
	private String Moviename;
	private String Genre;
	private String Rating;
	public Movies() {
		
	}
	public Movies(String moviename, String genre, String rating) {
		super();
		Moviename = moviename;
		Genre = genre;
		Rating = rating;
	}
	public String getMoviename() {
		return Moviename;
	}
	public void setMoviename(String moviename) {
		Moviename = moviename;
	}
	public String getGenre() {
		return Genre;
	}
	public void setGenre(String genre) {
		Genre = genre;
	}
	public String getRating() {
		return Rating;
	}
	public void setRating(String rating) {
		Rating = rating;
	}
	
	
	
	
}
