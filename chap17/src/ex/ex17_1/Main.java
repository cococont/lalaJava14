package ex.ex17_1;

public class Main {

	public static void main(String[] args) {
		String s = null;
		try {
			s.length();
			
		} catch (NullPointerException e) {
			System.out.println("nullです");
		}
		
	}

}
