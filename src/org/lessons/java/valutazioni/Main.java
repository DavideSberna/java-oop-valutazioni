package org.lessons.java.valutazioni;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int count = 0;
		int numberStudents = 20;
		Studente[] students = new Studente[numberStudents];
		Random rand = new Random();
		
		
		
		for(int i = 0; i < numberStudents; i++) {
			
			int assenze = rand.nextInt(100) + 1;
			int average = rand.nextInt(5) + 1;
			
			students[i] = new Studente(i + 1, assenze, average);
			students[i].outPut();
			
			if(students[i].status() == "Si") {
				count++;
			}
		
		}
		
		System.out.println("");
		System.out.println("Studenti promossi: " + count);
		
		
		

	}

}
