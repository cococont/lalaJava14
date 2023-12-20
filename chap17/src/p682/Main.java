package p682;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		sub();
	}
	
	public static void sub() {
		try {
			subsub();
		} catch (IOException e) {
			System.out.println("書き込めません");
		} catch (NullPointerException e) {
			System.out.println("null");
		}
	}
	
	public static void subsub() throws IOException, NullPointerException {
		FileWriter fw = new FileWriter("data.txt");
		String str = "www";
		fw.write(str);
		fw.close();
		System.out.println("処理終了");
	}

}
