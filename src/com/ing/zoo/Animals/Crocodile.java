package com.ing.zoo.Animals;

import com.ing.zoo.Interfaces.Animal;
import com.ing.zoo.Interfaces.Carnivore;
import com.ing.zoo.Interfaces.Trickster;

import java.util.Random;

public class Crocodile implements Animal, Carnivore, Trickster {

    public String name;
    public String helloText;
    public String eatText;
    public String trick;


    public Crocodile()
    {
    }

    @Override
    public void sayHello() {
        helloText = "crock crock hello";
        System.out.println(helloText);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void eatMeat() {
        eatText = "mmmmmmmmhhh sooo tasty!";
        System.out.println(eatText);
    }

    @Override
    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "opens it's mouth as wide as it can";
        }
        else
        {
            trick = "does a underwater twist";
        }
        System.out.println(trick);
    }
}
