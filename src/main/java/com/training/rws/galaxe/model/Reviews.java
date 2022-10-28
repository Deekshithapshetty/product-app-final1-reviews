package com.training.rws.galaxe.model;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;


import lombok.Data;

@Entity
@Data
public class Reviews {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String reviewName;
	private String reveiwByEmail;
	private int rating;
	
}
