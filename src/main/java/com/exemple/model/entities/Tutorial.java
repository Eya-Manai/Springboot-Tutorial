package com.exemple.model.entities;

import java.util.List;
import java.util.Set;

import com.exemple.model.BaseEntity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Builder //relations between tables that uses the methodology do and w8t (Design pattern) it will build the tutorial 
//object and w8t for the relations (lazy loading)
@Getter
@Setter 
@AllArgsConstructor
@NoArgsConstructor 
@JsonIgnoreProperties({"hibernateLazyInitialiser","handler"})
public class Tutorial extends BaseEntity {
	private String title;
	private String description;
	private Boolean published;
	
	@OneToMany(mappedBy = "tutorial")
	private List<Comment> comments;
	
	@OneToOne(cascade = CascadeType.ALL , mappedBy = "tutorial")
	private TutorialDetails tutorialDetails;
	
	@ManyToMany(mappedBy = "tutorials", cascade = {CascadeType.PERSIST,CascadeType.MERGE})
	private Set<Tag> tags;
    private double price;
}
