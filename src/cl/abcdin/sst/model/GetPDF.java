package cl.abcdin.sst.model;

public class GetPDF {
	String rutt;
	String folio;
	//tipo de documento, fijo 52 para GD
	String doc;
	String monto;
	String fecha;
	//Opcional, rut del receptor
	String ruttt;
	//Tipo de copia, normal=0, cedible=1
	String Merito;
	
	public String getRutt() {
		return rutt;
	}
	public void setRutt(String rutt) {
		this.rutt = rutt;
	}
	public String getFolio() {
		return folio;
	}
	public void setFolio(String folio) {
		this.folio = folio;
	}
	public String getDoc() {
		return doc;
	}
	public void setDoc(String doc) {
		this.doc = doc;
	}
	public String getMonto() {
		return monto;
	}
	public void setMonto(String monto) {
		this.monto = monto;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getRuttt() {
		return ruttt;
	}
	public void setRuttt(String ruttt) {
		this.ruttt = ruttt;
	}
	public String getMerito() {
		return Merito;
	}
	public void setMerito(String merito) {
		Merito = merito;
	}
	public GetPDF(String rutt, String folio, String doc, String monto, String fecha, String ruttt, String merito) {
		super();
		this.rutt = rutt;
		this.folio = folio;
		this.doc = doc;
		this.monto = monto;
		this.fecha = fecha;
		this.ruttt = ruttt;
		Merito = merito;
	}
}
