import java.util.HashMap;

public class Longest_repeating_character {
    public static void main(String[] args) {
        String str = "AABAACDAA";
        HashMap<Character, Integer> frequency = new HashMap<>();
        int maxfreq = 0;
        char char_item = '\0';
        for (char ch : str.toCharArray()) {
            if (frequency.containsKey(ch)) {
                frequency.put(ch, frequency.get(ch) + 1);
            } else {
                frequency.put(ch, 1);
            }
        }
        for (char ch : frequency.keySet()) {
            int count = frequency.get(ch);
            if (count > maxfreq) {
                char_item = ch;
                maxfreq = count;
            }
        }
        System.out.println(maxfreq);

    }
}
// Methods :
// 1. toCharArray() -- it will return the character array of a string element.
// 2. containsKey(character) -- it will identify the character is present the Hash Map.
// 3. KeySet() -- it will return the keys in the hashmap and above the problem the charcter are the keys and it will the characters.
// 4. get() -- By using this, we can get the frrequency of the character.
