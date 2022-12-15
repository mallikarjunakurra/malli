package com.jdbc.Lab_Test_on_Spring.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Student {

	@Id
	private int sid;
	private String sname;
}
