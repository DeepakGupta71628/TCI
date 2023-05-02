package com.tci.bonusApp.service;

import java.util.List;
import java.util.Map;

import com.tci.bonusApp.dto.Bonus;
import com.tci.bonusApp.dto.Employee;
import com.tci.bonusApp.exception.tciException;

public interface BonusCalculator {
	public Map<String, List<Employee>> calculate(List<Bonus> bonuses) throws tciException;
}
