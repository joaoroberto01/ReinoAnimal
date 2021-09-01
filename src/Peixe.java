public class Peixe extends Animal {
	
	public Peixe(String nome) {
		super(nome, Filo.CORDADO, Categoria.PEIXE);
	}
   
	@Override
	public void locomover() {
		System.out.printf("%s nadando...\n", getNome());
	}
}
