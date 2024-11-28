package com.Task.ShowTime;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Shows {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int S_no;
	private String A_Moviename;
	private LocalDate D_Date;
	private LocalTime E_Morningshow;
	private LocalTime F_Matineeshow;
	private LocalTime G_Eveningshow;
	private LocalTime H_Nightshow;
	public Shows() {}
	public Shows(int s_no, String a_Moviename,  LocalDate d_Date,
			LocalTime e_Morningshow, LocalTime f_Matineeshow, LocalTime g_Eveningshow, LocalTime h_Nightshow) {
		super();
		S_no = s_no;
		A_Moviename = a_Moviename;
		D_Date = d_Date;
		E_Morningshow = e_Morningshow;
		F_Matineeshow = f_Matineeshow;
		G_Eveningshow = g_Eveningshow;
		H_Nightshow = h_Nightshow;
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
	
	public LocalDate getD_Date() {
		return D_Date;
	}
	public void setD_Date(LocalDate d_Date) {
		D_Date = d_Date;
	}
	public LocalTime getE_Morningshow() {
		return E_Morningshow;
	}
	public void setE_Morningshow(LocalTime e_Morningshow) {
		E_Morningshow = e_Morningshow;
	}
	public LocalTime getF_Matineeshow() {
		return F_Matineeshow;
	}
	public void setF_Matineeshow(LocalTime f_Matineeshow) {
		F_Matineeshow = f_Matineeshow;
	}
	public LocalTime getG_Eveningshow() {
		return G_Eveningshow;
	}
	public void setG_Eveningshow(LocalTime g_Eveningshow) {
		G_Eveningshow = g_Eveningshow;
	}
	public LocalTime getH_Nightshow() {
		return H_Nightshow;
	}
	public void setH_Nightshow(LocalTime h_Nightshow) {
		H_Nightshow = h_Nightshow;
	}
	
	
	
	}
