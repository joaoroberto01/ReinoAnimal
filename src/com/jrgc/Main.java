package com.jrgc;

public class Main {

	public static void main(String[] args) {
		Mamifero cachorro = new Mamifero("Cachorro Caramelo");
		cachorro.locomover();
		cachorro.info();

		Mamifero boi = new Mamifero("Boi Bravo");
		boi.locomover();
		boi.info();

		Ave espacoNave = new Ave("Espaço Nave");
		espacoNave.locomover();
		espacoNave.info();

		Peixe peixeEspada = new Peixe("Peixe Espada");
		peixeEspada.locomover();
		peixeEspada.info();

		Anfibio sapin = new Anfibio("Sapin");
		sapin.locomover();
		sapin.info();

		Reptil tartaruga = new Reptil("Jacared");
		tartaruga.locomover();
		tartaruga.info();

		Aracnideo aranha = new Aracnideo("Aranha");
		aranha.locomover();
		aranha.info();

		Crustaceo camarao = new Crustaceo("Camarão");
		camarao.locomover();
		camarao.info();

		Inseto baratao = new Inseto("Baratão");
		baratao.locomover();
		baratao.info();

		Inseto lagartao = new Inseto("Lagartão Com Rabo");
		lagartao.locomover();
		lagartao.info();
	}

}
