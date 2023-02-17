package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.mapper.TravellerRowMapper;
import com.example.demo.model.Traveller;

@Repository
public class TravellerDoaImpl implements TravellerDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void createTraveller(Traveller traveller) {
		// TODO Auto-generated method stub
		String SQL = "insert into travellers(name, email, place, noOfTravellers, budgetPerPerson) values (?,?,?,?,?);";
		int update = getJdbcTemplate().update(SQL,traveller.getName(),traveller.getEmail(),traveller.getPlace(),traveller.getNoOfTravellers(), traveller.getBudgetPerPerson());
		if(update == 1) {
			System.out.println("Traveller is created..");
		}
	}

	@Override
	public List<Traveller> getAllTravellers() {
		String SQL = "SELECT * FROM travellers";
		return getJdbcTemplate().query(SQL, new TravellerRowMapper());
	}

}
