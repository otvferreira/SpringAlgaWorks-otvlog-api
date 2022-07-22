package com.otvprojects.otvlog.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.otvprojects.otvlog.domain.model.Cliente;

@RestController
public class ClienteController {

	@GetMapping("/clientes")
	public List<Cliente> listar() {
		Cliente cliente1 = new Cliente();	
		cliente1.setId(1L);
		cliente1.setNome("Otávio");
		cliente1.setTelefone("34 1111-1111");
		cliente1.setEmail("email@email.com");
		
		Cliente cliente2 = new Cliente();	
		cliente2.setId(2L);
		cliente2.setNome("Otávio Augusto");
		cliente2.setTelefone("34 2222-2222");
		cliente2.setEmail("email2@email.com");		
		
		
		return Arrays.asList(cliente1, cliente2);
	}
}
