package com.example;

/**
 *
 * @author Neil
 */
public class NoCat extends NoAnimal implements NoPet{
    private String name;
    
    @Override
    public void setName(String name){
        this.name = name;
    }
    
    @Override
    public String getName(){
        return name;
    }
    
    public NoCat(String name){
        super(4);
        this.name = name;
    }

    public NoCat() {
        this("Fluffy");
    }
    
    @Override
    public void play(){
        System.out.println(name + " likes to play with string.");
    }
    
    @Override
    public void eat(){
        System.out.println("Cats like to eat spiders and fish.");
    }
    
    @Override
    public void walk(){
        System.out.println("Fish, of course, can't walk; they swim");
    }
}
