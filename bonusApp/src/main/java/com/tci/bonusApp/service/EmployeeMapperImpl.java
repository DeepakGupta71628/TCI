package com.tci.bonusApp.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tci.bonusApp.dto.Bonus;
import com.tci.bonusApp.dto.Employee;
import com.tci.bonusApp.exception.tciException;


@Service
@Transactional
public class EmployeeMapperImpl implements EmployeeMapper{
	


	@Override
	public Map<String, List<Employee>> map(List<Bonus> bonuses) throws tciException {
		// TODO Auto-generated method stub
		HashMap<String, List<Employee>> map=new HashMap<>();
		
		for(Bonus bonus:bonuses) {
			if(map.containsKey(bonus.getCurrency())){
				List<Employee> list= map.get(bonus.getCurrency());
				Employee emp=new Employee(bonus.getEmpName(),bonus.getAmount());
				list.add(emp);
			}else {
				List<Employee> list=new ArrayList<Employee>();
				list.add(new Employee(bonus.getEmpName(),bonus.getAmount()));
				map.put(bonus.getCurrency(), list);
			}
		}
		
//		for (Entry<String, List<Employee>> it: map.entrySet())
//        {
//			
//
//			List<Employee> list= map.get(it.getKey());
//			Collections.sort(list);
//        }
		return map;
	}



}
