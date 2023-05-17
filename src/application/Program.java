package application;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

import entities.LogAcess;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Set<LogAcess> set = new HashSet<>();

		
		
		System.out.println("How many students for course A?");
		int numberA = sc.nextInt();
		for (int i = 1; i <= numberA; i++) {
			LogAcess LogA = new LogAcess(sc.nextInt());
			set.add(LogA);
		}
		
		System.out.println("How many students for course B?");
		int numberB = sc.nextInt();
		for (int i = 1; i <= numberB; i++) {
			LogAcess LogA = new LogAcess(sc.nextInt());
			set.add(LogA);
		}
		
		
		System.out.println("How many students for course C?");
		int numberC = sc.nextInt();
		for (int i = 1; i <= numberC; i++) {
			LogAcess LogA = new LogAcess(sc.nextInt());
			set.add(LogA);
		}
		for (LogAcess la : set) {
			System.out.println(la);

		}
		System.out.println("Total Students: " + set.size());

	}

}
