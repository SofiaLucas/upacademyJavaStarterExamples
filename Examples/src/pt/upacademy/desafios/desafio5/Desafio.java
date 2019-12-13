package pt.upacademy.desafios.desafio5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Desafio {

	public static long countDays(String string, String string2) {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy");
		LocalDate dateInit = LocalDate.parse(string, formatter);
		LocalDate dateFin = LocalDate.parse(string2, formatter);

		long noDays;

		noDays = dateInit.until(dateFin, ChronoUnit.DAYS);

		return noDays;
	}

}
