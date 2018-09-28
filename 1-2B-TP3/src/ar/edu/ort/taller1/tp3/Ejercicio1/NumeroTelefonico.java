package ar.edu.ort.taller1.tp3.Ejercicio1;

public class NumeroTelefonico {

	private int caracteristica;
	private int numeroAbonado;
	private int codigoDePais;
	private TipoDeLinea tipoDeLinea;
	
	public NumeroTelefonico(int codPais, int caracteristica, int numAbonado, TipoDeLinea tp) {
		this.codigoDePais = codPais;
		this.caracteristica = caracteristica;
		this.numeroAbonado = numAbonado;
		this.tipoDeLinea = tp;
	}
	
	public String getValor() {
		return "(+"+this.codigoDePais+") "+this.caracteristica+"-"+this.numeroAbonado;
	}
	
	public TipoDeLinea getTipo() {
		return this.tipoDeLinea;
	}
	
}
