package com.devesuperior.desmeta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devesuperior.desmeta.entities.Sale;
import com.devesuperior.desmeta.repositories.SaleRepository;

@Service
public class SaleServices {

	@Autowired
	private SaleRepository repository;
	
	public List<Sale> findSales(){
		return repository.findAll();
		
	}
}
