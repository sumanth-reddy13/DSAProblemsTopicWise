package org.example.CollectionFramework;

import java.util.LinkedHashSet;

public class LinkedHashSetEx {
    public static void main(String[] args) {

    // HashSet is class which implements Set interface. LinkedHashSet is a class, it extends HashSet.
    // In Linked HashSet, insertion order is maintained and no duplicates are present.

    // Methods used : add(), contains(), size(), isEmpty(), remove(), containsAll()
    // hashCode() : To generate hashCode for a given object, it adds the hashCodes of all the elements present
    //              in the set. If they are two objects containing same Generic class, then their hashCode has to be same.

        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        LinkedHashSet<Integer> set1 = new LinkedHashSet<>();


        set1.add(3);
        set1.add(8);
        set1.add(9);

        System.out.println(set1.isEmpty());

        set.add(3);
        set.add(8);
        set.add(0);
        set.add(6);

    // using remove() method.
        set.remove(6);

    // containsAll checks whether all the elements in set1 are present in set or not. Returns true if present.
        System.out.println(set.containsAll(set1));
        System.out.println(set.hashCode());

    // contains() method.
        System.out.println(set.contains(3));


    // Created two LinkedHashSets containing same strings. Their hashCodes are same ;)
        LinkedHashSet<String> set2 = new LinkedHashSet<>();

        set2.add("sumanth");
        set2.add("reddy");

        LinkedHashSet<String> set4 = new LinkedHashSet<>();
        set4.add("sumanth");
        set4.add("reddy");

        System.out.println("hashcode for set2 " + set2.hashCode() + "  "+ "hashcode for set4 " + set4.hashCode());
    }
}
