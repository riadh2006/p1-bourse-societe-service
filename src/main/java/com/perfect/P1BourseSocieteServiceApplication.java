package com.perfect;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.perfect.dao.SocieteRepository;
import com.perfect.entities.Societe;

@SpringBootApplication
public class P1BourseSocieteServiceApplication implements CommandLineRunner{
	
	@Autowired
	private SocieteRepository societeRepository; 

	public static void main(String[] args) {
		SpringApplication.run(P1BourseSocieteServiceApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		societeRepository.save(new Societe("abc", "riadh")); 
		societeRepository.save(new Societe("aramco", "charguia")); 
		societeRepository.save(new Societe("sabic", "riadh")); 
		societeRepository.save(new Societe("stc", "jedda")); 
		societeRepository.save(new Societe("electricty", "riadh")); 
		
	}
}
