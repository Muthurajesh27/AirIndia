package frameworkDay1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Datee {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
		String data = dateFormat.format(date);
		System.out.println(data);
	
		
	}

}
