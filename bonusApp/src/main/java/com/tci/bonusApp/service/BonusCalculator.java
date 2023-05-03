package com.tci.bonusApp.service;

import java.util.List;
import java.util.Map;

import com.tci.bonusApp.dto.BonusDTO;
import com.tci.bonusApp.dto.EmployeeDTO;
import com.tci.bonusApp.exception.TciException;

public interface BonusCalculator {
	public Map<String, List<EmployeeDTO>> calculate(List<BonusDTO> bonuses) throws TciException;
}
