package com.epam.mjc.stage0;

public class Bird extends Animal{
    Bird(){
        super("blue",2,false);
    }

    @Override
    void getDescription() {
        super.getDescription();
        System.out.println(" Moreover, it has 2 wings and can fly.");
    }
}
