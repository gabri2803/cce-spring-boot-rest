package it.objectmethod.ccespringbootrest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	public ResponseEntity<List<Comune>> getComuniByProvincia(@PathVariable("nomeProv") String nomProv) {
		List<Comune> com = null;
		ResponseEntity<List<Comune>> resp = null;
		try {
			com = comuneDao.getAllComuni(nomProv);
			resp = new ResponseEntity<>(com, HttpStatus.OK);
		} catch (Exception e) {
			resp = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		return resp;
	}

	@GetMapping("/lista-province/{nomeReg}/province")
	public ResponseEntity<List<String>> getProvinceByRegione(@PathVariable("nomeReg") String regione) {
		List<String> province = null;
		ResponseEntity<List<String>> resp = null;
		try {
			province = comuneDao.getAllProvince(regione);
			resp = new ResponseEntity<>(province, HttpStatus.OK);
		} catch (Exception e) {
			resp = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		return resp;
	}

	@GetMapping("/lista-regioni")
	public ResponseEntity<List<String>> getAllRegioni() {
		List<String> regioni = null;
		ResponseEntity<List<String>> resp = null;
		try {
			regioni = comuneDao.getAllRegioni();
			resp = new ResponseEntity<>(regioni, HttpStatus.OK);
		} catch (Exception e) {
			resp = new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return resp;
	}
}
