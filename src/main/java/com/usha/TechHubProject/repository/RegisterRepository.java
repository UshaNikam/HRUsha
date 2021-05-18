package com.usha.TechHubProject.repository;

import java.util.List;

import com.usha.TechHubProject.model.course;

public interface RegisterRepository {
	
	public boolean isAddCourse(course c);
	public List<course> getallCourse();

}