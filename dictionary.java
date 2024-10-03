package lab3;

import java.util.ArrayList;
import java.util.Scanner;

public class dictionary {

    public static void main(String[] args) {
        String exit = "-99";
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");

        String word = input.next();
        String longWord = "";
        String shortWord = word;
        String currentWord = "";
        double averageLength = 0.0;
        int numberOfWords = 0;
        numberOfWords++;
        
        while (!currentWord.equals(exit)) {
            System.out.print("Enter a word: ");
            currentWord = input.next();

             if (currentWord.equals(exit)) {
                break;
            }
            averageLength = shortWord.length() + currentWord.length();
            numberOfWords++;
            
            if (currentWord.length() > shortWord.length()) {
                longWord = currentWord;
            }
            if (currentWord.length() < shortWord.length()) {
                shortWord = currentWord;

            }
            
        }
       averageLength = averageLength/numberOfWords;
        System.out.println("shortest word: " + shortWord);
        System.out.println("longest word: " + longWord);
        System.out.printf("Average Length: %.2f",averageLength);
       
        
    }
}

