package p686;

import java.io.FileWriter;
import java.io.IOException;

public class FileUtil {
	public static boolean writeAge(int age) {
		try (FileWriter fw = new FileWriter("data.txt")) {
			fw.write("pのage:" + age);
		} catch (IOException e) {
			return false;
		}
		return true;
	}
}
