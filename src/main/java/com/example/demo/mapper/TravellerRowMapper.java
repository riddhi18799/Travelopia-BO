package com.example.demo.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.demo.model.Traveller;

public class TravellerRowMapper implements RowMapper<Traveller> {

	@Override
	public Traveller mapRow(ResultSet rs, int rowNum) throws SQLException {
		Traveller traveller = new Traveller();
		traveller.setId(rs.getInt("id"));
		traveller.setName(rs.getString("name"));
		traveller.setEmail(rs.getString("email"));
		traveller.setPlace(rs.getString("place"));
		traveller.setNoOfTravellers(rs.getInt("noOfTravellers"));
		traveller.setBudgetPerPerson(rs.getInt("budgetPerPerson"));
		return traveller;
	}
}
