
public class Main {

	public static void main(String[] args) {
		Mamifero cachorro = new Mamifero("Cachorro");
		cachorro.info();
		cachorro.locomover();
		
		Mamifero canguru = new Mamifero("Cangurú");
		canguru.info();
		canguru.locomover();
		
		Ave espacoNave = new Ave("Espaço Nave");
		espacoNave.info();
		espacoNave.locomover();
		
		Peixe peixeEspada = new Peixe("Peixe Espada");
		peixeEspada.info();
		peixeEspada.locomover();
		
		Anfibio sapin = new Anfibio("Sapin");
		sapin.info();
		sapin.locomover();
	}

}
