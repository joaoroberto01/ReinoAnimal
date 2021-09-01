
public class Crustaceo extends Animal {

	public Crustaceo(String nome) {
		super(nome, Filo.ARTROPODE, Categoria.CRUSTACEO);
	}

	@Override
	public void locomover() {
		System.out.printf("%s nadando...\n", getNome());
	}
}
