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
					System.out.println("������� �� �������� � 5 ����:");
					System.out.println("������, ����-�����, ����� � 5 ����");
					InputChecker inputChecker = new InputChecker(sc.next());
					System.out.println("��� �����������, ������ ����� ����...");
					menu2.printMenu();

					break;
				}

				case "2": {
					System.out.println("������ ����-��� ������, ����-�����: ");
					sc = new Scanner(System.in);
					String string = sc.nextLine();
					if (!string.isEmpty()) {
						ReplacerOfVowelSymbols replacerOfSymbols = new ReplacerOfVowelSymbols(string);
						System.out.println(replacerOfSymbols.replaceSymbols());
					} else {
						System.out.println("�� ����� ������� ������.  ������ ����� ���� [2] �� ��������� �� ���. ");
					}
					System.out.println("��� �����������, ������ ����� ����...");
					menu2.printMenu();
					break;
				}

				case "3": {
					System.out.println("������ ����-��� ������, ����-�����: ");
					sc = new Scanner(System.in);
					String string = sc.nextLine();
					if (!string.isEmpty()) {
						int count = wordsInStringMaster.countWords(string);
						System.out.println("� ������� ������ " + count + " �����(���)");
					} else {
						System.out.println("�� ����� ������� ������.  ������ ����� ���� [3] �� ��������� �� ���. ");
					}

					System.out.println("��� �����������, ������ ����� ����...");
					menu2.printMenu();
					break;
				}

				case "4": {
					System.out.println("������ ����-��� ������, ����-�����: ");
					sc = new Scanner(System.in);
					String string = sc.nextLine();
					if (!string.isEmpty()) {
						String s1 = wordsInStringMaster.findMostOftenWord(string);
						if (s1.equalsIgnoreCase(".")) {
							System.out.println("� ������� ������ ���� ���, �� ������������");
						} else {
							System.out.println("� ������� ������ ��������� ����������� �����: " + s1);
						}

					} else {
						System.out.println("�� ����� ������� ������.  ������ ����� ���� [4] �� ��������� �� ���. ");
					}

					System.out.println("��� �����������, ������ ����� ����...");
					menu2.printMenu();
					break;
				}

				case "menu": {
					mainMenu.printMenu();
					break;
				}

				case "q": {
					System.out.println("����� � ��������. �� ���������!");
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
