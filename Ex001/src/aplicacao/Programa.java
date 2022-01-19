package aplicacao;

import dominio.Pessoas;

public class Programa {

	public static void main(String[] args) {
		
		Pessoas pessoa1 = new Pessoas(1, "Rafaella Ribeiro Lima Britto", "rribeirolimabritto@gmail.com");
		Pessoas pessoa2 = new Pessoas(1, "Wallyson Richad Gomes da Silva", "wallyson@gmail.com");
		Pessoas pessoa3 = new Pessoas(1, "Flavio Lima Britto", "flavio@gmail.com");
		
		System.out.println(pessoa1);
		System.out.println(pessoa2);
		System.out.println(pessoa3);

	}

}
