// Leetcode - 242
// Question:- Valid Anagram
// Anagram - Rearrange the letter of the word to get another word 
// ex: s = "cat" and t = "tac"

// Methods
// String.toCharArray() -- it will store the character array of the String.
// getOrDefault(Character,value) -- it will store the character and default value of the character.
// values() -- it will return the value of the hash map.

import java.util.HashMap;

class Anagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        HashMap<Character, Integer> hash = new HashMap<>();
        if (s.length() != t.length()) {
            System.out.println(false);
            return;
        }
        for (char ch : s.toCharArray()) {
            hash.put(ch, hash.getOrDefault(ch, 0) + 1);
        }
        for (char ch : t.toCharArray()) {
            hash.put(ch, hash.getOrDefault(ch, 0) - 1);
        }
        for (int ch : hash.values()) {
            if (ch != 0) {
                System.out.println("False");
                return;
            }
        }
        System.out.println("true");
    }
}
