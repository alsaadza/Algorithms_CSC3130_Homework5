import java.util.*;

public class Question5 {


    public static void radixSort(String[] s) {

        int maxChars = 0;
        for (String str : s) {
            if (str.length() > maxChars) {
                maxChars = str.length();
            }
        }

        for (int currentPosition = maxChars - 1; currentPosition >= 0; currentPosition--) {
            HashMap<Character, List<String>> buckets = new HashMap<>();
            for (char c = 32; c <= 126; c++) { //the 36 to 126 is the possible ascii characters this method accepts!
                buckets.put(c, new ArrayList<>());
            }

            buckets.put('\0', new ArrayList<>());
            for (int i = 0; i < s.length; i++) {
                String str = s[i];
                char key = (currentPosition < str.length()) ? str.charAt(currentPosition) : '\0';
                buckets.get(key).add(str);
            }

            int index = 0;

            if (buckets.containsKey('\0')) {
                List<String> nullBucket = buckets.get('\0');
                for (int i = 0; i < nullBucket.size(); i++) {
                    s[index++] = nullBucket.get(i);
                }
            }

            for (char c = 32; c <= 126; c++) {
                if (buckets.containsKey(c)) {
                    List<String> bucket = buckets.get(c);
                    for (int i = 0; i < bucket.size(); i++) {
                        s[index++] = bucket.get(i);
                    }
                }
            }

        }
    }

    public static void main(String[] args) {
        System.out.println();
        System.out.println("WITH UPPERCASE FOR EXTRA CREDIT");
        String[] s = {
                "ESTEBAN", "IS", "AMAZING", ";)", "google", "gojo", "amazingly", "jogo", "luna", "pup", "solas", "solo", "pupperino", "amaterasu", "amazon", "puppy", "hydra", "amazonia", "vueltiao"
        };
        radixSort(s);
        System.out.println(Arrays.toString(s));

        System.out.println();
        System.out.println("Regular sample");

        String[] t  = {
                "google", "gojo", "amazingly", "jogo", "luna", "pup", "solas", "solo", "pupperino", "amaterasu", "amazon", "puppy", "hydra", "amazonia", "vueltiao"
        };
        radixSort(t);
        System.out.println(Arrays.toString(t));

    }

}