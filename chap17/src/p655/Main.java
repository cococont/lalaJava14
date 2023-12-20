package p655;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("data.txt");
			fw.write("hello");
			fw.close();
		} catch(IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println("エラー発生。書き込めません");
		}
		System.out.println("処理が終わりです");
	}

}
