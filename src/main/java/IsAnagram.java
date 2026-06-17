import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class IsAnagram {
    public static void main(String[] args){
        String val1 = "racecar";
        String val2 = "carrace";
        System.out.println(isAnagram(val1, val2));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        char[] arrS = s.toCharArray();
        char[] arrT = t.toCharArray();

        Arrays.sort(arrS);
        Arrays.sort(arrT);
        System.out.println(arrS);

        return Arrays.equals(arrS, arrT);
    }
}