package p679;

import java.io.FileWriter;

public class Main {

	public static void main(String[] args) {
		try (FileWriter fw = new FileWriter("data.txt")) {
			fw.write("hello");
		} catch(Exception e) {
			System.out.println("エラー発生。");
		}
		System.out.println("処理が終わりです");
	}

}
