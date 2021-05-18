package com.usha.TechHubProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usha.TechHubProject.repository.RegisterRepoImpl;
import com.usha.TechHubProject.model.course;

@Service("registerService")
public class RegisterServiceImpl implements RegisterService{
	
	@Autowired
	RegisterRepoImpl registerRepo;

	@Override
	public boolean isAddCourse(course c) {
		// TODO Auto-generated method stub
		boolean b= registerRepo.isAddCourse(c);
		return b;
	}

	
	public List<course> getallCourse() {
		// TODO Auto-generated method stub
		return registerRepo.getallCourse();
	}

}
