package clases;

import java.util.List;

public class Equipo {
	private Long id;
	private String nombreEquipo;
	private String mail;
	private String telefono;
	private String dni;
	private Integer cantidadMaximaJugadores;
	private Integer cantidadMinimaJugadores;
	private String nombreDt;
	private String nombreCapitan;
	private List<Jugador> jugadores;
	
	public String getNombreEquipo() {
		return nombreEquipo;
	}
	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public Integer getCantidadMaximaJugadores() {
		return cantidadMaximaJugadores;
	}
	public void setCantidadMaximaJugadores(Integer cantidadMaximaJugadores) {
		this.cantidadMaximaJugadores = cantidadMaximaJugadores;
	}
	public Integer getCantidadMinimaJugadores() {
		return cantidadMinimaJugadores;
	}
	public void setCantidadMinimaJugadores(Integer cantidadMinimaJugadores) {
		this.cantidadMinimaJugadores = cantidadMinimaJugadores;
	}
	public String getNombreDt() {
		return nombreDt;
	}
	public void setNombreDt(String nombreDt) {
		this.nombreDt = nombreDt;
	}
	public String getNombreCapitan() {
		return nombreCapitan;
	}
	public void setNombreCapitan(String nombreCapitan) {
		this.nombreCapitan = nombreCapitan;
	}
	public List<Jugador> getJugadores() {
		return jugadores;
	}
	public void setJugadores(List<Jugador> jugadores) {
		this.jugadores = jugadores;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
}
