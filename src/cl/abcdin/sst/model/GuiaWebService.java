package cl.abcdin.sst.model;

public class GuiaWebService {
	
	
	private String valorLibre6;
	private String valorLibre8;
	private String valorLibre7;
	private String rutEmisor;
	private String rznSoc;
	private int activeEcon;	
	private String sucursal;
	private String dirOrigen;
	private String cmnaOrigen;
	private String ciudadOrigen;
	private String rutRecep;
	private String rznSocRecep;
	private String giroRecep;
	private String dirRecep;
	private String cmnaRecep;
	private String ciudadRecep;
	private String dirDest;
	private String cmnaDest;
	private String ciudadDest;
	private String rutTrans;
	private String vlrCodigo;
	private Long inumero;
	private String rutRecepSTA;
	private String rznSocSTA;
	private String giroRecepSTA;
	private String rutRecepCliente;
	private String rznSocRecepCliente;
	private String giroRecepCliente;
	private String nmbItem;
	private String folioRef;
	private String dirRecepCliente;
	private String comunaRecep;
	private String giroEmisor;
	
	public String getGiroEmisor()
	{
		return giroEmisor;
	}
	
	public String getValorLibre8()
	{
		return valorLibre8;
	}
	
	public void setValorLibre8(String valorLibre8)
	{
		this.valorLibre8=valorLibre8;
	}
	public String getRutRecepSTA() {
		return rutRecepSTA;
	}

	public void setRutRecepSTA(String rutRecepSTA) {
		this.rutRecepSTA = rutRecepSTA;
	}

	public String getRznSocSTA() {
		return rznSocSTA;
	}

	public void setRznSocSTA(String rznSocSTA) {
		this.rznSocSTA = rznSocSTA;
	}

	public String getGiroRecepSTA() {
		return giroRecepSTA;
	}

	public void setGiroRecepSTA(String giroRecepSTA) {
		this.giroRecepSTA = giroRecepSTA;
	}

	public String getRutRecepCliente() {
		return rutRecepCliente;
	}

	public void setRutRecepCliente(String rutRecepCliente) {
		this.rutRecepCliente = rutRecepCliente;
	}

	public String getRznSocRecepCliente() {
		return rznSocRecepCliente;
	}

	public void setRznSocRecepCliente(String rznSocRecepCliente) {
		this.rznSocRecepCliente = rznSocRecepCliente;
	}

	public String getGiroRecepCliente() {
		return giroRecepCliente;
	}

	public void setGiroRecepCliente(String giroRecepCliente) {
		this.giroRecepCliente = giroRecepCliente;
	}
	
	
	
	//Constructor sin parï¿½metros en caso de ser necesario
	public GuiaWebService() {}
	
	//Constructor con parï¿½metros
	public GuiaWebService(String valorLibre6, String valorLibre7, String rutEmisor, String rznSoc, int activeEcon,
			String sucursal, String dirOrigen, String cmnaOrigen, String ciudadOrigen, String rutRecep,
			String rznSocRecep, String giroRecep, String dirRecep, String cmnaRecep, String ciudadRecep, String dirDest,
			String cmnaDest, String ciudadDest, String rutTrans, String vlrCodigo, Long inumero, String rutRecepSTA,
			String rznSocSTA, String giroRecepSTA, String rutRecepCliente, String rznSocRecepCliente,
			String giroRecepCliente, String nmbItem, String folioRef, String dirRecepCliente, String valorLibre8, String giroEmisor) {
		super();
		this.valorLibre6 = valorLibre6;
		this.valorLibre7 = valorLibre7;
		this.rutEmisor = rutEmisor;
		this.rznSoc = rznSoc;
		this.activeEcon = activeEcon;
		this.sucursal = sucursal;
		this.dirOrigen = dirOrigen;
		this.cmnaOrigen = cmnaOrigen;
		this.ciudadOrigen = ciudadOrigen;
		this.rutRecep = rutRecep;
		this.rznSocRecep = rznSocRecep;
		this.giroRecep = giroRecep;
		this.dirRecep = dirRecep;
		this.cmnaRecep = cmnaRecep;
		this.ciudadRecep = ciudadRecep;
		this.dirDest = dirDest;
		this.cmnaDest = cmnaDest;
		this.ciudadDest = ciudadDest;
		this.rutTrans = rutTrans;
		this.vlrCodigo = vlrCodigo;
		this.inumero = inumero;
		this.rutRecepSTA = rutRecepSTA;
		this.rznSocSTA = rznSocSTA;
		this.giroRecepSTA = giroRecepSTA;
		this.rutRecepCliente = rutRecepCliente;
		this.rznSocRecepCliente = rznSocRecepCliente;
		this.giroRecepCliente = giroRecepCliente;
		this.nmbItem = nmbItem;
		this.folioRef = folioRef;
		this.dirRecepCliente = dirRecepCliente;
		this.valorLibre8=valorLibre8;
		this.giroEmisor=giroEmisor;
	}

	//Accesadores y mutadores
	
	public Long getInumero()
	{
		return inumero;
	}
	
	
	public void setGiroEmisor(String giroEmisor) {
		this.giroEmisor=giroEmisor;
	}

	public void setInumero(Long inumero) {
		this.inumero=inumero;
	}
	
	public String getValorLibre6() {
		return valorLibre6;
	}
	public void setValorLibre6(String valorLibre6) {
		this.valorLibre6 = valorLibre6;
	}
	public String getValorLibre7() {
		return valorLibre7;
	}
	public void setValorLibre7(String valorLibre7) {
		this.valorLibre7 = valorLibre7;
	}
	public String getRutEmisor() {
		return rutEmisor;
	}
	public void setRutEmisor(String rutEmisor) {
		this.rutEmisor = rutEmisor;
	}
	public String getRznSoc() {
		return rznSoc;
	}
	public void setRznSoc(String rznSoc) {
		this.rznSoc = rznSoc;
	}
	public int getActiveEcon() {
		return activeEcon;
	}
	public void setActiveEcon(int activeEcon) {
		this.activeEcon = activeEcon;
	}
	public String getSucursal() {
		return sucursal;
	}
	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}
	public String getDirOrigen() {
		return dirOrigen;
	}
	public void setDirOrigen(String dirOrigen) {
		this.dirOrigen = dirOrigen;
	}
	public String getCmnaOrigen() {
		return cmnaOrigen;
	}
	public void setCmnaOrigen(String cmnaOrigen) {
		this.cmnaOrigen = cmnaOrigen;
	}
	public String getCiudadOrigen() {
		return ciudadOrigen;
	}
	public void setCiudadOrigen(String ciudadOrigen) {
		this.ciudadOrigen = ciudadOrigen;
	}
	public String getRutRecep() {
		return rutRecep;
	}
	public void setRutRecep(String rutRecep) {
		this.rutRecep = rutRecep;
	}
	public String getRznSocRecep() {
		return rznSocRecep;
	}
	public void setRznSocRecep(String rznSocRecep) {
		this.rznSocRecep = rznSocRecep;
	}
	public String getGiroRecep() {
		return giroRecep;
	}
	public void setGiroRecep(String giroRecep) {
		this.giroRecep = giroRecep;
	}
	public String getDirRecep() {
		return dirRecep;
	}
	public void setDirRecep(String dirRecep) {
		this.dirRecep = dirRecep;
	}
	public String getCmnaRecep() {
		return cmnaRecep;
	}
	public void setCmnaRecep(String cmnaRecep) {
		this.cmnaRecep = cmnaRecep;
	}
	public String getCiudadRecep() {
		return ciudadRecep;
	}
	public void setCiudadRecep(String ciudadRecep) {
		this.ciudadRecep = ciudadRecep;
	}
	public String getDirDest() {
		return dirDest;
	}
	public void setDirDest(String dirDest) {
		this.dirDest = dirDest;
	}
	public String getCmnaDest() {
		return cmnaDest;
	}
	public void setCmnaDest(String cmnaDest) {
		this.cmnaDest = cmnaDest;
	}
	public String getCiudadDest() {
		return ciudadDest;
	}
	public void setCiudadDest(String ciudadDest) {
		this.ciudadDest = ciudadDest;
	}
	public String getRutTrans() {
		return rutTrans;
	}
	public void setRutTrans(String rutTrans) {
		this.rutTrans = rutTrans;
	}
	public String getVlrCodigo() {
		return vlrCodigo;
	}
	public void setVlrCodigo(String vlrCodigo) {
		this.vlrCodigo = vlrCodigo;
	}

	public String getFolioRef() {
		return folioRef;
	}

	public void setFolioRef(String folioRef) {
		this.folioRef = folioRef;
	}

	public String getNmbItem() {
		return nmbItem;
	}

	public void setNmbItem(String nmbItem) {
		this.nmbItem = nmbItem;
	}

	public String getDirRecepCliente() {
		return dirRecepCliente;
	}

	public void setDirRecepCliente(String dirRecepCliente) {
		this.dirRecepCliente = dirRecepCliente;
	}

	public String getComunaRecep() {
		return comunaRecep;
	}

	public void setComunaRecep(String comunaRecep) {
		this.comunaRecep = comunaRecep;
	}

	
	
}