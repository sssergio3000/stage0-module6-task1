package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur){
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }
        public String getDescription(){
            String powNum ="";
            String fur = "a";
            String forReturn="";

        if(this.numberOfPaws==1){
           powNum = "paw";
        }
        if(this.numberOfPaws>1){
            powNum = "paws";
        }
        if (this.hasFur==false){
            fur = "no";
        }

        forReturn = "This animal is mostly "+this.color+". It has "+this.numberOfPaws+" "+powNum+" and "+fur+
                " fur.";
return forReturn;
        }




}
