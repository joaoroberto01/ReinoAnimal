
public class Inseto extends Animal {

	public Inseto(String nome) {
		super(nome, Filo.ARTROPODE, Categoria.INSETO);
	}

	@Override
	public void locomover() {
		System.out.printf("%s voando...\n", getNome());
	}
}
