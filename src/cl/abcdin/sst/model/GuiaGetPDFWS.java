package cl.abcdin.sst.model;

import java.util.Date;

public class GuiaGetPDFWS {
	private String rutEmisor;
	private Long folioDoc;
	private Date fechaEmision;
	private String rutReceptor;
	private Long idGuia;
	public String getRutEmisor() {
		return rutEmisor;
	}
	public void setRutEmisor(String rutEmisor) {
		this.rutEmisor = rutEmisor;
	}
	public Long getFolioDoc() {
		return folioDoc;
	}
	public void setFolioDoc(Long folioDoc) {
		this.folioDoc = folioDoc;
	}
	public Date getFechaEmision() {
		return fechaEmision;
	}
	public void setFechaEmision(Date fechaEmision) {
		this.fechaEmision = fechaEmision;
	}
	public String getRutReceptor() {
		return rutReceptor;
	}
	public void setRutReceptor(String rutReceptor) {
		this.rutReceptor = rutReceptor;
	}
	public Long getIdGuia() {
		return idGuia;
	}
	public void setIdGuia(Long idGuia) {
		this.idGuia = idGuia;
	}
	
	
	
	
}
