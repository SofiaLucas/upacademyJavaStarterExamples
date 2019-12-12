package pt.upacademy.desafios.desafio5;


import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;

public class Desafio {

	public static int countDays(String string, String string2) {
		
		
		//SimpleDateFormat formatter = new SimpleDateFormat("dd MM yyyy");
		LocalDate dateInit = LocalDate.parse(string);
		LocalDate dateFin = LocalDate.parse(string2);
		//System.out.println(dateInit);
		//SimpleDateFormat.parse(string);
		
		int noDays;
		noDays= Period.until(dateInit, dateFin);
		return 0;
	}

}
