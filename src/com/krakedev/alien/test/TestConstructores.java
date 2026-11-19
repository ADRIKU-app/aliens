package com.krakedev.alien.test;

import com.krakedev.alien.Alien;

public class TestConstructores {

	public static void main(String[] args) {
		
		Alien reptiliano = new Alien(3, "Verde");
		
		reptiliano.imprimir();
		
		
		Alien nordico = new Alien(25, "Blanco");
		
		nordico.imprimir();
		
		
		Alien gris = new Alien(35, "Gris");
		
		gris.imprimir();

	}

}
