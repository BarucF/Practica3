package clases.poo.ito;

import javax.swing.JOptionPane;

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
		float a=12.313F,b=124.125F;
		Ubicacion des=new Ubicacion();
		float Desplazamiento = 0F;
		des.setLongitud(a);
		des.setLatitud(b);
		i=Integer.parseInt(JOptionPane.showInputDialog("Cual es la Longitud No.2?"));
		j=Integer.parseInt(JOptionPane.showInputDialog("Cual es la Latitud 2?"));
		Desplazamiento=(float)(Math.sqrt((float)((Math.pow((i-des.getLongitud()), 2))+(Math.pow((j-des.getLatitud()), 2)))));
		if(Desplazamiento==0)
			JOptionPane.showMessageDialog(null,"No hay desplazamiento");
		else
			JOptionPane.showMessageDialog(null,"El desplazamiento es de:"+Desplazamiento);
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