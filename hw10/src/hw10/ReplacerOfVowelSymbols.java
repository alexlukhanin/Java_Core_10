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

public class ReplacerOfVowelSymbols {

	/* Vowel letters string */
	public static final String VOWELS = "AEIOUaeiouÀàÎîÓó²³ÈèÅåªºßÿÞþ¯¿";

	private String string;

	/* constructor declaration */
	public ReplacerOfVowelSymbols(String string) {
		super();

		this.string = string;

	}

	/* getters and setters */
	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	/* Methods declarations */

	public String replaceSymbols() {
		StringBuilder resBox = new StringBuilder();
		for (char c : string.toCharArray()) {
			if (isVowel(c)) {
				resBox.append('-');
			} else {
				resBox.append(c);
			}

		}
		return resBox.toString();

	}

	static boolean isVowel(char c) {
		return VOWELS.indexOf(c) >= 0;
	}

}
