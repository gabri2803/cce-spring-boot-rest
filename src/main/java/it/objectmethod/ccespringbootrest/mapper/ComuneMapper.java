package it.objectmethod.ccespringbootrest.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import it.objectmethod.ccespringbootrest.model.Comune;

public class ComuneMapper implements RowMapper<Comune> {

	@Override
	public Comune mapRow(ResultSet rs, int rowNum) throws SQLException {
		Comune com = new Comune();
		com.setIstat(rs.getInt("istat"));
		com.setNome(rs.getString("nome"));
		com.setProvincia(rs.getString("provincia"));
		com.setRegione(rs.getString("regione"));
		com.setPrefisso(rs.getInt("prefisso"));
		com.setCap(rs.getString("cap"));
		com.setCodFisco(rs.getString("cod_fisco"));
		com.setAbitanti(rs.getInt("abitanti"));
		com.setLink(rs.getString("link"));
		return com;
	}
}
