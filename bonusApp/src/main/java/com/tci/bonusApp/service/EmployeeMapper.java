/**
 * 
 */
package com.tci.bonusApp.service;

import java.util.List;
import java.util.Map;

import com.tci.bonusApp.dto.Bonus;
import com.tci.bonusApp.dto.Employee;
import com.tci.bonusApp.exception.tciException;

/**
 * @author Deepak Gupta
 *
 */
public interface EmployeeMapper {
	public Map<String, List<Employee>> map (List<Bonus> bounses) throws tciException;
}
