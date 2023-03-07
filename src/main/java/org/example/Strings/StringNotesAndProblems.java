package org.example.Strings;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class StringNotesAndProblems {
/*
        String is an Object in Java.

        Question - Why is String immutable in Java?

        Answer - Strings are stored in String pool. If you create string "sumanth" many times using different variables,
            Only one object of String is created in the string pool and all the variables will be pointing to the same
            object in the string pool.

            ->  Java does this to save memory and be efficient.
            ->  If some changes are made in the variable pointing to "sumanth" object, if the "sumanth" object is modified then
                all the other variables will also be modified to that particular change.
            ->  Inorder to avoid that, Strings are made immutable.
            ->  If you modify a string object, another object of that will be created in the string pool.

        Question - Why is String class final in Java?

        Answer:  String class is final because others should not be able to override string class methods and change the
                functionality of the methods.
                -> Generally, Strings are used as keys in the HashMap. HashMap uses hash values to store the key. After
                inserting values in to the hashMap, if the hashCode method of string is modified, the hashValue will be different
                before insertion and after insertion.
                ->
*/
    public static void main(String[] args) {
//        printDuplicatesInAString("malayalam");
//        isAnagram2("sumanth", "alamlamay");
        problem4("-134");
    }

    // Problem - 1
    // Given a string, print the duplicates in the string.
    public static void printDuplicatesInAString(String string) {
        char[] ch = string.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0;i < ch.length;i++) {
            map.put(ch[i], map.getOrDefault(ch[i], 0) + 1);
        }

        System.out.println(map.entrySet());

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry);
        }

        System.out.println("The repeated characters in the string are: ");
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }

    // Problem - 2
    // Given two Strings, check if the two are anagrams or not.
    public static void isAnagram(String s1, String s2) {
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        String newString1 = new String(ch1);
        String newString2 = new String(ch2);

        System.out.println(newString1 + "  " + newString2);
        if (newString1.equals(newString2)) System.out.println("ANAGRAMS");
        else System.out.println("NOT ANAGRAMS");
    }

    // Problem - 3
    // This question is same as the 2nd question but I wanna sort the char Array in descending order and want to use
    //  custom comparator for the sorting.
    public static void isAnagram2(String s1, String s2) {
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();

        // From char[] to Character[].
        Character[] c1 = new Character[ch1.length];
        Character[] c2 = new Character[ch2.length];

        for (int i = 0;i < ch1.length;i++) {
            c1[i] = ch1[i];
        }

        for (int i = 0;i < ch2.length;i++) {
            c2[i] = ch2[i];
        }

//      sorted in descending order using lambda Expression
        Arrays.sort(c1, (a,b) -> (b - a > 0 ? 1 : -1));

//      sorted in descending order using Comparator interface.
        Arrays.sort(c2, new Comparator<Character>(){
            @Override
            public int compare(Character a, Character b) {
                return b - a;
            }
        });
        System.out.println(Arrays.toString(c1) + "      " + Arrays.toString(c2));

        if (c1.length != c2.length) {
            System.out.println("NOT ANAGRAMS");
            return;
        }
        for (int i = 0;i < c1.length;i++) {
            if (c1[i] != c2[i]) {
                System.out.print("NOT ANAGRAMS");
                return;
            }
        }
        System.out.print("ANAGRAMS");
    }

    // Problem - 4
    // Check if the given String contains only numbers.
    public static void problem4(String string) {
        char[] ch = string.toCharArray();

        for (char char1 : ch) {
            if (char1 >= 48 && char1 <= 57) {
                continue;
            }
            else {
                System.out.println("false");
                return;
            }
        }
        System.out.println("given string contains only digits");
    }

    // Problem - 5
    // leetcode- 1662 [check if the two strings are equal
    // Try this question without using any inbuilt string methods.

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        int i = 0;
        int j = 0;

        String s1 = word1[i++];
        String s2 = word2[j++];

        // While loop runs until both the strings are empty. If both are empty, then they are equal.
        while (s1.length() != 0 && s2.length() != 0) {

            while (s1.length() != 0 && s2.length() != 0) {
                if (s1.charAt(0) != s2.charAt(0)) return false;
                s1 = s1.substring(1);
                s2 = s2.substring(1);
            }
            if ((s1.equals("") && i == word1.length) && (s2.equals("") && j==word2.length)) {
                return true;
            }
            // If any of the string is null and its word array is at the end. That means the strings are not equal.
            if ((s1.equals("") && i == word1.length) || s2.equals("") && j==word2.length) {
                return false;
            }
            if (s1.equals("")) {
                s1 = word1[i++];
            }
            if (s2.equals("")) {
                s2 = word2[j++];
            }
        }
        return true;
    }
}
