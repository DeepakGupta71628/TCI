package com.tci.bonusApp.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.tci.bonusApp.entity.Bonus;



public interface BonusRepository extends CrudRepository<Bonus, Integer>{

	void saveAll(List<Bonus> bonusesEntityList);

}
