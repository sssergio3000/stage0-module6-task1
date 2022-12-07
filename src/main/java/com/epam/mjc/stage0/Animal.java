package com.epam.mjc.stage0;

public class Animal {
    private final String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur){
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }
        public String getDescription(){
            String pawNum ="";
            String fur = hasFur?"a":"no";
            String forReturn="";

        if(this.numberOfPaws==1){
           pawNum = "paw";
        }
        else{
            pawNum = "paws";
        }


        forReturn = "This animal is mostly "+this.color+". It has "+this.numberOfPaws+" "+pawNum+" and "+fur+
                " fur.";
return forReturn;
        }




}
