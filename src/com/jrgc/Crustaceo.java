package com.jrgc;

public class Crustaceo extends Animal implements OnAnimalStatusChanged{

	public Crustaceo(String nome) {
		super(nome, Filo.ARTROPODE, Categoria.CRUSTACEO);
		setOnAnimalStatusChanged(this);
	}

	@Override
	public void locomover() {
		System.out.printf("%s nadando...\n", getNome());
		talvezMorra();
	}

	@Override
	public void morreu() {
		System.out.println("Morri...");
	}

	@Override
	public void nasceu() {
		System.out.println("\nSou o " + getNome() + " e nasci...");
	}
}
