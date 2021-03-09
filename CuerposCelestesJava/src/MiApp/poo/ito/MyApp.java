package MiApp.poo.ito;
import clases.poo.ito.CuerpoCeleste;
import javax.swing.JOptionPane;
import clases.poo.ito.Ubicacion;

public class MyApp {
	public static void run() {
		CuerpoCeleste d= new CuerpoCeleste();
		JOptionPane.showMessageDialog(null,"Los datos registrados del cuerpo celeste son los siguientes:");
		JOptionPane.showMessageDialog(null,new CuerpoCeleste("B-639",new Ubicacion (12.313F,124.125F,"Marzo-Junio",1200000F),"agua"));
		d.Desplazamiento(0, 0);
	}

	public static void main(String[] args) {
		
		run();
		
		
	}

}
