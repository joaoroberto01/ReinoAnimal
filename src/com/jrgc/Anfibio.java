package com.jrgc;

public class Anfibio extends Animal implements OnAnimalStatusChanged {
	public Anfibio(String nome) {
		super(nome, Filo.CORDADO, Categoria.ANFIBIO);
		setOnAnimalStatusChanged(this);
	}
	
	@Override
	public void locomover() {
		System.out.printf("%s pulando...\n", getNome());
		talvezMorra();
	}

	@Override
	public void morreu() {
		System.out.println("Morri... *rab..*");
	}

	@Override
	public void nasceu() {
		System.out.println("\nSou o " + getNome() + " e nasci...");
	}
}
