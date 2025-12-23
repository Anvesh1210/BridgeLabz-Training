//replacing a word from a sentence
import java.util.Scanner;
public class ReplaceWordInSentence{
    //method to replace a word from the given sentence
    public static String replaceWord(String sentence, String oldWord, String newWord) {
        String[] words = sentence.split(" ");
        String result = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(oldWord)) {
                result += newWord;
            } else {
                result += words[i];
            }
            if (i < words.length - 1) {
                result += " ";
            }
        }

        return result;
    }

    public static void main(String[] args){
		//creating Scanner object
        Scanner sc = new Scanner(System.in);
	
		//taking a string and two words from the user
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        System.out.print("Enter the word to replace: ");
        String oldWord = sc.next();

        System.out.print("Enter the new word: ");
        String newWord = sc.next();	
			
		//calling the method to get new sentence
        String modified = replaceWord(sentence, oldWord, newWord);
		
		//printing the result
        System.out.println("Modified Sentence: " + modified);
		
		//closing the scanner
        sc.close();
    }
}
