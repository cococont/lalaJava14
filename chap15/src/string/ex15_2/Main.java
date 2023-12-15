package string.ex15_2;

public class Main {

	public static void main(String[] args) {
		String folder = "C:\\Users\\user\\Desktop\\課題\\ochi_js";
		String file = "gallery.html";
		StringBuilder sb = new StringBuilder();
		if (folder.matches(".*\\$")) {
			sb.append(folder).append(file);
		} else {
			sb.append(folder).append("\\").append(file);
		}
		System.out.println(sb);
		
	}

}
