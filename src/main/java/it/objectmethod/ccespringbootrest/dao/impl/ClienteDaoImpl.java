package it.objectmethod.ccespringbootrest.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.stereotype.Service;

import it.objectmethod.ccespringbootrest.dao.IClienteDao;
import it.objectmethod.ccespringbootrest.mapper.ClienteMapper;
import it.objectmethod.ccespringbootrest.model.Cliente;

@Service
public class ClienteDaoImpl extends NamedParameterJdbcDaoSupport implements IClienteDao {

	@Autowired
	public ClienteDaoImpl(DataSource dataSource) {
		super();
		setDataSource(dataSource);
	}

	@Override
	public List<Cliente> getAllClienti() {
		String sql = "SELECT * FROM cliente";
		List<Cliente> clienti = getJdbcTemplate().query(sql, new ClienteMapper());
		return clienti;
	}

	@Override
	public void postCliente(Cliente cliente) {
		// TODO Auto-generated method stub

	}

	@Override
	public void putCliente(Cliente cliente) {
		// TODO Auto-generated method stub

	}
}
