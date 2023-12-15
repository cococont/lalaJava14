package date.ex15_4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		
		LocalDate now = LocalDate.now();
		DateTimeFormatter fmt =
				DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
		System.out.println(fmt);

		LocalDate ldatep = now.plusDays(100);
		System.out.println(ldatep);
//		表示形式をfmtに指定してstrを作成
		String str = ldatep.format(fmt);
		System.out.println(str);
	}

}
