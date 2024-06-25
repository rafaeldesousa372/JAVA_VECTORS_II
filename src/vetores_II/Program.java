package vetores_II;

import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserir número de produtos:" + "\n");
		
		int n = sc.nextInt();
		Product[] vect = new Product[n];

		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			System.out.println("Inserir descrição e valor:" + "\n");
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
		}

		double sum = 0;

		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getPrice();
		}
		
		double avg = sum / vect.length;
		
		System.out.printf("\n" + "AVARAGE PRICE OF PRODUCTS IS = %.2f%n", avg);
		System.out.print(vect.length);
		sc.close();

	}

}
