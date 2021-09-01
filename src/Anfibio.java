public class Anfibio extends Animal {
	public Anfibio(String nome) {
		super(nome, Filo.CORDADO, Categoria.ANFIBIO);
	}
	
	@Override
	public void locomover() {
		System.out.printf("%s pulando...\n", getNome());
	}
}
