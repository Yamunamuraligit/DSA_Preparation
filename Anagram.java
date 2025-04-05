import java.util.HashMap;

class Anagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        HashMap<Character, Integer> hash = new HashMap<>();
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

// If the two strings are having same length and having the characters are same then it is called the Anagram.  
// ex: s = "cat" and t = "tac"
// Methods
// String.toCharArray() -- it will store the character array of the String
// getOrDefault(Character,value) -- it will store the character and default value of the character.

