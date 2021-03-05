/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package Calzado.ito.poo;

import java.util.HashSet;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of ClaseCalzado.
 * 
 * @author hp
 */
public class ClaseCalzado {
	public ClaseCalzado(int clave, String material, String troquel, int cantProdxDia, HashSet<String> colores) {
		super();
		this.clave = clave;
		this.material = material;
		this.troquel = troquel;
		this.cantProdxDia = cantProdxDia;
		this.colores = colores;
	}

	/**
	 * Description of the property clave.
	 */
	public int clave = 0;

	/**
	 * Description of the property material.
	 */
	public String material = "";

	/**
	 * Description of the property troquel.
	 */
	public String troquel = "";

	/**
	 * Description of the property cantProdxDia.
	 */
	public int cantProdxDia = 0;

	/**
	 * Description of the property colores.
	 */
	public HashSet<String> colores = new HashSet<String>();

	// Start of user code (user defined attributes for ClaseCalzado)

	// End of user code

	/**
	 * The constructor.
	 */
	public ClaseCalzado() {
		// Start of user code constructor for ClaseCalzado)
		super();
		// End of user code
	}

	/**
	 * Description of the method costoxLote.
	 * @param  
	 * @return 
	 */
	public float costoxLote(float costoxUnidad) {
		// Start of user code for method costoxLote
		float costoxLote = 0F;
		return costoxLote;
		// End of user code
	}

	// Start of user code (user defined methods for ClaseCalzado)

	// End of user code
	/**
	 * Returns clave.
	 * @return clave 
	 */
	public int getClave() {
		return this.clave;
	}

	/**
	 * Sets a value to attribute clave. 
	 * @param newClave 
	 */
	public void setClave(int newClave) {
		this.clave = newClave;
	}

	/**
	 * Returns material.
	 * @return material 
	 */
	public String getMaterial() {
		return this.material;
	}

	/**
	 * Sets a value to attribute material. 
	 * @param newMaterial 
	 */
	public void setMaterial(String newMaterial) {
		this.material = newMaterial;
	}

	/**
	 * Returns troquel.
	 * @return troquel 
	 */
	public String getTroquel() {
		return this.troquel;
	}

	/**
	 * Sets a value to attribute troquel. 
	 * @param newTroquel 
	 */
	public void setTroquel(String newTroquel) {
		this.troquel = newTroquel;
	}

	/**
	 * Returns cantProdxDia.
	 * @return cantProdxDia 
	 */
	public int getCantProdxDia() {
		return this.cantProdxDia;
	}

	/**
	 * Sets a value to attribute cantProdxDia. 
	 * @param newCantProdxDia 
	 */
	public void setCantProdxDia(int newCantProdxDia) {
		this.cantProdxDia = newCantProdxDia;
	}

	/**
	 * Returns colores.
	 * @return colores 
	 */
	public HashSet<String> getColores() {
		return this.colores;
	}

	@Override
	public String toString() {
		return "ClaseCalzado [clave=" + clave + ", material=" + material + ", troquel=" + troquel + ", cantProdxDia="
				+ cantProdxDia + ", colores=" + colores + "]";
	}

}
