package fases;


public class Fase3 {

	public static void main(String[] args) {
		
		int year = 1948;
		int yearBirth = 1968;
		boolean leapYear = false;
		
		for(int i=year; i<=yearBirth; i=i+4) {
			System.out.println(i);
			
			if (i == yearBirth) {
				leapYear = true;
				}
			}
		
		System.out.println("");
		
		if(leapYear == true) {
			String leapBirth = "! Bingo!tu año de nacimiento fue bisiesto";
			System.out.println(yearBirth+leapBirth);
			
		}else {
			String noLeapBirth = "No has nacido en un año bisiesto";
			System.out.println(noLeapBirth);
		
		}		
	  }
	}
