package case1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num = inputNum();
		System.out.println("num:" + num);
	}
	
	public static int inputNum() {
		int num = 0;
		boolean repeat = false;
		do {
			repeat = false;
			System.out.println("数字を入力 >");
			try {
				num = new Scanner(System.in).nextInt();
			} catch (InputMismatchException e) {
//				throw new IllegalStateException("エラー");
				throw new IllegalArgumentException("エラー");
//				System.out.println("数字を入力してください");
//				repeat = true;
			}
		} while(repeat);
		return num;
	}

}
