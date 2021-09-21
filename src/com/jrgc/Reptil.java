package com.jrgc;

public class Reptil extends Animal implements OnAnimalStatusChanged {
	public Reptil(String nome) {
		super(nome, Filo.CORDADO, Categoria.REPTIL);
		setOnAnimalStatusChanged(this);
	}
	
	@Override
	public void locomover() {
		System.out.printf("%s rastejando...\n", getNome());
		talvezMorra();
	}

	@Override
	public void morreu() {
		System.out.println("Morri...");
	}

	@Override
	public void nasceu() {
		System.out.println("\nSou o " + getNome() + " e nasci... sssssssssss");
	}
}
