package com.qa;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeMap;
import models.Cat;
import models.Dog;
import models.Rabbit;
import models.Animal;
public class Main {
    public static void main(String[] args) {
        Cat c = new Cat("Bella", 10);
        Cat c2 =  new Cat("Mishi", 2);
        Dog d = new Dog("Bruno", 15);
        Rabbit r = new Rabbit("Killy", 1);
        Rabbit r2 = new Rabbit("Billy", 100);

        ArrayList<Animal> animalsL = new ArrayList<Animal>();
        animalsL.add(c);
        animalsL.add(c2);
        animalsL.add(d);
        animalsL.add(r);
        animalsL.add(r2);

        for(int x = 0; x<animalsL.size();x++){
            System.out.println(animalsL.get(x));
        }
         HashMap<String, Animal> animalMap =
                 new HashMap<String, Animal>();

        animalMap.put(c.getName(), c);
        animalMap.put(c2.getName(), c2);
        animalMap.put(d.getName(), d);
        animalMap.put(r.getName(), r);
        animalMap.put(r2.getName(), r2);

        HashMap<Animal, String> animalMap2 = new HashMap<>();


        animalMap2.put(c, "Fluffy");
        animalMap2.put(c2, "Doesn't like being picked up");
        animalMap2.put(d, "Overly excited about running");
        animalMap2.put(r, "Snuffles a lot, may have a cold");
        animalMap2.put(r2, "May actually be evil. Unsure.");


        for (String key : animalMap.keySet()){
            System.out.println("Key: " + key + " Value: " + animalMap.get(key));
        }

        HashSet<Animal> set = new HashSet<>();
                   //we can just add all the elements of another collection
        set.addAll(animalsL);


        set.add(c); // replaces the previous version of the cat
        set.add(c2);


        Iterator<Animal> iter = set.iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

}