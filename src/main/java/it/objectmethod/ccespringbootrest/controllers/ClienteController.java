package it.objectmethod.ccespringbootrest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import it.objectmethod.ccespringbootrest.dao.IClienteDao;
import it.objectmethod.ccespringbootrest.model.Cliente;

@RestController
public class ClienteController {

	@Autowired
	private IClienteDao clienteDao;

	@GetMapping("/all")
	public List<Cliente> getAll() {
		List<Cliente> c = null;
		c = clienteDao.getAllClienti();
		return c;

	}
}
