package com.epam.mjc.stage0;

public class Bird extends Animal{
    Bird(){
        super("blue",2,false);
    }

    @Override
    String getDescription() {
        String forReturn = super.getDescription()+" Moreover, it has 2 wings and can fly.";
        return forReturn;

    }
}
