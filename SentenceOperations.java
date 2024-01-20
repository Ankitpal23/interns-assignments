package Test1;
import java.util.Scanner;
public class SentenceOperations {
	public static void main(String[] args) {	
		        Scanner s = new Scanner(System.in);	        
		        // Input sentence
		        System.out.print("Enter a sentence: ");
		        String inputSentence = s.nextLine();	        
		        // 1. Count the number of words
		        int wordCount = countWords(inputSentence);        
		        // 2. Reverse the order of words
		        String reversedSentence = reverseWords(inputSentence);
		        // 3. Replace spaces with hyphens
		        String hyphenatedSentence = inputSentence.replace(' ', '-');
		     // Display results
		        System.out.println("1. Number of words: " + wordCount);
		        System.out.println("2. Reversed sentence: " + reversedSentence);
		        System.out.println("3. Sentence with hyphens: " + hyphenatedSentence);
		    }
		    private static int countWords(String sentence) {
		        String[] words = sentence.split("\\s+");
		        return words.length;
		    }
		    private static String reverseWords(String sentence) {
		        String[] words = sentence.split("\\s+");
		        StringBuilder reversed = new StringBuilder();
		        for (int i = words.length - 1; i >= 0; i--) {
		            reversed.append(words[i]).append(" ");
		        }
		        return reversed.toString().trim();
	}

}
