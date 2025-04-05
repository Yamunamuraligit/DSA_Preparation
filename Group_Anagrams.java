// LeetCode Problem - 49
// Question :- Grouping_Anagrams
//Here we are grouping the anagram of the same word in an nested list.

// Methods
// String.toCharArray() -- it will return the character of the string.
// Arrays.sort() -- it is a method where it will sort the characters of the array.
// HashSet.conatinsKey(Key_value_of_hash) -- it is method, it will check the key is present in the HashSet.
// HashSet.put(Key,Value)-- it will add the key and value to the HashSet.
// HashSet.get(Key) -- it will get the Key value of the HashSet.
// HashSet.get(Key).add(value) -- it will get the key value of the HashSet and add the value to the Key Value in the hashset.
// HashSet.values() -- it will return the all values of the HashSet.


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Group_anagrams {
    public static void main(String[] args) {
        String[] arr = { "tea", "eat", "tan", "ate", "nat", "bat" };
        HashMap<String, ArrayList<String>> hash = new HashMap<>();
        for (String name : arr) {
            char[] stringcopy = name.toCharArray();
            Arrays.sort(stringcopy);
            String sortedString = new String(stringcopy);
            if (!hash.containsKey(sortedString)) {
                hash.put(sortedString, new ArrayList<>(Arrays.asList(name)));
            } else {
                hash.get(sortedString).add(name);
            }
        }
        List<List<String>> result = new ArrayList<>(hash.values());
        System.out.println(result);
    }
}
