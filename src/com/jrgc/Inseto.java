package com.jrgc;

public class Inseto extends Animal implements OnAnimalStatusChanged {

	public Inseto(String nome) {
		super(nome, Filo.ARTROPODE, Categoria.INSETO);
		setOnAnimalStatusChanged(this);
	}

	@Override
	public void locomover() {
		System.out.printf("%s voando...\n", getNome());
		talvezMorra();
	}

	@Override
	public void morreu() {
		System.out.println("Morri... ploft");
	}

	@Override
	public void nasceu() {
		System.out.println("\nSou o " + getNome() + " e nasci...");
	}
}
