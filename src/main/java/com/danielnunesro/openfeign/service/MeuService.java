package com.danielnunesro.openfeign.service;

import org.springframework.stereotype.Service;

import com.danielnunesro.openfeign.dto.ResponseDTO;

@Service
public class MeuService {
	
	private final ViaCEPApiClient viacepApi;

	public MeuService(ViaCEPApiClient viacepApi) {
		this.viacepApi = viacepApi;
	}
	
	public ResponseDTO fetchDataFromViaCepAPI(String cpf) {
		return viacepApi.fetchDataFromExternalAPI(cpf);
	}
	
}
