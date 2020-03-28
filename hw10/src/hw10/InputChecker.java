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

public class InputChecker {
/**  This class checks inputed string in 1st task  - Palindrom  */
	private String string;
	boolean flag;

	public InputChecker() {
		super();
	}

	public InputChecker(String string) {
		super();

		if (string.length() == 5) {

			String reverse = new StringBuffer(string).reverse().toString();
			if (string.equalsIgnoreCase(reverse)) {
				System.out.println("������� ����� " + string + " �  ����������!!! ³����!");
			} else {
				System.out.println("������� ����� " + string + " �� �  ����������");

			}

			flag = true;
		} else {

			try {
				throw new WrongInputException(
						"�� ����� ����� �� � 5 ����, ������ ����� ���� [1] �� ��������� �� ���: ");
			} catch (WrongInputException e) {
				System.out.println(e.getMessage());

				flag = false;
			}

		}

		this.string = string;

	}

	public String getString() {
		return string;
	}

	public void setString(String string) {

		this.string = string;

	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
