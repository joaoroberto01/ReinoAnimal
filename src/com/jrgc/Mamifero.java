package com.jrgc;

public class Mamifero extends Animal implements OnAnimalStatusChanged {

	public Mamifero(String nome) {
		super(nome, Filo.CORDADO, Categoria.MAMIFERO);
		setOnAnimalStatusChanged(this);
	}
	
	@Override
	public void locomover() {
		System.out.printf("%s andando...\n", getNome());
		talvezMorra();
	}

	@Override
	public void morreu() {
		System.out.println("Morri... meu pelo caiu xP");
	}

	@Override
	public void nasceu() {
		System.out.println("\nSou o " + getNome() + " e nasci... hora de mamar!");
	}
}
