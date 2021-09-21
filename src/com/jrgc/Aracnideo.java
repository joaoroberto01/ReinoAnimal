package com.jrgc;

public class Aracnideo extends Animal implements OnAnimalStatusChanged {

	public Aracnideo(String nome) {
		super(nome, Filo.ARTROPODE, Categoria.ARACNIDEO);
		setOnAnimalStatusChanged(this);
	}

	@Override
	public void locomover() {
		System.out.printf("%s andando...\n", getNome());
		talvezMorra();
	}

	@Override
	public void morreu() {
		System.out.println("Morri... Tio Ben, vejo você em breve");
	}

	@Override
	public void nasceu() {
		System.out.println("\nSou o " + getNome() + " e nasci...");
	}
}
