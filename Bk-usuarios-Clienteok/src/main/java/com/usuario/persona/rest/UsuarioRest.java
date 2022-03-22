package com.usuario.persona.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.usuario.persona.Cliente;
import com.usuario.persona.service.ClienteService;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/usuarios/")
public class UsuarioRest {
	
	@Autowired
	private ClienteService clienteService;
	
	@GetMapping
	private ResponseEntity<List<Cliente>> getAllClientes(){
		return ResponseEntity.ok(clienteService.findAll());
	}
	
	
	@PostMapping
	public ResponseEntity<Void> registrar(@RequestBody Cliente cliente){
	Cliente obj = clienteService.save(cliente);
	URI uri=ServletUriComponentsBuilder.fromCurrentRequest().path("id").buildAndExpand(obj.getId()).toUri();
	return ResponseEntity.created(uri).build();
	}
			
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> Eliminar(@PathVariable("id") Integer id) throws Exception{
	Cliente obj = clienteService.getById(id);
	if (obj==null) {
	throw new Exception("No se encontro ID");
	}
	clienteService.deleteById(id);
	return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
}
		
		
		
		
		
	
	
	
	

	
	
		
	
	
	


