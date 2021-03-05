package MiApp.poo.ito;
import clases.poo.ito.CuerpoCeleste;
import clases.poo.ito.Ubicacion;

public class MyApp {
	public static void run() {
		System.out.println(new CuerpoCeleste("B-639",new Ubicacion (12.313F,124.125F,"Marzo-Junio",1200000F),"agua"));
	}

	public static void main(String[] args) {
		
		run();
		
	}

}
