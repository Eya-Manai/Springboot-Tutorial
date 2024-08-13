package com.exemple.model.entities;

import java.util.List;

import com.exemple.model.BaseEntity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitialiser","handler"})

public class User extends BaseEntity {
	private long id;
	private String lastname;
	private String firstName;
	private String email;
	private String password;
	@Enumerated(EnumType.STRING)
	@Column(columnDefinition = "varchar(30) default 'User'")
	private Grade grade;


	private int age;
	
	@OneToMany(mappedBy = "user")
	private List<Comment>comment;
	

}
