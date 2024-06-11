package com.ing.zoo;

import com.ing.zoo.Interfaces.Animal;
import com.ing.zoo.Interfaces.Herbivore;

public class Zebra implements Animal, Herbivore {
    public String name;
    public String helloText;
    public String eatText;
    public String trick;

    public Zebra()
    {
    }

    public void sayHello()
    {
        helloText = "zebra zebra";
        System.out.println(helloText);
    }

    public void eatLeaves()
    {
        eatText = "munch munch zank yee bra";
        System.out.println(eatText);
    }

    @Override
    public String getName() {
        return name;
    }
}
