package com.tci.bonusApp.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tci.bonusApp.dto.BonusDTO;
import com.tci.bonusApp.dto.EmployeeDTO;
import com.tci.bonusApp.exception.TciException;


@Service
@Transactional
public class EmployeeMapperImpl implements EmployeeMapper{
	


	@Override
	public Map<String, List<EmployeeDTO>> map(List<BonusDTO> bonuses) throws TciException {
		// TODO Auto-generated method stub
		HashMap<String, List<EmployeeDTO>> map=new HashMap<>();
		
		for(BonusDTO bonus:bonuses) {
			if(map.containsKey(bonus.getCurrency())){
				List<EmployeeDTO> list= map.get(bonus.getCurrency());
				EmployeeDTO emp=new EmployeeDTO(bonus.getEmpName(),bonus.getAmount());
				list.add(emp);
			}else {
				List<EmployeeDTO> list=new ArrayList<EmployeeDTO>();
				list.add(new EmployeeDTO(bonus.getEmpName(),bonus.getAmount()));
				map.put(bonus.getCurrency(), list);
			}
		}
		
		for ( String key:map.keySet())
        {

			List<EmployeeDTO> list= map.get(key);
			Collections.sort(list);
        }
		
		return map;
	}



}
