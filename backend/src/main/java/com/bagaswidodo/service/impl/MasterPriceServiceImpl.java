package com.bagaswidodo.service.impl;

import java.util.List;

import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.bagaswidodo.entity.MasterPriceEntity;
import com.bagaswidodo.repository.MasterPriceRepository;
import com.bagaswidodo.service.IMasterPriceService;
import com.bagaswidodo.service.handler.PriceNotFoundException;


@Service
public class MasterPriceServiceImpl implements IMasterPriceService {
	
	private static final String REDIS_CACHE_VALUE= "PRICE";
	
	private MasterPriceRepository masterPriceRepository;
	
	public MasterPriceServiceImpl(MasterPriceRepository masterPriceRepository) {
		this.masterPriceRepository = masterPriceRepository;
	}

	@Override
	@CachePut(value = REDIS_CACHE_VALUE, key="#masterPriceEntity.id")
	public MasterPriceEntity save(MasterPriceEntity masterPriceEntity) {
		// TODO Auto-generated method stub
		return masterPriceRepository.save(masterPriceEntity);
	}

	@Override
	@Cacheable(value = REDIS_CACHE_VALUE, key = "#id")
	public MasterPriceEntity findById(Integer id) {
		// TODO Auto-generated method stub
		return masterPriceRepository.findById(id).orElseThrow(() -> new PriceNotFoundException("Price Data Not Found"));
	}

	@Override
	@Cacheable(value= REDIS_CACHE_VALUE)
	public List<MasterPriceEntity> findAll() {
		// TODO Auto-generated method stub
		return masterPriceRepository.findAll();
	}

}
