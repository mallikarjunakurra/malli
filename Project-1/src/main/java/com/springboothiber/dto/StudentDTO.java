package com.springboothiber.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import com.springboothiber.entities.Courses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class StudentDTO {

	@NotBlank (message="name cannot be blank")
	@NotNull (message="name cannot be null")
	@Size(min=5,max=20, message="name must within 5-20 characters")
	String sname;
	
	@NotBlank(message="Age cannot be blank")
	@NotNull(message="Age cannot be null")
    @Pattern(regexp="[2-4][\\d]{2}$", message="Invalid age")
	int sage;
	
	@NotNull(message="Phone number cannot be null")
	@Pattern(regexp="[6 7 8 9][\\d]{10}$", message="Invalid phone number")
	String scontact;
	
	@NotNull(message="Course cannot be null")
	Courses scourse;
	
}
