package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.print("Enter student name: ");
		student.name = sc.nextLine();
		System.out.print("Enter the first quarter grade: ");
		student.grade1 = sc.nextDouble();
		System.out.print("Enter the second quarter grade: ");
		student.grade2 = sc.nextDouble();
		System.out.print("Enter the third quarter grade: ");
		student.grade3 = sc.nextDouble();
		
		double finalGrade = student.finalGrade();
		
		if (finalGrade < 60) {
			System.out.printf("FINAL GRADE = %.2f%n", finalGrade);
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", student.passOrFailed());
		} else {
			System.out.printf("FINAL GRADE = %.2f%n", finalGrade);
			System.out.println("PASS");
		}
		
		
		sc.close();

	}

}
