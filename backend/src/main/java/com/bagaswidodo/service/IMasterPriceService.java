package com.bagaswidodo.service;

import java.util.List;

import com.bagaswidodo.entity.MasterPriceEntity;

public interface IMasterPriceService {
	MasterPriceEntity save(MasterPriceEntity masterPriceEntity);
	MasterPriceEntity findById(Integer id);
	List<MasterPriceEntity> findAll();
	
}
