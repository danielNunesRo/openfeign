package com.danielnunesro.openfeign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.danielnunesro.openfeign.dto.ResponseDTO;
import com.danielnunesro.openfeign.service.MeuService;

@RestController
@RequestMapping("/teste")
public class MeuController {
	
	private MeuService service;

	@Autowired
	public MeuController(MeuService service) {
		this.service = service;
	}
	
	@GetMapping("/{cpf}")
	public ResponseEntity<ResponseDTO> dados(@PathVariable String cpf) {
		ResponseDTO response = service.fetchDataFromViaCepAPI(cpf);
		return ResponseEntity.ok().body(response);
		
	}
	
	
	
}
