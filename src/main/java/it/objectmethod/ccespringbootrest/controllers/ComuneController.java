package it.objectmethod.ccespringbootrest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import it.objectmethod.ccespringbootrest.dao.IComuneDao;
import it.objectmethod.ccespringbootrest.model.Comune;

@RestController
public class ComuneController {

	@Autowired
	private IComuneDao comuneDao;

	@GetMapping("/lista-comuni/{nomeProv}/comuni")
	public List<Comune> getComuniByProvincia(@PathVariable("nomeProv") String nomProv) {
		List<Comune> com = null;
		com = comuneDao.getAllComuni(nomProv);
		return com;
	}

	@GetMapping("/lista-province/{nomeReg}/province")
	public List<String> getProvinceByRegione(@PathVariable("nomeReg") String regione) {
		List<String> province = null;
		province = comuneDao.getAllProvince(regione);
		return province;
	}

	@GetMapping("/lista-regioni")
	public List<String> getAllRegioni() {
		List<String> regioni = null;
		regioni = comuneDao.getAllRegioni();
		return regioni;
	}
}
