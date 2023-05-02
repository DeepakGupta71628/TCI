package com.tci.bonusApp;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import com.tci.bonusApp.dto.Bonus;
import com.tci.bonusApp.dto.Employee;
import com.tci.bonusApp.exception.TciException;
import com.tci.bonusApp.service.BonusCalculator;
import com.tci.bonusApp.service.EmployeeMapper;

@SpringBootTest
class BonusAppApplicationTests {

	@Autowired
	private EmployeeMapper employeeMapper;
	
	@Autowired
	private BonusCalculator bonusCalculator;

	
	
	@Test
	void contextLoads() throws TciException {
		HashMap<String,List<Employee>> map=new HashMap<>();
		map.put("INR", new ArrayList<Employee>());
		
		List<Bonus> bonus=new ArrayList<>();
		
		bonus.add(new Bonus("raj singh","accounts",5000,"INR",new Date(0),new Date(0)));


		//Mocking
		Mockito.when(employeeMapper.map(bonus)).thenReturn(map);
		
		//Assertion of service 
		assert(bonusCalculator.calculate(bonus)).equals(map);
		
		
		
	}

}
