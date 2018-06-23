package clases;

import java.util.Date;

public class Cancha {
	private Long id;
	private String tipoCancha;
	private Date horarioDesde;
	private Date horariaHasta;
	private Long precioDia;
	private Long precioNoche;
	private Complejo complejo;
	
	public String getTipoCancha() {
		return tipoCancha;
	}
	public void setTipoCancha(String tipoCancha) {
		this.tipoCancha = tipoCancha;
	}
	public Date getHorarioDesde() {
		return horarioDesde;
	}
	public void setHorarioDesde(Date horarioDesde) {
		this.horarioDesde = horarioDesde;
	}
	public Date getHorariaHasta() {
		return horariaHasta;
	}
	public void setHorariaHasta(Date horariaHasta) {
		this.horariaHasta = horariaHasta;
	}
	public Long getPrecioDia() {
		return precioDia;
	}
	public void setPrecioDia(Long precioDia) {
		this.precioDia = precioDia;
	}
	public Long getPrecioNoche() {
		return precioNoche;
	}
	public void setPrecioNoche(Long precioNoche) {
		this.precioNoche = precioNoche;
	}
	public Complejo getComplejo() {
		return complejo;
	}
	public void setComplejo(Complejo complejo) {
		this.complejo = complejo;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
}
