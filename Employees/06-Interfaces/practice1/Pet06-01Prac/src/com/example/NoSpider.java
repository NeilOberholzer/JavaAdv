package com.example;

public class NoSpider extends NoAnimal {
    
    public NoSpider() {
        super(8);
    }

    @Override
    public void eat() {
        System.out.println("The spider eats a fly.");
    }
    
}