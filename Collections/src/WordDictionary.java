import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class WordDictionary {
    static Scanner in = new Scanner(System.in);
    static HashMap<Character, HashSet<String>> dictionary = new HashMap<>();

    public static void main(String[] args) {

        System.out.print("Enter Number of Words: ");
        int n = in.nextInt();

        //take input for n words
        takeInput(n, dictionary);

        printAll();
    }

    public static void takeInput(int n, HashMap<Character, HashSet<String>> dictionary) {
        String s;
        for (int i = 0; i < n; i++) {
            s = in.next();
            dictionary.putIfAbsent(s.charAt(0), new HashSet<>());
            dictionary.get(s.charAt(0)).add(s);
        }
    }

    //print letters with corresponding words
    public static void printAll() {
        dictionary.forEach((ch, set) -> {
            System.out.printf("For character %s - ", ch);
            printSet(ch);
        });
    }

    //print words of given letter
    public static void printSet(Character ch) {
        System.out.println(dictionary.getOrDefault(ch, new HashSet<>()));
    }
}