/**
 * 
 */
package com.tci.bonusApp.service;

import java.util.List;
import java.util.Map;

import com.tci.bonusApp.dto.BonusDTO;
import com.tci.bonusApp.dto.EmployeeDTO;
import com.tci.bonusApp.exception.TciException;

/**
 * @author Deepak Gupta
 *
 */
public interface EmployeeMapper {
	public Map<String, List<EmployeeDTO>> map (List<BonusDTO> bounses) throws TciException;
}
