package com.jrgc;

public class Ave extends Animal implements OnAnimalStatusChanged {
	
	public Ave(String nome) {
		super(nome, Filo.CORDADO, Categoria.AVE);
		setOnAnimalStatusChanged(this);
	}
	
	@Override
	public void locomover() {
		System.out.printf("%s voando...\n", getNome());
		talvezMorra();
	}

	@Override
	public void morreu() {
		System.out.println("Morri... *caido no chão*");
	}

	@Override
	public void nasceu() {
		System.out.println("\nSou o " + getNome() + " e choquei meu ovo... piu piu!");
	}
}
