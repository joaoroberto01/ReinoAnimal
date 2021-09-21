package com.jrgc;

public class Peixe extends Animal implements OnAnimalStatusChanged {
	
	public Peixe(String nome) {
		super(nome, Filo.CORDADO, Categoria.PEIXE);
		setOnAnimalStatusChanged(this);
	}
   
	@Override
	public void locomover() {
		System.out.printf("%s nadando...\n", getNome());
		talvezMorra();
	}

	@Override
	public void morreu() {
		System.out.println("Morri... *gloob*");
	}

	@Override
	public void nasceu() {
		System.out.println("\nSou o " + getNome() + " e nasci das ovas...");
	}
}
