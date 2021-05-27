package com.ssii.project.repositories;

import com.ssii.project.models.ProjectModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends CrudRepository<ProjectModel,Long>{

}
