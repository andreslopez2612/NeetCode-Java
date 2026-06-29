import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EncodeAndDecode {

    public static void main(String[] args) {
        EncodeAndDecode solution = new EncodeAndDecode();

        List<String> input = Arrays.asList("neet", "code", "love", "you");

        String encoded = solution.encode(input);
        System.out.println("Encoded: " + encoded);

        List<String> decoded = solution.decode(encoded);
        System.out.println("Decoded: " + decoded);
    }

    public String encode(List<String> strs) {
        StringBuilder newStringBuilder = new StringBuilder();
        for (String s : strs){
            newStringBuilder.append(s.length());
            newStringBuilder.append("#");
            newStringBuilder.append(s);
        }
        return newStringBuilder.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;

        while (i < str.length()) {
            int j = str.indexOf('#', i);

            int length = Integer.parseInt(str.substring(i, j));

            String res = str.substring(j + 1, j + 1 + length);
            result.add(res);

            i = j + 1 + length;
        }
        return result;
    }
}