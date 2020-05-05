package it.objectmethod.ccespringbootrest.model;

public class Cliente {

	private int id;
	private String ragioneSociale;
	private String codiceFiscale;
	private String telefono;
	private String partitaIva;
	private String bancaAppoggio;
	private String abi;
	private String cab;
	private String codiceZona;
	private String codiceCliente;
	private String stato;
	private String cellulare;
	private String cognome;
	private String comuneNascita;
	private String nome;
	private String provinciaNascita;
	private String sesso;
	private String statoNascita;
	private String tipo;
	private String dataNascita;
	private String condizioniPagamento;
	private String note;
	private String email;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRagioneSociale() {
		return ragioneSociale;
	}

	public void setRagioneSociale(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getPartitaIva() {
		return partitaIva;
	}

	public void setPartitaIva(String partitaIva) {
		this.partitaIva = partitaIva;
	}

	public String getBancaAppoggio() {
		return bancaAppoggio;
	}

	public void setBancaAppoggio(String bancaAppoggio) {
		this.bancaAppoggio = bancaAppoggio;
	}

	public String getAbi() {
		return abi;
	}

	public void setAbi(String abi) {
		this.abi = abi;
	}

	public String getCab() {
		return cab;
	}

	public void setCab(String cab) {
		this.cab = cab;
	}

	public String getCodiceZona() {
		return codiceZona;
	}

	public void setCodiceZona(String codiceZona) {
		this.codiceZona = codiceZona;
	}

	public String getCodiceCliente() {
		return codiceCliente;
	}

	public void setCodiceCliente(String codiceCliente) {
		this.codiceCliente = codiceCliente;
	}

	public String getStato() {
		return stato;
	}

	public void setStato(String stato) {
		this.stato = stato;
	}

	public String getCellulare() {
		return cellulare;
	}

	public void setCellulare(String cellulare) {
		this.cellulare = cellulare;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getComuneNascita() {
		return comuneNascita;
	}

	public void setComuneNascita(String comuneNascita) {
		this.comuneNascita = comuneNascita;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getProvinciaNascita() {
		return provinciaNascita;
	}

	public void setProvinciaNascita(String provinciaNascita) {
		this.provinciaNascita = provinciaNascita;
	}

	public String getSesso() {
		return sesso;
	}

	public void setSesso(String sesso) {
		this.sesso = sesso;
	}

	public String getStatoNascita() {
		return statoNascita;
	}

	public void setStatoNascita(String statoNascita) {
		this.statoNascita = statoNascita;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(String dataNascita) {
		this.dataNascita = dataNascita;
	}

	public String getCondizioniPagamento() {
		return condizioniPagamento;
	}

	public void setCondizioniPagamento(String condizioniPagamento) {
		this.condizioniPagamento = condizioniPagamento;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", ragioneSociale=" + ragioneSociale + ", codiceFiscale=" + codiceFiscale
				+ ", telefono=" + telefono + ", partitaIva=" + partitaIva + ", bancaAppoggio=" + bancaAppoggio
				+ ", abi=" + abi + ", cab=" + cab + ", codiceZona=" + codiceZona + ", codiceCliente=" + codiceCliente
				+ ", stato=" + stato + ", cellulare=" + cellulare + ", cognome=" + cognome + ", comuneNascita="
				+ comuneNascita + ", nome=" + nome + ", provinciaNascita=" + provinciaNascita + ", sesso=" + sesso
				+ ", statoNascita=" + statoNascita + ", tipo=" + tipo + ", dataNascita=" + dataNascita
				+ ", condizioniPagamento=" + condizioniPagamento + ", note=" + note + ", email=" + email + "]";
	}
}
