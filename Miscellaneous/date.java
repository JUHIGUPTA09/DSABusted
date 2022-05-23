package com.dsabusted.Miscellaneous;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class date {
	public static void main(String[] args) throws ParseException {
		// create object of SimpleDateFormat
		SimpleDateFormat s = new SimpleDateFormat("MM/dd/yyyy");
		// create object of Date and initialize values
		Date s1 = s.parse("03/04/2021");
		Date e1 = s.parse("05/05/2021");
		Date s2 = s.parse("04/04/2021");
		Date e2 = s.parse("07/06/2021");
		System.out.println(s1);
		System.out.print("Start date " + s.format(s1));
		System.out.println("  End date " + s.format(e1));

		System.out.print("Start date " + s.format(s2));
		System.out.println("  End date " + s.format(e2));
		DateCompare(s1, e1, s2, e2);

	}

	public static void DateCompare(Date s1, Date e1, Date s2, Date e2) {
		if (s1.before(s2) && e1.after(s2) || s1.before(e2) && e1.after(e2) || s1.before(s2) && e1.after(e2)
				|| s1.after(s2) && e1.before(e2)) {
			System.out.print("They overlap");
		}

		else {
			System.out.print("They don't overlap");
		}

	}
}