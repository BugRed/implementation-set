package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Set<Integer> a = new HashSet<>();
		Set<Integer> b = new HashSet<>();
		Set<Integer> c = new HashSet<>();
		
		System.out.println("How many students for course A?");
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			Integer number = sc.nextInt();
			a.add(number);
		}
		System.out.println("How many students for course B?");
		n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			Integer number = sc.nextInt();
			b.add(number);
		}
		System.out.println("How many students for course C?");
		n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			Integer number = sc.nextInt();
			c.add(number);
		}
		
		Set<Integer> totalStudents = new HashSet<>(a);
		totalStudents.addAll(b);
		totalStudents.addAll(c);

		System.out.println("Total Students: " + totalStudents.size());
		
		sc.close();


	}
}
