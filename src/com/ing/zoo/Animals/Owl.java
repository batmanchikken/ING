package com.ing.zoo.Animals;

import com.ing.zoo.Interfaces.Animal;
import com.ing.zoo.Interfaces.Carnivore;
import com.ing.zoo.Interfaces.Herbivore;
import com.ing.zoo.Interfaces.Trickster;

import java.util.Random;

public class Owl implements Animal, Carnivore, Trickster {
    public String name;
    public String helloText;
    public String eatText;
    public String trick;

    public Owl()
    {
    }

    public void sayHello()
    {
        helloText = "OE OE";
        System.out.println(helloText);
    }

    public void eatMeat()
    {
        eatText = "munch munch, rats are so tasty!";
        System.out.println(eatText);
    }

    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "turns their head around  180 degrees and back";
        }
        else
        {
            trick = "flies away in complete silence";
        }
        System.out.println(trick);
    }

    @Override
    public String getName() {
        return name;
    }
}
