package com.jdbc.Lab_Test_on_Hibernate.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity

@Table(name="Student_details")                       //naming table 
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)  //Auto_incrementation of id column
	private int st_id;
	@Column(length=50, nullable=false)               //Setting parameters of name column
	private String sname;
	@Column(length=10, nullable=false, unique=true)  //Setting parameters of contact column
	private String scontact;
	
}
