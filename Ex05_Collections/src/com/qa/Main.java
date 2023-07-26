package com.qa;

import com.qa.model.Animal;
import com.qa.model.Cat;
import com.qa.model.Dog;
import com.qa.model.Rabbit;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Cat c = new Cat("Whiskers", 10);
        Cat c2 = new Cat("Midas", 8);
        Dog d = new Dog("Spot", 2);
        Rabbit r = new Rabbit("Peter", 2);
        Rabbit r2 = new Rabbit("Cottontail", 3);

        // ArrayList
        ArrayList<Animal> animalList = new ArrayList<Animal>();
        animalList.add(c);
        animalList.add(d);
        animalList.add(r);

        for (int x = 0; x < animalList.size(); x ++) {
            System.out.println(animalList.get(x));
        }

        // HashMap
        HashMap<String, Animal> animalMap = new HashMap<String, Animal>();
        animalMap.put(c.getName(), c);
        animalMap.put(d.getName(), d);
        animalMap.put(r.getName(), r);

        for (String key : animalMap.keySet()){
            System.out.println("Key: " + key + " Value: " + animalMap.get(key));
        }

        HashMap<Animal, String> animalMap2 = new HashMap<>();
        animalMap2.put(c, "Fluffy");
        animalMap2.put(d, "Overly excited about running");
        animalMap2.put(r, "Snuffles a lot, may have a cold");

        for (Animal key : animalMap2.keySet()){
            System.out.println("Key: " + key + " Value: " + animalMap2.get(key));
        }

        // Set
        HashSet<Animal> set = new HashSet<>();
        //we can just add all the elements of another collection
        set.addAll(animalList);

        Iterator<Animal> iter = set.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

        // Comparison
        Collections.sort(animalList);
        System.out.println("\nSorted animal list");
        for (int x = 0; x < animalList.size(); x++){
            System.out.println(animalList.get(x));
        }

        // TreeMap
        TreeMap<String, Animal> tree = new TreeMap<>();
        tree.putAll(animalMap);

        System.out.println("TreeMap");
        for (String key : tree.keySet()){
            System.out.println("Key: " + key + " Value: " + tree.get(key));
        }
    }
}
