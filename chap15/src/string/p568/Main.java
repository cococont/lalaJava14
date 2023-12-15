package string.p568;

public class Main {

	public static void main(String[] args) {
		String name = "MINATO01";
		if (isValidPlayerName(name)) {
			System.out.println("正しい");
		} else {
			System.out.println("間違い");
		}
	}
	
	public static boolean isValidPlayerName(String name) {
		return name.matches("[A-Z][A-Z0-9]{7}");
	}

}
