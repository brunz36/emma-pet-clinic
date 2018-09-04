package com.bribeiro.emmapetclinic.model;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Pet {
	
	private PetType petType;
	private String owner;
	private LocalDate birthDate;
}
