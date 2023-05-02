package com.tci.bonusApp.api;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tci.bonusApp.dto.Bonus;
import com.tci.bonusApp.dto.Employee;
import com.tci.bonusApp.exception.tciException;
import com.tci.bonusApp.service.BonusCalculator;

@RestController
@RequestMapping("/tci")
@CrossOrigin
public class TciRestController {
	
	
	@Autowired
	private BonusCalculator bonusCalculator;
	
	@GetMapping("/bonus/eligibility")
	public ResponseEntity<Map<String, List<Employee>> > caluclateBonus (@RequestBody List<Bonus> bonus) throws tciException {
		
		Map<String, List<Employee>> bonusEmp=bonusCalculator.calculate(bonus);
		
		return new ResponseEntity<>(bonusEmp, HttpStatus.OK);
	}
		
}
