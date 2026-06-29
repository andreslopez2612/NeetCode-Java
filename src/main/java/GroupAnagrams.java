import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] listWords = {"act","pots","tops","cat","stop","hat"};
        System.out.println(groupAnagrams(listWords));

    }
    public static List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] word = s.toCharArray();
            Arrays.sort(word);
            String key = String.valueOf(word);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
