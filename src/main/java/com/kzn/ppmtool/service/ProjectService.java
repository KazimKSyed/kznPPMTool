package com.kzn.ppmtool.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kzn.ppmtool.domain.Project;
import com.kzn.ppmtool.repository.ProjectRepository;

@Service
public class ProjectService  {
	
	@Autowired
	private ProjectRepository projectRepository;
	
	public Project saveOrUpdate(Project project) {
		return projectRepository.save(project);
	}

}
