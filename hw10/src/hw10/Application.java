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

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		/* Declarations of variables and objects */

		MainMenu mainMenu = new MainMenu();
		Menu2 menu2 = new Menu2();
		Scanner sc = new Scanner(System.in);
	//	String checkedString;
		String menuSting;
		InputMenuString inputMenuString;
		WordsInStringMaster wordsInStringMaster = new WordsInStringMaster();

		/* printing of both menus */
		mainMenu.printMenu();
		menu2.printMenu();

		while (true) {

			inputMenuString = new InputMenuString(sc.next());
			menuSting = inputMenuString.getString();

			if (inputMenuString.flag) {

				switch (menuSting) {
				case "1": {
					System.out.println("Перівірка на паліндром з 5 літер:");
					System.out.println("Введіть, будь-ласка, слово з 5 літер");
					InputChecker inputChecker = new InputChecker(sc.next());
					System.out.println("Для продовження, вибріть пункт меню...");
					menu2.printMenu();

					break;
				}

				case "2": {
					System.out.println("Введіть будь-яку строку, будь-ласка: ");
					sc = new Scanner(System.in);
					String string = sc.nextLine();
					if (!string.isEmpty()) {
						ReplacerOfVowelSymbols replacerOfSymbols = new ReplacerOfVowelSymbols(string);
						System.out.println(replacerOfSymbols.replaceSymbols());
					} else {
						System.out.println("Ви ввели порожню строку.  Введіть пункт меню [2] та спробуйте ще раз. ");
					}
					System.out.println("Для продовження, вибріть пункт меню...");
					menu2.printMenu();
					break;
				}

				case "3": {
					System.out.println("Введіть будь-яку строку, будь-ласка: ");
					sc = new Scanner(System.in);
					String string = sc.nextLine();
					if (!string.isEmpty()) {
						int count = wordsInStringMaster.countWords(string);
						System.out.println("У введеній строці " + count + " слова(слів)");
					} else {
						System.out.println("Ви ввели порожню строку.  Введіть пункт меню [3] та спробуйте ще раз. ");
					}

					System.out.println("Для продовження, вибріть пункт меню...");
					menu2.printMenu();
					break;
				}

				case "4": {
					System.out.println("Введіть будь-яку строку, будь-ласка: ");
					sc = new Scanner(System.in);
					String string = sc.nextLine();
					if (!string.isEmpty()) {
						String s1 = wordsInStringMaster.findMostOftenWord(string);
						if (s1.equalsIgnoreCase(".")) {
							System.out.println("У введеній строці немає слів, що повторюються");
						} else {
							System.out.println("У введеній строці найчастіше зустрічається слово: " + s1);
						}

					} else {
						System.out.println("Ви ввели порожню строку.  Введіть пункт меню [4] та спробуйте ще раз. ");
					}

					System.out.println("Для продовження, вибріть пункт меню...");
					menu2.printMenu();
					break;
				}

				case "menu": {
					mainMenu.printMenu();
					break;
				}

				case "q": {
					System.out.println("Вихід з програми. До побачення!");
					System.exit(0);
					sc.close();
				}

				default: {

					break;
				}

				}

			}

		}

	}

}
