package com.tci.bonusApp.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tci.bonusApp.dto.BonusDTO;
import com.tci.bonusApp.dto.EmployeeDTO;
import com.tci.bonusApp.entity.Bonus;
import com.tci.bonusApp.entity.Department;
import com.tci.bonusApp.exception.TciException;
import com.tci.bonusApp.repository.BonusRepository;

@Service
@Transactional
public class BonusCalculatorImpl implements BonusCalculator {
	
	@Autowired
	private EmployeeMapper employeeMapper;
	
	@Autowired
	private BonusRepository bonusRepository;

	@Override
	public Map<String, List<EmployeeDTO>> calculate(List<BonusDTO> bonuses) throws TciException {
		// TODO Auto-generated method stub
		
		List<Bonus> bonusesEntityList =new ArrayList<>();
		
		for(BonusDTO dto:bonuses) {
			Bonus entity =new Bonus();
			
			entity.setAmount(dto.getAmount());
			entity.setCurrency(dto.getCurrency());
			entity.setDepartment(new Department(dto.getDepartment()));
			entity.setEmpName(dto.getEmpName());
			entity.setExitDate(dto.getExitDate());
			entity.setJoiningDate(dto.getJoiningDate());
			
			bonusesEntityList.add(entity);
			
		}
		
		bonusRepository.saveAll(bonusesEntityList);
		
		
		//filtration
		Date ctrDate =new Date();
		List<BonusDTO> filtered=bonuses.stream().filter(b->b.joiningDate.before(ctrDate)).filter(b->b.exitDate.after(ctrDate)).collect(Collectors.toList());
		//List<Bonus> filtered=bonuses.stream().collect(Collectors.toList());
		System.out.println(filtered);
		Map<String, List<EmployeeDTO>> mapToEmployee = employeeMapper.map(filtered);
		
		return mapToEmployee;
	}



}
