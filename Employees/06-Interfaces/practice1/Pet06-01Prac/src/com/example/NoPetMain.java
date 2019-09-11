package com.example;

public class NoPetMain {

    public static void main(String[] args) {
        NoAnimal a;
        //test a spider with a spider reference
        NoSpider s = new NoSpider();
        s.eat();
        s.walk();
        //test a spider with an animal reference
        a = new NoSpider();
        a.eat();
        a.walk();

        NoPet p;
        NoCat c = new NoCat("Buttons");
        c.eat();
        c.walk();
        c.play();
        a = new NoCat();
        a.eat();
        a.walk();
        p = new NoCat();
        p.setName("Mr. Whiskers");
        p.play();
        
        NoFish f = new NoFish();
        f.setName("Flounder");
        f.eat();
        f.walk();
        f.play();
        
        a = new NoFish();
        a.eat();
        a.walk();
        
        playWithAnimal(s);
        playWithAnimal(c);
        playWithAnimal(f);
    }
    
    public static void playWithAnimal(NoAnimal a) {
        if (a instanceof NoPet) {
            NoPet p = (NoPet) a;
            p.play();
        } else {
            System.out.println("Danger! Wild Animal");
        }
    }
}
