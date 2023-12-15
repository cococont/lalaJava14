package date.p596;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		DateTimeFormatter fmt =
				DateTimeFormatter.ofPattern("yyyy/MM/dd");
		System.out.println(fmt);
		LocalDate ldate =
//				入力形式をfmtで指定して入力
				LocalDate.parse("2020/09/22", fmt);
		System.out.println(ldate);
		
		LocalDate ldatep = ldate.plusDays(1000);
		System.out.println(ldatep);
//		表示形式をfmtに指定してstrを作成
		String str = ldatep.format(fmt);
		System.out.println("1000日後は" + str);
		
		LocalDate now = LocalDate.now();
		System.out.println(now);
		if (now.isAfter(ldatep)) {
			System.out.println("1000日後は過去日付です");
		}
	}

}
