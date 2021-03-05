package clases.poo.ito;

import clases.poo.ito.Ubicacion;

public class CuerpoCeleste {
	
	

	private String Nombre = "";
	
	private Ubicacion Localizaciones = null;
	
	private String Composicion = "";
	
	public CuerpoCeleste() {
		
		super();
		
	}
	public CuerpoCeleste(String nombre, Ubicacion localizaciones, String composicion) {
		super();
		Nombre = nombre;
		Localizaciones = localizaciones;
		Composicion = composicion;
	}
	
	public float Desplazamiento(int i, int j) {
		
		float Desplazamiento = 0F;
		return Desplazamiento;
		
	}
	
	public String getNombre() {
		return this.Nombre;
	}
	
	public void setNombre(String newNombre) {
		this.Nombre = newNombre;
	}
	
	public Ubicacion getLocalizaciones() {
		return this.Localizaciones;
	}
	
	public void setLocalizaciones(Ubicacion newLocalizaciones) {
		this.Localizaciones = newLocalizaciones;
	}
	
	public String getComposicion() {
		return this.Composicion;
	}
	
	public void setComposicion(String newComposicion) {
		this.Composicion = newComposicion;
	}
	@Override
	public String toString() {
		return "CuerpoCeleste [Nombre=" + Nombre + ", Localizaciones=" + Localizaciones + ", Composicion=" + Composicion
				+ "]";
	}

}
