package ar.edu.ort.taller.Ejercicio6;

public class Rubro {
	
	private final int TOTAL_MESES = MES.values().length;
	private String nombre;
	private double[] gastosPorMes;
	
	public Rubro(String nombre) {
		this.nombre = nombre;
		inicializarGastos();
	}
	
	private void inicializarGastos(){ this.gastosPorMes = new double[TOTAL_MESES]; }
	
	/**
	 * Acumula los gastos que corresponden al mes indicado
	 * @param mes
	 * @param gastos
	 */
	public void agregarGastos(MES mes, double gastos){
		this.gastosPorMes[mes.ordinal()] += gastos;
	}
	
	public String getNombre(){ return this.nombre; }
	
	
	public double getTotalGastos(MES mes){ return this.gastosPorMes[mes.ordinal()];}

}
