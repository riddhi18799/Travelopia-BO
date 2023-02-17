package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.Traveller;

public interface TravellerDao {

	public abstract void createTraveller(Traveller traveller);

	public abstract List<Traveller> getAllTravellers();

}
