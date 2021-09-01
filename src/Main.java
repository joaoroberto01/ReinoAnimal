
public class Main {

	public static void main(String[] args) {
		Mamifero cachorro = new Mamifero("Cachorro");
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
		
		
	}

}
