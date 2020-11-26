package com.demo.springboot.service;

import com.demo.springboot.entity.Courses;
import com.demo.springboot.entity.PartTimeCourse;

public interface CourseService {
	
	
	Courses save(PartTimeCourse course);

}
