package lab2;

public class WordProcessor implements Counter{
    @Override
    public int countWords(String sentence) {
        String[] words = sentence.split(" ");
        return words.length;
    }
    
    @Override
    public int countLetters(String sentence) {
        int letters = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (Character.isLetter(sentence.charAt(i))) {
                letters++;
            }
        }
        return letters;
    }
    @Override
   
    public int getLength(String sentence) {
        return sentence.length();
    
    }


}
