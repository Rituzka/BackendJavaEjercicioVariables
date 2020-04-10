package fases;

public class Fase2 {
	
	
	public static void main(String[] args) {
		
		final int year = 1948;
		int leapYear = 4;
		int yearBirth = 1968;
		
		double leapYears = (yearBirth-year)/leapYear;
		
		System.out.print("La cantidad de años bisiestos en el lapso de 1948 a 1968 es de ");
		System.out.printf("%1.0f", leapYears);

	}
}
