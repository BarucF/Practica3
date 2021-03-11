package myApp.poo.ito;
import java.time.LocalDate;

import clases.ito.poo.CuentaBancaria;


public class MyApp {
	public static void run() {
		CuentaBancaria c=new CuentaBancaria(18738924L,"Gustavo Pedraza",50000F,LocalDate.of(2021,2,18));
		System.out.println(c);
		System.out.println(c.Retiro(25000F, LocalDate.of(2021, 3, 10)));
		System.out.println(c);
		System.out.println(c.Deposito(45000F, LocalDate.of(2021, 3, 11)));
		System.out.println(c);
	}

	public static void main(String[] args) {

		run();
		
	}

}
