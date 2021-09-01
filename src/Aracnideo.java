
public class Aracnideo extends Animal {

	public Aracnideo(String nome) {
		super(nome, Filo.ARTROPODE, Categoria.ARACNIDEO);
	}

	@Override
	public void locomover() {
		System.out.printf("%s andando...\n", getNome());
	}
}
