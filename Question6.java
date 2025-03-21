public class Question6 {

        public static boolean question6(String p, char d, String s) {
            String delimiter = Character.toString(d);
            if (!Character.isLetter(d)) {
                delimiter = "\\" + delimiter;
            }

            String[] x = s.split(delimiter);

            if (x.length != p.length()) {

                return false;
            }
            for (int i=0; i<p.length(); i++) {

                for (int j=i+1; j<p.length(); j++) {

                    if ((p.charAt(i)== p.charAt(j)) != (x[i].equals(x[j]))) {

                        return false;

                    }
                }
            }
            return true;
        }

        public static void main(String[] args) {


            String input_P = "abba";
            String input_S = "dog?cat?cat?dog";
            char delimiter = '?';

            System.out.println("Test 1: ");
            System.out.println("Input: " + " PATTERN: " + input_P + " STRING: " + input_S);
            System.out.println("Output: " + question6(input_P, delimiter, input_S));
            System.out.println("--------------------------------------------------------------");

            input_P = "abba";
            input_S = "apple|banana|grape|apple";
            delimiter = '|';

            System.out.println("Test 2: ");
            System.out.println("Input: " + " PATTERN: " + input_P + " STRING: " + input_S);
            System.out.println("Output: " + question6(input_P, delimiter, input_S));
            System.out.println("--------------------------------------------------------------");

            input_P = "aaaa";
            input_S = "dog,cat,cat,dog";
            delimiter = ',';

            System.out.println("Test 3: ");
            System.out.println("Input: " + " PATTERN: " + input_P + " STRING: " + input_S);
            System.out.println("Output: " + question6(input_P, delimiter, input_S));
            System.out.println("--------------------------------------------------------------");

            input_P = "aaaa";
            input_S = "ice cream taco day";
            delimiter = ' ';

            System.out.println("Test 4: ");
            System.out.println("Input: " + " PATTERN: " + input_P + " STRING: " + input_S);
            System.out.println("Output: " + question6(input_P, delimiter, input_S));
            System.out.println("--------------------------------------------------------------");

            input_P = "adxp";
            input_S = "ice cream taco day";
            delimiter = ' ';

            System.out.println("Test 5: ");
            System.out.println("Input: " + " PATTERN: " + input_P + " STRING: " + input_S);
            System.out.println("Output: " + question6(input_P, delimiter, input_S));
            System.out.println("--------------------------------------------------------------");

        }

}
