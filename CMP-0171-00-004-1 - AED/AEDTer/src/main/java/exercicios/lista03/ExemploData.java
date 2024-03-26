package exercicios.lista03;

import java.time.LocalDate;

public class ExemploData {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2024, 02, 20);
		
		System.out.println(date);
		System.out.println(date.plusDays(2));
	}

}
