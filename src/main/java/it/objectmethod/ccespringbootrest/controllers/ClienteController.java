package it.objectmethod.ccespringbootrest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	public List<Cliente> getAll() {
		List<Cliente> c = null;
		c = clienteDao.getAllClienti();
		return c;
	}

	@PostMapping("/new-cliente")
	public ResponseEntity<Cliente> postCliente(@RequestBody Cliente c) {
		clienteDao.postCliente(c);
		ResponseEntity<Cliente> resp = null;
		resp = new ResponseEntity<>(c, HttpStatus.OK);
		return resp;
	}

	@PostMapping("/update/{id}/cliente")
	public ResponseEntity<Cliente> putCliente(@PathVariable("id") int id, @RequestBody Cliente c) {
		ResponseEntity<Cliente> resp = null;
		if (id < 0) {
			resp = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		} else {
			c.setId(id);
			clienteDao.putCliente(c);
			resp = new ResponseEntity<>(c, HttpStatus.OK);
		}
		return resp;
	}
}
