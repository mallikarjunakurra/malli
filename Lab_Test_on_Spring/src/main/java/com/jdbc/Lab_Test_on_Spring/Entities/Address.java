package com.jdbc.Lab_Test_on_Spring.Entities;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Address {

	private String h_no;
	private String area;
	private String city;
	
}
