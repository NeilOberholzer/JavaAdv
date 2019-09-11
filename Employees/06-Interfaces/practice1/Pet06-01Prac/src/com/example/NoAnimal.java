package com.example;

public abstract class NoAnimal {
    
    protected int legs;
    
    public NoAnimal(int legs) {
        this.legs = legs;
    }
    
    public void walk() {
        System.out.println("This animal walks on " + legs + " legs.");
    }
    
    public abstract void eat();
    
}