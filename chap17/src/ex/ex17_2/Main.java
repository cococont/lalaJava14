package ex.ex17_2;

public class Main {

	public static void main(String[] args) {
		String s = null;
		try {
			System.out.println(s.length());
			
		} catch (NullPointerException e) {
			System.out.println("NullPointerException例外を catch しました");
			System.out.println("--スタックトレース(ここから)--");
			e.printStackTrace();
			System.out.println("--スタックトレース(ここまで)--");
		}
	}

}
