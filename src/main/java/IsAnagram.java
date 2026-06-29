
import java.util.*;

public class IsAnagram {
    public static void main(String[] args){
        String val1 = "racecaa";
        String val2 = "carrace";
        System.out.println(isAnagram(val1, val2));
    }

    public static boolean isAnagram(String s, String t) {

        if (s.isEmpty() || t.isEmpty() || (s.length() != t.length())){
            System.out.println("Pasa primer false");
            return false;
        }
        
        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(s2);
        System.out.println(s1);
        System.out.println(s2);

        return Arrays.equals(s1, s2);
    }
}