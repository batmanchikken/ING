package com.ing.zoo;

import com.ing.zoo.Interfaces.Animal;
import com.ing.zoo.Interfaces.Carnivore;
import com.ing.zoo.Interfaces.Herbivore;
import com.ing.zoo.Interfaces.Trickster;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Zoo {
    public static void main(String[] args)
    {
        String[] commands = new String[4];
        commands[0] = "hello";
        commands[1] = "give leaves";
        commands[2] = "give meat";
        commands[3] = "perform trick";

        Lion henk = new Lion();
        henk.name = "henk";
        Hippo elsa = new Hippo();
        elsa.name = "elsa";
        Pig dora = new Pig();
        dora.name = "dora";
        Tiger wally = new Tiger();
        wally.name = "wally";
        Zebra marty = new Zebra();
        marty.name = "marty";

        List<Animal> animals = Arrays.asList(henk, elsa, dora, wally, marty);


        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");

        String input = scanner.nextLine();
        if(input.equals(commands[0])) {
            animals.forEach(Animal::sayHello);
        } else {
            String newInput = input.replace(commands[0], "");
            animals.stream()
                    .filter(animal -> animal.getName().equals(newInput.trim()))
                    .findFirst()
                    .ifPresent(Animal::sayHello);
        }

        if (input.equals(commands[1])){
            animals.stream().filter(animal -> animal instanceof Herbivore)
                    .forEach(animal -> ((Herbivore) animal).eatLeaves());
        }

        if (input.equals(commands[2])){
            animals.stream().filter(animal -> animal instanceof Carnivore)
                    .forEach(animal -> ((Carnivore) animal).eatMeat());
        }

        if (input.equals(commands[3])){
            animals.stream().filter(animal -> animal instanceof Trickster)
                    .forEach(animal -> ((Trickster) animal).performTrick());
        }
    }
}
