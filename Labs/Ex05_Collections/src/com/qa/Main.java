package com.qa;

import com.qa.model.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Cat c = new Cat("Whiskers", 10);
        Cat c2 = new Cat("Midas", 8);
        Dog d = new Dog("Spot", 2);
        Rabbit r = new Rabbit("Peter", 2);
        Rabbit r2 = new Rabbit("Cottontail", 3);


        ArrayList<Animal> animalList = new ArrayList<Animal>();

        animalList.add(c);
        animalList.add(c2);
        animalList.add(d);
        animalList.add(r);
        animalList.add(r2);

        Collections.sort(animalList);

        /*
        for ( int i=0; i < animalList.size(); i++)
        {
            System.out.println( animalList.get(i));
        }
        System.out.println();

        for (Animal a : animalList) {
            System.out.println(a);
        }
        System.out.println();
        */

        Iterator<Animal> it = animalList.iterator();

        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        System.out.println();


        /*
        HashMap<String, Animal> hmap = new HashMap<>();
        hmap.put(c.getName(), c);
        hmap.put(c2.getName(), c2);
        hmap.put(d.getName(), d);
        hmap.put(r.getName(), r);
        hmap.put(r2.getName(), r2);

        HashMap<Animal, String> gmap = new HashMap<>();
        gmap.put(c, "Lovely cat");
        gmap.put(c2, "Grumpy cat");
        gmap.put(d, "Friendly dog");
        gmap.put(r, "White rabbit");
        gmap.put(r2, "Black rabbit");

        System.out.println(hmap);
        System.out.println(gmap);
        */

        HashSet<Animal> hset = new HashSet<>();
        hset.add(c);
        hset.add(c2);
        hset.add(d);
        hset.add(r);
        hset.add(r2);

        hset.add(c);
        hset.add(c);



       Iterator<Animal> setit = hset.iterator();

       while (setit.hasNext()) {
           System.out.println(setit.next());
       }
        System.out.println();




       SortedSet<Animal> sortedSet = new TreeSet<>();
       sortedSet.addAll(animalList);

        System.out.println(sortedSet);




    }
}
