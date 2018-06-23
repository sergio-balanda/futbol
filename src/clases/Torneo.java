package clases;

import java.util.Date;
import java.util.List;

public class Torneo {
	private Long id;
	private String nombreTorneo;
	private Long precio;
	private Date fechaDesde;
	private Date fechaHasta;
	private Date franjaHoraria;
	private String tipoCancha;
	private Long primerPremio;
	private Long segundoPremio;
	private Long tercerPremio;
	private Integer cantidadEquipos;
	private Boolean estado;
	private String requerimentos;
	private List<Partido> partidos;
	
	public String getNombreTorneo() {
		return nombreTorneo;
	}
	public void setNombreTorneo(String nombreTorneo) {
		this.nombreTorneo = nombreTorneo;
	}
	public Long getPrecio() {
		return precio;
	}
	public void setPrecio(Long precio) {
		this.precio = precio;
	}
	public Date getFechaDesde() {
		return fechaDesde;
	}
	public void setFechaDesde(Date fechaDesde) {
		this.fechaDesde = fechaDesde;
	}
	public Date getFechaHasta() {
		return fechaHasta;
	}
	public void setFechaHasta(Date fechaHasta) {
		this.fechaHasta = fechaHasta;
	}
	public Date getFranjaHoraria() {
		return franjaHoraria;
	}
	public void setFranjaHoraria(Date franjaHoraria) {
		this.franjaHoraria = franjaHoraria;
	}
	public String getTipoCancha() {
		return tipoCancha;
	}
	public void setTipoCancha(String tipoCancha) {
		this.tipoCancha = tipoCancha;
	}
	public Long getPrimerPremio() {
		return primerPremio;
	}
	public void setPrimerPremio(Long primerPremio) {
		this.primerPremio = primerPremio;
	}
	public Long getSegundoPremio() {
		return segundoPremio;
	}
	public void setSegundoPremio(Long segundoPremio) {
		this.segundoPremio = segundoPremio;
	}
	public Long getTercerPremio() {
		return tercerPremio;
	}
	public void setTercerPremio(Long tercerPremio) {
		this.tercerPremio = tercerPremio;
	}
	public Integer getCantidadEquipos() {
		return cantidadEquipos;
	}
	public void setCantidadEquipos(Integer cantidadEquipos) {
		this.cantidadEquipos = cantidadEquipos;
	}
	public Boolean getEstado() {
		return estado;
	}
	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
	public String getRequerimentos() {
		return requerimentos;
	}
	public void setRequerimentos(String requerimentos) {
		this.requerimentos = requerimentos;
	}
	public List<Partido> getPartidos() {
		return partidos;
	}
	public void setPartidos(List<Partido> partidos) {
		this.partidos = partidos;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
}
