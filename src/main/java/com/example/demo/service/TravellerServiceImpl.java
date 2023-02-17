package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.TravellerDao;
import com.example.demo.model.Traveller;

@Service
public class TravellerServiceImpl implements TravellerService {
	
	@Autowired
	private TravellerDao travellerDao;

	@Override
	public void createTraveller(Traveller traveller) {
		// TODO Auto-generated method stub
		travellerDao.createTraveller(traveller);
	}

	@Override
	public List<Traveller> getAllTravellers() {
		// TODO Auto-generated method stub
		return travellerDao.getAllTravellers();
	}

}
