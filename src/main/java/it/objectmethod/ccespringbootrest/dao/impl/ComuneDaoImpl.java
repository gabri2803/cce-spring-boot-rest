package it.objectmethod.ccespringbootrest.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.stereotype.Service;

import it.objectmethod.ccespringbootrest.dao.IComuneDao;
import it.objectmethod.ccespringbootrest.mapper.ComuneMapper;
import it.objectmethod.ccespringbootrest.model.Comune;

@Service
public class ComuneDaoImpl extends NamedParameterJdbcDaoSupport implements IComuneDao {

	@Autowired
	public ComuneDaoImpl(DataSource dataSource) {
		super();
		setDataSource(dataSource);
	}

	@Override
	public List<String> getAllRegioni() {
		String sql = "SELECT DISTINCT regione FROM comune";
		List<String> regioni = getJdbcTemplate().queryForList(sql, String.class);
		return regioni;
	}

	@Override
	public List<String> getAllProvince(String nomeRegione) {
		String sql = "SELECT DISTINCT provincia FROM comune WHERE regione=?";
		List<String> province = getJdbcTemplate().queryForList(sql, new Object[] { nomeRegione }, String.class);
		return province;
	}

	@Override
	public List<Comune> getAllComuni(String nomeProvincia) {
		String sql = "SELECT * FROM comune WHERE provincia=?";
		List<Comune> comuni = getJdbcTemplate().query(sql, new Object[] { nomeProvincia }, new ComuneMapper());
		return comuni;
	}
}
