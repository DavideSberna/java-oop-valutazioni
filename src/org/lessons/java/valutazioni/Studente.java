package org.lessons.java.valutazioni;

public class Studente {
	public int id;
	public int assenze;
	public double average;
	public int[] limiteAssenze = {25, 50};
	public int minAverage = 2;
	public String result = "";
	
	public Studente(int id, int assenze, double average) {
		this.id = id;
		this.assenze = assenze;
		this.average = average;
		
	}
	
	public String status() {
		
		if(assenze > limiteAssenze[1]) {
			result = "No";
		} else if((assenze >= limiteAssenze[0] && assenze <= limiteAssenze[1]) && average > minAverage) {
			result = "Si";
		} else if(assenze < limiteAssenze[0] && average >= minAverage) {
			result = "Si";
		} else {
			result = "No";
		}
		
		return result;
	}
	
	public void outPut() {
		System.out.println("");
		System.out.println("Id matricola: " + id);
		System.out.println("Assenze tot: " + assenze);
		System.out.println("Media voti: " + average);
		System.out.println("Promosso: " + status());
	}

}
