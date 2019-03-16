package com.in28minutes.springboot.web.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.in28minutes.springboot.web.model.Country;
import com.in28minutes.springboot.web.model.CountryRepository;

@Controller
public class CountryController {
	
	@Autowired
	private CountryRepository countryRepo;
	
	@SuppressWarnings("deprecation")
	@RequestMapping(value="/country", method = RequestMethod.GET)
	public String showPage(Model model, @RequestParam(defaultValue="0") int page) {
		
		model.addAttribute("data", countryRepo.findAll(new PageRequest(page,4)));
		model.addAttribute("currentPage",page);
		
		return "country";
	}
	
	@PostMapping("/save")
	public String save(Country c) {
		countryRepo.save(c);
		
		return "redirect:/";
	}
	
	@GetMapping("/delete")
	public String deleteCountry(Integer id) {
		countryRepo.deleteById(id);
		
		return "redirect:/";
	}
	
	@GetMapping("/findOne")
	@ResponseBody
	public Optional<Country> findOne(Integer id) {
		return countryRepo.findById(id);
	}
	
	
}
