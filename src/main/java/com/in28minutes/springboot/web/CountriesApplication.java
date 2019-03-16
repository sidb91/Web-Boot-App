package com.in28minutes.springboot.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.in28minutes.springboot.web.model.Country;
import com.in28minutes.springboot.web.model.CountryRepository;

@SpringBootApplication
@ComponentScan("com.in28minutes.springboot.web")
public class CountriesApplication implements CommandLineRunner{
	
	@Autowired
	private CountryRepository countryRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(CountriesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		countryRepo.save(new Country("India","New Delhi"));
		countryRepo.save(new Country("China","Beijing"));
		countryRepo.save(new Country("Nepal","Kathmandu"));
		countryRepo.save(new Country("Nepal","Kathmandu"));
		countryRepo.save(new Country("Nepal","Kathmandu"));
		countryRepo.save(new Country("Nepal","Kathmandu"));
		countryRepo.save(new Country("Nepal","Kathmandu"));
		countryRepo.save(new Country("Nepal","Kathmandu"));
		countryRepo.save(new Country("Nepal","Kathmandu"));
		countryRepo.save(new Country("Nepal","Kathmandu"));
		countryRepo.save(new Country("Nepal","Kathmandu"));
		countryRepo.save(new Country("Nepal","Kathmandu"));
	}

}
