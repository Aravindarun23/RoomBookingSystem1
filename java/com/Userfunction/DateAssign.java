package com.Userfunction;
import java.util.*;

public class DateAssign {
	public static int splitDate(String date) {
		String[] v=date.split("-");
		int year=Integer.parseInt(v[0]);
		int month=Integer.parseInt(v[1]);
		int dat=Integer.parseInt(v[2]);
		Calendar setdate = Calendar.getInstance();
		setdate.set(year,month,dat);
		int dayOfYear = setdate.get(Calendar.DAY_OF_YEAR);
		return dayOfYear;
	}

}
