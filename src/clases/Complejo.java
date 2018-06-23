package clases;

public class Complejo {
	private Long id;
	private String nombreComplejo;
	private String direccion;
	private String telefono;
	private String localidad;
	private String comoLlegar;
	private String cuit;
	private Usuario usuario;
	
	public String getNombreComplejo() {
		return nombreComplejo;
	}
	public void setNombreComplejo(String nombreComplejo) {
		this.nombreComplejo = nombreComplejo;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public String getComoLlegar() {
		return comoLlegar;
	}
	public void setComoLlegar(String comoLlegar) {
		this.comoLlegar = comoLlegar;
	}
	public String getCuit() {
		return cuit;
	}
	public void setCuit(String cuit) {
		this.cuit = cuit;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
}
