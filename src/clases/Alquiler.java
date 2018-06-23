package clases;

import java.sql.Time;
import java.util.Date;


public class Alquiler {
	private Long id;
	private Date fecha;
	private Time hora;
	private Long precio;
	private Long pagoRealizado;
	private Boolean estado;
	private Boolean estadoPago;
	private Cancha cancha;
	private Recibo recibo;
	
	public void cambiarEstadoPago(){
		
	}
	
	public void calcularResto(){
		
	}
	
	public void cambiarEstado(){
		
	}
	
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
	public Long getPrecio() {
		return precio;
	}
	public void setPrecio(Long precio) {
		this.precio = precio;
	}
	public Long getPagoRealizado() {
		return pagoRealizado;
	}
	public void setPagoRealizado(Long pagoRealizado) {
		this.pagoRealizado = pagoRealizado;
	}
	public Boolean getEstado() {
		return estado;
	}
	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
	public Boolean getEstadoPago() {
		return estadoPago;
	}
	public void setEstadoPago(Boolean estadoPago) {
		this.estadoPago = estadoPago;
	}
	public Cancha getCancha() {
		return cancha;
	}
	public void setCancha(Cancha cancha) {
		this.cancha = cancha;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Recibo getRecibo() {
		return recibo;
	}

	public void setRecibo(Recibo recibo) {
		this.recibo = recibo;
	}
	
}
