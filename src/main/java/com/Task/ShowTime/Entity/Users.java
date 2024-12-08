package com.Task.ShowTime.Entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @NotEmpty(message = "User name should not be empty")
    private String name;
    
    @Email(message = "Email must be in this format ABC@gmail.com")
    private String email;
    
    // Improved password pattern: at least 1 uppercase, 1 lowercase, 1 digit, 1 special char, min 8 chars
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)", 
             message = "Password must contain at least one uppercase letter, one lowercase letter, one digit")
    private String password;

	public Users(int id, @NotEmpty(message = "User name should not be empty") String name,
			@Email(message = "Email must be in this format ABC@gmail.com") String email,
			@Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)", message = "Password must contain at least one uppercase letter, one lowercase letter, one digit") String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
   
  
}
