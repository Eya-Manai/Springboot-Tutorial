package com.exemple.model.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
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

public class TutorialDetails {
	@Id
	private long id;
	private String cover;
	private String author;
	@MapsId
	@JoinColumn(name ="tutorial_ID")
	@OneToOne(optional = false)
	private Tutorial tutorial;

}

