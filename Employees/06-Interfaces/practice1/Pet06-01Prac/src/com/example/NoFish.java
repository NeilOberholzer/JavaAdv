package com.example;

/**
 *
 * @author Neil
 */
public class NoFish extends NoAnimal implements NoPet{
    private String name;
    
    @Override
    public void setName(String name){
        this.name = name;
    }
    
    @Override
    public String getName(){
        return name;
    }

    public NoFish() {
        super(0);
    }
    
    @Override
    public void play(){
        System.out.println("Just keep swimming.");
    }
    
    @Override
    public void eat(){
        System.out.println("Fish eat pond scum.");
    }
    
    @Override
    public void walk(){
        System.out.println("Fish, of course, can't walk; they swim");
    }
}
