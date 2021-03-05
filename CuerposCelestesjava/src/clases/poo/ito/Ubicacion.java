/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package clases.poo.ito;

public class Ubicacion {
	
	

	private float Longitud = 0F;
	
	private float Latitud = 0F;
	
	private String Periodo = "";
	
	private float Distancia = 0F;
	
	public Ubicacion() {
		
		super();
		
	}
	public Ubicacion(float longitud, float latitud, String periodo, float distancia) {
		super();
		Longitud = longitud;
		Latitud = latitud;
		Periodo = periodo;
		Distancia = distancia;
	}

	// Start of user code (user defined methods for Ubicacion)

	// End of user code
	/**
	 * Returns Longitud.
	 * @return Longitud 
	 */
	public float getLongitud() {
		return this.Longitud;
	}

	/**
	 * Sets a value to attribute Longitud. 
	 * @param newLongitud 
	 */
	public void setLongitud(float newLongitud) {
		this.Longitud = newLongitud;
	}

	/**
	 * Returns Latitud.
	 * @return Latitud 
	 */
	public float getLatitud() {
		return this.Latitud;
	}

	/**
	 * Sets a value to attribute Latitud. 
	 * @param newLatitud 
	 */
	public void setLatitud(float newLatitud) {
		this.Latitud = newLatitud;
	}

	/**
	 * Returns Periodo.
	 * @return Periodo 
	 */
	public String getPeriodo() {
		return this.Periodo;
	}

	/**
	 * Sets a value to attribute Periodo. 
	 * @param newPeriodo 
	 */
	public void setPeriodo(String newPeriodo) {
		this.Periodo = newPeriodo;
	}

	/**
	 * Returns Distancia.
	 * @return Distancia 
	 */
	public float getDistancia() {
		return this.Distancia;
	}

	/**
	 * Sets a value to attribute Distancia. 
	 * @param newDistancia 
	 */
	public void setDistancia(float newDistancia) {
		this.Distancia = newDistancia;
	}
	@Override
	public String toString() {
		return "Ubicacion [Longitud=" + Longitud + ", Latitud=" + Latitud + ", Periodo=" + Periodo + ", Distancia="
				+ Distancia + "]";
	}

}
