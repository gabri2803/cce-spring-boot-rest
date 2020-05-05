package it.objectmethod.ccespringbootrest.dao;

import java.util.List;

import it.objectmethod.ccespringbootrest.model.Cliente;

public interface IClienteDao {

	public List<Cliente> getAllClienti();

	public void postCliente(Cliente cliente);

	public void putCliente(Cliente cliente);
}
