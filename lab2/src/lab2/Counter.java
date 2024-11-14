package lab2;

public interface Counter {
	int countWords(String sentence); //counts and returns the number of words in the provided sentence.
	int countLetters(String sentence); //counts and returns the number of letters in the provided sentence, excluding spaces and punctuation.
	int getLength(String sentence); //returns the total character count of the sentence, including spaces and punctuation.
}

