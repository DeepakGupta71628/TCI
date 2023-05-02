package com.tci.bonusApp.service;

import java.util.List;
import java.util.Map;

import com.tci.bonusApp.dto.Bonus;
import com.tci.bonusApp.dto.Employee;
import com.tci.bonusApp.exception.TciException;

public interface BonusCalculator {
	public Map<String, List<Employee>> calculate(List<Bonus> bonuses) throws TciException;
}
