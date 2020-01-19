package com.ecodeup.ws;

public class CalculadoraConsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculadoraImplService calculadoraImplService = new CalculadoraImplService();
		Calculadora calculadora = calculadoraImplService.getCalculadoraImplPort();
		System.out.println("Suma");
		System.out.println(calculadora.operacion(1, 6, 4));
		System.out.println("Resta");
		System.out.println(calculadora.operacion(2, 2, 2));
		System.out.println("Multiplicacion");
		System.out.println(calculadora.operacion(3, 2, 2));
		System.out.println("Division");
		System.out.println(calculadora.operacion(4, 10, 4));
	}

}
