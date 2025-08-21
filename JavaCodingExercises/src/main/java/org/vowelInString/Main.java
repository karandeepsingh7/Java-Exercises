/**
 * Author : Karandeep Singh
 * Description : Check if a vowel is present in a String
 */

package org.vowelInString;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static boolean checkContainsVowel(String s){
        return s.toLowerCase().matches(".*[aeiou].*");
    }

    public static void main(String[] args) {
        String s = "Testing";
        // Using Method
        System.out.println(checkContainsVowel(s));

        // Using Set Collection
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');

        char[] array = s.toLowerCase().toCharArray();

        boolean vowel = false;
        for(char x : array)
        {
            if(set.contains(x)) {
                vowel = true;
            }
        }
        if(vowel == true) {
            System.out.print(s + " contains vowel");
        }
        else {
            System.out.print(s + " does not contains vowel");
        }

    }
}