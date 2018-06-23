package clases;

import java.sql.Time;
import java.util.Date;

public class Partido {
	private Long id;
	private Date fecha;
	private Time hora;
	private String dni;
	private Integer resultadoEquipoA;
	private Integer resultadoEquipoB;
	private Integer tarjetasRojasEquipoA;
	private Integer tarjetasRojasEquipoB;
	private Integer tarjetasAmarillasEquipoA;
	private Integer tarjetasAmarillasEquipoB;
	private Boolean estadoPagoEquipoA;
	private Boolean estadoPagoEquipoB;
	private Complejo complejo;
	private Equipo equipo1;
	private Equipo equipo2;
	
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Time getHora() {
		return hora;
	}
	public void setHora(Time hora) {
		this.hora = hora;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public Integer getResultadoEquipoA() {
		return resultadoEquipoA;
	}
	public void setResultadoEquipoA(Integer resultadoEquipoA) {
		this.resultadoEquipoA = resultadoEquipoA;
	}
	public Integer getResultadoEquipoB() {
		return resultadoEquipoB;
	}
	public void setResultadoEquipoB(Integer resultadoEquipoB) {
		this.resultadoEquipoB = resultadoEquipoB;
	}
	public Integer getTarjetasRojasEquipoA() {
		return tarjetasRojasEquipoA;
	}
	public void setTarjetasRojasEquipoA(Integer tarjetasRojasEquipoA) {
		this.tarjetasRojasEquipoA = tarjetasRojasEquipoA;
	}
	public Integer getTarjetasRojasEquipoB() {
		return tarjetasRojasEquipoB;
	}
	public void setTarjetasRojasEquipoB(Integer tarjetasRojasEquipoB) {
		this.tarjetasRojasEquipoB = tarjetasRojasEquipoB;
	}
	public Integer getTarjetasAmarillasEquipoA() {
		return tarjetasAmarillasEquipoA;
	}
	public void setTarjetasAmarillasEquipoA(Integer tarjetasAmarillasEquipoA) {
		this.tarjetasAmarillasEquipoA = tarjetasAmarillasEquipoA;
	}
	public Integer getTarjetasAmarillasEquipoB() {
		return tarjetasAmarillasEquipoB;
	}
	public void setTarjetasAmarillasEquipoB(Integer tarjetasAmarillasEquipoB) {
		this.tarjetasAmarillasEquipoB = tarjetasAmarillasEquipoB;
	}
	public Boolean getEstadoPagoEquipoA() {
		return estadoPagoEquipoA;
	}
	public void setEstadoPagoEquipoA(Boolean estadoPagoEquipoA) {
		this.estadoPagoEquipoA = estadoPagoEquipoA;
	}
	public Boolean getEstadoPagoEquipoB() {
		return estadoPagoEquipoB;
	}
	public void setEstadoPagoEquipoB(Boolean estadoPagoEquipoB) {
		this.estadoPagoEquipoB = estadoPagoEquipoB;
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
	public Equipo getEquipo1() {
		return equipo1;
	}
	public void setEquipo1(Equipo equipo1) {
		this.equipo1 = equipo1;
	}
	public Equipo getEquipo2() {
		return equipo2;
	}
	public void setEquipo2(Equipo equipo2) {
		this.equipo2 = equipo2;
	}
	
}
