package com.example.tutorial.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.tutorial.model.Tutorial;

@RepositoryRestResource (collectionResourceRel = "tutorials", path = "tutorials")
public interface TutorialRepo extends JpaRepository<Tutorial, Long>{

}
