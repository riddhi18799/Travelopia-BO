package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.TravellerDao;
import com.example.demo.model.Traveller;
import com.example.demo.service.TravellerService;

@RestController
@RequestMapping("/traveller")
public class TravellerController {
	
	@Autowired
	private TravellerService service;
	
	@PostMapping("/createTraveller")
	public boolean addTraveller(@RequestBody Traveller travellers) {
		service.createTraveller(travellers);
		return true;
	}
	
	@GetMapping("/getAllTravellers")
	public List<Traveller> getAllTravellers(){
		return service.getAllTravellers();
	}
	
}
