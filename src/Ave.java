public class Ave extends Animal {
	
	public Ave(String nome) {
		super(nome, Filo.CORDADO, Categoria.AVE);
	}
	
	@Override
	public void locomover() {
		System.out.printf("%s voando...\n", getNome());
	}
}
