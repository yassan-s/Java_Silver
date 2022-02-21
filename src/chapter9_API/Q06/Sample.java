package chapter9_API.Q06;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Sample {

	public static void main(String[] args) {
		LocalDate a = LocalDate.of(2019, 8, 19);
		LocalDate b = LocalDate.now();
		System.out.println(b);
		b.with(DayOfWeek.MONDAY);
		System.out.println(a.equals(b) + ", " + a.isBefore(b));
		// false, true
	}
}
