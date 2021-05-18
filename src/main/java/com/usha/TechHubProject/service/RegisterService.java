package com.usha.TechHubProject.service;

import java.util.List;

import com.usha.TechHubProject.model.course;

public interface RegisterService {
	
	public boolean isAddCourse(course c);
	public List<course> getallCourse();

}
