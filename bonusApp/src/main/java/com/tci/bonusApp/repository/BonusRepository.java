package com.tci.bonusApp.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.tci.bonusApp.entity.Bonus;
import com.tci.bonusApp.exception.TciException;



public interface BonusRepository extends CrudRepository<Bonus, Integer>{

	void saveAll(List<Bonus> bonusesEntityList) throws TciException;

}
