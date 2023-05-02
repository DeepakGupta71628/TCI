package com.tci.bonusApp.service;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tci.bonusApp.dto.Bonus;
import com.tci.bonusApp.dto.Employee;
import com.tci.bonusApp.exception.TciException;

@Service
@Transactional
public class BonusCalculatorImpl implements BonusCalculator {
	
	@Autowired
	private EmployeeMapper employeeMapper;

	@Override
	public Map<String, List<Employee>> calculate(List<Bonus> bonuses) throws TciException {
		// TODO Auto-generated method stub
		
		Date ctrDate =new Date();
		List<Bonus> filtered=bonuses.stream().filter(b->b.joiningDate.before(ctrDate)).filter(b->b.exitDate.after(ctrDate)).collect(Collectors.toList());
		//List<Bonus> filtered=bonuses.stream().collect(Collectors.toList());
		System.out.println(filtered);
		Map<String, List<Employee>> mapToEmployee = employeeMapper.map(filtered);
		
		return mapToEmployee;
	}



}
