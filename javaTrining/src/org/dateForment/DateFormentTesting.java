package org.dateForment;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormentTesting {



		public static void main(String[] args) {
			Date date= new Date();
			System.out.println(date);
			SimpleDateFormat dateFormat= new SimpleDateFormat("dd/MM/yyyy");
			String format = dateFormat.format(date);
			System.out.println(format);

	}

}
