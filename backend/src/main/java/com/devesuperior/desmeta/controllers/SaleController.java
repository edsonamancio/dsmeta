package com.devesuperior.desmeta.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devesuperior.desmeta.entities.Sale;
import com.devesuperior.desmeta.services.SaleServices;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {
	
	@Autowired
	private SaleServices service;
	
	@GetMapping
	public List<Sale> findSales(){ 
		return service.findSales();
	}

	
}
