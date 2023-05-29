package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		List<Pessoa> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			System.out.println("Tax payer #"+(i+1)+" data:");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Anual income: ");
			double income = sc.nextDouble();
			
			if(ch == 'i') {
				System.out.println("Health expenditures: ");
				double health = sc.nextDouble();
				Pessoa p = new PessoaFisica(name, income,health);
				list.add(p);
			}
			else {
				System.out.println("Number of employees: ");
				int employees = sc.nextInt();
				Pessoa p = new PessoaJuridica(name, income, employees);
				list.add(p);
			}
		}
		
		double sum = 0.0;
		System.out.println();
		System.out.println("TAXA PAID:");
		for(Pessoa p : list) {
			System.out.println(p);
			sum += p.taxa();			
		}
		
		System.out.println();
		System.out.println("TOTAL TAXES: $ "+String.format("%.2f", sum));
		
		sc.close();
	}
} 