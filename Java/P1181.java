import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        String input = new String();
        int index;
        int pfindex = 0;

        index = sc.nextInt();

        sc.nextLine();
        for (int i = 0; i < index; i++) {
            input = sc.nextLine();
            if (!words.contains(input)) {
                words.add(input);
                pfindex++;
            }
        }

        words.sort(new StringComparator());

        for (int i = 0; i <pfindex; i++) {
            System.out.println(words.get(i));
        }
    }

    static class StringComparator implements Comparator<String> {
        @Override
        public int compare(String s1, String s2) {

            if (s1.length() > s2.length()) {
                return 1;
            } else if (s1.length() < s2.length()) {
                return -1;
            } else {
                return s1.compareTo(s2);
            }


        }
    }
}