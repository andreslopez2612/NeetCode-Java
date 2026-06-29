import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] listWords = {"act","pots","tops","cat","stop","hat"};
        System.out.println(groupAnagrams(listWords));

    }
    public static List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] word = s.toCharArray(); //Convert to array
            Arrays.sort(word); //sort the word
            if (!map.containsKey(String.valueOf(word))) { //Check if its already exist
                map.put(String.valueOf(word), new ArrayList<>()); // if it not exists, create the key plus the ArrayList<>
            }
            map.get(String.valueOf(word)).add(s); //Add the word already sorted
        }

        return new ArrayList<>(map.values());
    }
}
