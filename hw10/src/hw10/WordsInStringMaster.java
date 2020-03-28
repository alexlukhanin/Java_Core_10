/**
 * The homework on "Java Core" Course in LOGOS IT Academy
 * Lesson 10 - String processing
 * 
 * *
 */

package hw10;

/**
 * *
 * Application includes all 4 tasks in console menu 
 * @author alexl
 * 
 * @version 1.0
 *
 */

public class WordsInStringMaster {

//	private String string;

	public WordsInStringMaster() {
		super();

	}
/**  The method counts the number of words in the string*/
	public int countWords(String string) {
		int count = 1;
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == ' ') {
				count++;
			}
		}
		/* checking condition when last symbol in string is 'space'*/
		if (string.charAt(string.length() - 1) == ' ') {
			count = count -1; 
		}
		return count;

	}

	public String findMostOftenWord(String string) {
		
		String[] str = string.split("\\W+");         // Array wo separators
        int[] howMuch = new int[str.length];    // each word corresponds to the number of identical
        int maxCount = 0;                       
        int index = 0;                          
        for(int i=0; i<str.length; i++) 
            for(int j=0; j<str.length; j++) 
                if(str[i].equals(str[j])) howMuch[i]++; // it fulls array
        for(int i=0; i<howMuch.length; i++) 
            if(howMuch[i]>maxCount) {
                maxCount = howMuch[i];                  // find most often
                index = i;                              // index of most often word
            }
        
        if (maxCount > 1) {
        	return str[index];      
        } else {
        	return ".";
        }
                      
		
		
		
	}
	
	
}
