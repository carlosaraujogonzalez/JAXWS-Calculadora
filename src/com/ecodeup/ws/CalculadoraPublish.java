package com.ecodeup.ws;

import javax.xml.ws.Endpoint;

public class CalculadoraPublish {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Endpoint.publish("http://localhost:1515/WS/Calculadora", new CalculadoraImpl());
	}

}
