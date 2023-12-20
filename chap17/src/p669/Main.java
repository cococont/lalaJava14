package p669;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("data.txt");
			fw.write("hello");
		} catch(IOException e) {
			System.out.println("エラー発生。書き込めません");
		} finally {
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					;
				}
			}
		}
		System.out.println("処理が終わりです");
	}

}
