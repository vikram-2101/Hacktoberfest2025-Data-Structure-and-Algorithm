import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] vikram) {
        String ans = "";
        String str = "geekforgeeks";
        Set<Character> set = new HashSet<>();
        for (char ch : str.toCharArray()) {
            set.add(ch);
        }
        for (char ch : set) {
            ans += ch;
        }
        System.out.println(ans);
        String he = removeDuplicatesUsingSet(str);
        System.out.println(he);
    }

    public static String removeDuplicatesUsingSet(String input) {
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (char ch : input.toCharArray()) {
            set.add(ch);
        }

        StringBuilder result = new StringBuilder();
        for (char ch : set) {
            result.append(ch);
        }

        return result.toString();
    }
}
