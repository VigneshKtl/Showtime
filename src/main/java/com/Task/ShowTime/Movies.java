package com.Task.ShowTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Movies {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int S_no;
	private String A_Moviename;
	private String B_Genre;
	private String C_Rating;
	
	public Movies() {}
	public Movies(int s_no, String a_Moviename, String b_Genre, String c_Rating) {
		
		S_no = s_no;
		A_Moviename = a_Moviename;
		B_Genre = b_Genre;
		C_Rating = c_Rating;
	}
	public int getS_no() {
		return S_no;
	}
	public void setS_no(int s_no) {
		S_no = s_no;
	}
	public String getA_Moviename() {
		return A_Moviename;
	}
	public void setA_Moviename(String a_Moviename) {
		A_Moviename = a_Moviename;
	}
	public String getB_Genre() {
		return B_Genre;
	}
	public void setB_Genre(String b_Genre) {
		B_Genre = b_Genre;
	}
	public String getC_Rating() {
		return C_Rating;
	}
	public void setC_Rating(String c_Rating) {
		C_Rating = c_Rating;
	}
}
