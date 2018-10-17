package ar.edu.ort.taller1.tp3.Ejercicio4;

public class Direccion {
	private String calle;
	private String altura;
	private String piso;
	private String departamento;
	
	public Direccion(String calle, String altura, String piso, String departamento){
		this.calle = calle;
		this.altura = altura;
		this.piso = piso;
		this.departamento = departamento;
	}
	
	public String getDireccion(){
		return "Direccion: " + this.calle + " " + this.altura + " " + this.piso + "° " + this.departamento; 
	}

}
