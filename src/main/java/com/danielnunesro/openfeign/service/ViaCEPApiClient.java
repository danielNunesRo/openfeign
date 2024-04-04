package com.danielnunesro.openfeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.danielnunesro.openfeign.dto.ResponseDTO;

@FeignClient(name = "viacep-api", url = "https://viacep.com.br/ws")
public interface ViaCEPApiClient {
	
	@GetMapping("/{cep}/json/")
    ResponseDTO fetchDataFromExternalAPI(@PathVariable("cep") String cep);
	
}
