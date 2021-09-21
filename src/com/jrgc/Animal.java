package com.jrgc;

import java.util.Random;

public abstract class Animal {
    private final String nome;
    private final Filo filo;
    private final Categoria categoria;
    private final boolean vertebrado;
    private final boolean locomove;
    private boolean vivo = true;

    private OnAnimalStatusChanged onAnimalStatusChanged;
    
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

    public void setOnAnimalStatusChanged(OnAnimalStatusChanged onAnimalStatusChanged){
        if (this.onAnimalStatusChanged != null)
            return;

        this.onAnimalStatusChanged = onAnimalStatusChanged;
        onAnimalStatusChanged.nasceu();
    }
    
    public void locomover(){
        String msg = nome;
        msg += locomove ? " se locomoveu" : " não pode se locomover";
        
        System.out.println(msg);
        talvezMorra();
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
        System.out.printf("Vivo: %s\n", vivo ? "Sim" : "Não");
    	System.out.println("----------------------------------");
    }

    public void talvezMorra(){
        if (onAnimalStatusChanged == null)
            return;
        boolean morreu = new Random().nextFloat() <= 0.4; //40% of chance
        if (vivo && morreu) {
            onAnimalStatusChanged.morreu();
            vivo = false;
        }
    }
}
