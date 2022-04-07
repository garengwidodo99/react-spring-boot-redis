package com.bagaswidodo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bagaswidodo.entity.MasterPriceEntity;

@Repository
public interface MasterPriceRepository extends JpaRepository<MasterPriceEntity, Integer>{

	MasterPriceEntity findFirstById(Integer Id);
	
	List<MasterPriceEntity> findAll();
}
