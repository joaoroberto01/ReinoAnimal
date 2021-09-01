
public class Mamifero extends Animal {

	public Mamifero(String nome) {
		super(nome, Filo.CORDADO, Categoria.MAMIFERO);
	}
	
	@Override
	public void locomover() {
		System.out.printf("%s andando...\n", getNome());
	}
    
}
