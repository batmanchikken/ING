package com.ing.zoo;

import com.ing.zoo.Interfaces.Animal;
import com.ing.zoo.Interfaces.Carnivore;

public class Lion implements Animal, Carnivore {
    public String name;
    public String helloText;
    public String eatText;

    public Lion()
    {
    }

    public void sayHello()
    {
        helloText = "roooaoaaaaar";
        System.out.println(helloText);
    }

    public void eatMeat()
    {
        eatText = "nomnomnom thx mate";
        System.out.println(eatText);
    }
    public String getName() {
        return name;
    }
}
