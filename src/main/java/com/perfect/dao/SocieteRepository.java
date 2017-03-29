package com.perfect.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.perfect.entities.Societe;

@RepositoryRestResource
public interface SocieteRepository extends JpaRepository<Societe, Long> {

}
