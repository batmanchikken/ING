package com.ing.zoo;

import com.ing.zoo.Interfaces.Animal;

public class Hippo implements Animal {
    public String name;
    public String helloText;
    public String eatText;

    public Hippo()
    {
    }

    public void sayHello()
    {
        helloText = "splash";
        System.out.println(helloText);
    }

    public void eatLeaves()
    {
        eatText = "munch munch lovely";
        System.out.println(eatText);
    }
}
