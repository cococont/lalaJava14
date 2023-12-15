package date.ex15_4_b;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Date now = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(now);
		int d = c.get(Calendar.DAY_OF_MONTH);
		c.set(Calendar.DAY_OF_MONTH, d + 100);
		Date day = c.getTime();
		SimpleDateFormat f =
				new SimpleDateFormat("西暦yyyy年MM月dd日");
		String str = f.format(day);
		System.out.println(str);
	}

}
