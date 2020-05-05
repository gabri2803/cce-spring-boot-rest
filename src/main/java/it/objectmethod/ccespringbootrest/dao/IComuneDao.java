package it.objectmethod.ccespringbootrest.dao;

import java.util.List;

import it.objectmethod.ccespringbootrest.model.Comune;

public interface IComuneDao {

	public List<String> getAllRegioni();

	public List<String> getAllProvince(String nomeRegione);

	public List<Comune> getAllComuni(String nomeProvincia);
}
