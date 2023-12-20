package p686;

import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Person p = new Person();
		boolean repeat = true;
		while (repeat) {
			try {
				System.out.println("年齢を入力 >");
				int age = new Scanner(System.in).nextInt();
				p.setAge(age);
				repeat = false;
			} catch (InputMismatchException e) {
				System.out.println("数字を入力してください");
			} catch (IllegalArgumentException e) {
				System.out.println("マイナスはダメ");
			}
		}
//		FileUtil.writeAgeをstuticにすると可能
//		if (FileUtil.writeAge(p.age)) {
//			System.out.println("年齢をdata.txtに書き込みました");
//		} else {
//			System.out.println("年齢の書き込みに失敗しました");
//		}
//		instance化しているため、stuticである必要はない
		FileUtil util = new FileUtil();
		if (util.writeAge(p.age)) {
			System.out.println("年齢をdata.txtに書き込みました");
		} else {
			System.out.println("年齢の書き込みに失敗しました");
		}
//		System.out.println(("pのage:" + p.age));
	}
	
	public static boolean writeAge(int age) {
		try (FileWriter fw = new FileWriter("data.txt")) {
			fw.write("pのage:" + age);
		} catch (IOException e) {
			return false;
		}
		return true;
	}

}
