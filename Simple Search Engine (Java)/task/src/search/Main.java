package search;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String word = scanner.next();

        if(line.contains(word)) {
            String[] wordList = line.split(" ");
            for (int i = 0; i < wordList.length; i++) {
                if (wordList[i].equals(word)) {
                    System.out.println(i + 1);
                }
            }
        } else {
            System.out.println("Not found");
        }

    }
}
