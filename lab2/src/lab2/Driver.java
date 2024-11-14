package lab2;

import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a sentence:");
            String input = scanner.nextLine();

            WordProcessor wordProcessor = new WordProcessor();

            int wordCount = wordProcessor.countWords(input);
            int letterCount = wordProcessor.countLetters(input);
            int sentenceLength = wordProcessor.getLength(input);

            System.out.println("Word Count: " + wordCount);
            System.out.println("Letter Count: " + letterCount);
            System.out.println("Sentence Length: " + sentenceLength);

            // Using the Counter interface
            Counter counter = wordProcessor;
            int wordCountFromCounter = counter.countWords(input);
            System.out.println("Word Count from Counter: " + wordCountFromCounter);
        } 
    }
}
