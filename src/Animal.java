
public abstract class Animal {
    private String nome;
    private Filo filo;
    private Categoria categoria;
    private boolean vertebrado;
    private boolean locomove;
    
    public Animal(String nome, Filo filo, Categoria categoria){
        this.nome = nome;
        this.filo = filo;
        this.categoria = categoria;
        this.vertebrado = filo.isVertebrado();
        this.locomove = filo.getLocomove();
    }

    public String getNome() {
        return nome;
    }

    public boolean isVertebrado() {
        return vertebrado;
    }
    
    public boolean getLocomove() {
        return locomove;
    }
    
    public void locomover(){
        String msg = nome;
        msg += locomove ? " se locomoveu" : " não pode se locomover";
        
        System.out.println(msg);
    }
    
    public void comer() {
    	System.out.println("Nhami Nhami comidinha");
    }
    
    public void info() {
    	System.out.println("\n----------------------------------");
    	System.out.printf("Nome: %s\n", nome);
    	System.out.printf("Categoria: %s\n", categoria);
    	System.out.printf("Filo: %s\n", filo);
    	System.out.printf("Vertebrado: %s\n", vertebrado ? "Sim" : "Não");
    	System.out.println("----------------------------------");
    }
}
