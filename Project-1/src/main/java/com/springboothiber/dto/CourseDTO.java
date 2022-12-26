package com.springboothiber.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CourseDTO {
	
    //@NotBlank (message="Course cannot be blank")
	//@NotNull (message="Course cannot be null")
	String cname;
}
