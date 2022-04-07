package com.bagaswidodo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bagaswidodo.entity.MasterPriceEntity;
import com.bagaswidodo.service.IMasterPriceService;

@RestController
public class MasterPriceController {

	@Autowired
	private IMasterPriceService masterPriceService;

	public MasterPriceController(IMasterPriceService masterPriceService) {
		this.masterPriceService= masterPriceService;
	}
	
	@GetMapping(value = "/")
	public  ResponseEntity<List<MasterPriceEntity>> findAllMasterPrice(){
		return new ResponseEntity<>(masterPriceService.findAll(), HttpStatus.OK);
	}
	
	@GetMapping(value = "/findbyId")
	public ResponseEntity<MasterPriceEntity> findById(@RequestParam Integer id){
		return new ResponseEntity<>(masterPriceService.findById(id),HttpStatus.OK);
	}
	
	@PostMapping(value = "/save")
	public ResponseEntity<MasterPriceEntity> save(@RequestBody MasterPriceEntity request){
		return new ResponseEntity<>(masterPriceService.save(request),HttpStatus.OK);
		
	}
	
}
