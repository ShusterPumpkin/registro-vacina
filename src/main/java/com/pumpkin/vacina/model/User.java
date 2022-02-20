package com.pumpkin.vacina.model;
import javax.persistence.*;

import org.springframework.lang.NonNull;


@Entity
@Table(name = "users")
public class User {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
     
	@NonNull
    @Column(nullable = false, unique = true, length = 45)
    private String email;
     
	@NonNull
    @Column(nullable = false, unique = true, length = 11)
    private String cpf;
     
	@NonNull
    @Column(nullable = false, length = 20)
    private String name;
     
	@NonNull
    @Column(nullable = false, length = 20)
    private String date;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
    
    
}
