package it.objectmethod.ccespringbootrest.dao;

import java.util.List;

import it.objectmethod.ccespringbootrest.model.Cliente;

public interface IClienteDao {

	public List<Cliente> getAllClienti();

	public Cliente getClienteById(int id);

	public boolean postCliente(Cliente cliente);

	public boolean putCliente(Cliente cliente);

	boolean deleteCliente(int id);
}
