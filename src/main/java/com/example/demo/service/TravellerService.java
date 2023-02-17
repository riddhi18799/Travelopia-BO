package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Traveller;

public interface TravellerService {
	public abstract void createTraveller(Traveller traveller);
	public abstract List<Traveller> getAllTravellers();
}
