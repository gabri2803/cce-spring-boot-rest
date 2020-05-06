package it.objectmethod.ccespringbootrest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import it.objectmethod.ccespringbootrest.dao.IClienteDao;
import it.objectmethod.ccespringbootrest.model.Cliente;

@RestController
public class ClienteController {

	@Autowired
	private IClienteDao clienteDao;

	@GetMapping("/all-clienti")
	public ResponseEntity<List<Cliente>> getAll() {
		List<Cliente> c = null;
		ResponseEntity<List<Cliente>> resp = null;
		try {
			c = clienteDao.getAllClienti();
			resp = new ResponseEntity<>(c, HttpStatus.OK);
		} catch (Exception e) {
			resp = new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return resp;
	}

	@GetMapping("/get-cliente-by-id/{id}")
	public ResponseEntity<Cliente> getClienteById(@PathVariable("id") int id) {
		Cliente cli = null;
		ResponseEntity<Cliente> resp = null;
		try {
			cli = clienteDao.getClienteById(id);
			resp = new ResponseEntity<>(cli, HttpStatus.OK);
		} catch (Exception e) {
			resp = new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return resp;
	}

	@PostMapping("/new-cliente")
	public ResponseEntity<Cliente> postCliente(@RequestBody Cliente c) {
		ResponseEntity<Cliente> resp = null;
		if (clienteDao.postCliente(c)) {
			resp = new ResponseEntity<>(c, HttpStatus.OK);
		} else {
			resp = new ResponseEntity<>(c, HttpStatus.BAD_REQUEST);
		}
		return resp;
	}

	@PostMapping("/update/{id}/cliente")
	public ResponseEntity<Cliente> putCliente(@PathVariable("id") int id, @RequestBody Cliente c) {
		ResponseEntity<Cliente> resp = null;
		c.setId(id);
		if (clienteDao.putCliente(c)) {
			resp = new ResponseEntity<>(c, HttpStatus.OK);
		} else {
			resp = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		return resp;
	}

	@DeleteMapping("/delete-cliente/{id}")
	public ResponseEntity<Cliente> deleteCliente(@PathVariable("id") int id) {
		ResponseEntity<Cliente> resp = null;
		if (clienteDao.deleteCliente(id)) {
			resp = new ResponseEntity<>(HttpStatus.OK);
		} else {
			resp = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		return resp;
	}
}
