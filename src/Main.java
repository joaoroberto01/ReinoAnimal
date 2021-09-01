
public class Main {

	public static void main(String[] args) {
		Mamifero cachorro = new Mamifero("Cachorro Caramelo");
		cachorro.info();
		cachorro.locomover();
		
		Mamifero boi = new Mamifero("Boi Bravo");
		boi.info();
		boi.locomover();
		
		Ave espacoNave = new Ave("Espaço Nave");
		espacoNave.info();
		espacoNave.locomover();
		
		Peixe peixeEspada = new Peixe("Peixe Espada");
		peixeEspada.info();
		peixeEspada.locomover();
		
		Anfibio sapin = new Anfibio("Sapin");
		sapin.info();
		sapin.locomover();
		
		Reptil tartaruga = new Reptil("Jacared");
		tartaruga.info();
		tartaruga.locomover();
		
		Aracnideo aranha = new Aracnideo("Aranha");
		aranha.info();
		aranha.locomover();
		
		Crustaceo camarao = new Crustaceo("Camarão");
		camarao.info();
		camarao.locomover();
		
		Inseto baratao = new Inseto("Baratão");
		baratao.info();
		baratao.locomover();
		
		Inseto lagartao = new Inseto("Lagartão Com Rabo");
		lagartao.info();
		lagartao.locomover();
	}

}
