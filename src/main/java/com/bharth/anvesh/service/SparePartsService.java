package com.bharth.anvesh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bharth.anvesh.model.Circle;


@Repository
public class SparePartsService {
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public String test(Circle circle)
	{
		String sql="insert into circle(x,y,r) values(?,?,?)";
		jdbcTemplate.update(sql,new Object[] {circle.x,circle.y,circle.r});
		return "Inserted";
	}
	/*public String doInsert(SparePart sparePart){
		String sql="insert into "
				+ "sparepart(partNumber,modelYear,vehicleFamily,lineUpCodeOne,lineUpCodeTwo,lineUpCodeThree,volume,unitOfMeasure)"
				+ "values(?,?,?,?,?,?,?,?)";
		jdbcTemplate.update(sql, new Object[] {sparePart.getPartNumber(),sparePart.getModelYear(),sparePart.getVehicleFamily(),
				sparePart.getLineUpCodeOne(),sparePart.getLineUpCodeTwo(),sparePart.getLineUpCodeThree(),sparePart.getVolume(),sparePart.getUnitOfMeasure()});
		return "Inserted";
		}*/
}
