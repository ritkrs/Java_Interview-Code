import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String longestEvenWord = getEvenWord("00 to Hello");
        System.out.println(longestEvenWord);
    }

    private static String getEvenWord(String input) {
        List<String> words = Arrays.asList(input.split(" "));
        String result = "";

        for (String word : words) {
            if (word.length() % 2 == 0 && word.length() > result.length()) {
                result = word;
            }
        }

        if (result.equals("")) {
            return "00";
        }
        return result;
    }
}
