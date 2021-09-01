public class Reptil extends Animal {
	public Reptil(String nome) {
		super(nome, Filo.CORDADO, Categoria.REPTIL);
	}
	
	@Override
	public void locomover() {
		System.out.printf("%s rastejando...\n", getNome());
	}
}
