package CurrencyExchange;

import java.util.Scanner;

public class Currency {

	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Choisissez Un Option :");
	System.out.println("(1) EUR to DZD");
	System.out.println("(2) DZD tO EUR");
	int exchange=scanner.nextInt();
	switch(exchange)
	{
	
	case 1: {
		
		System.out.println("Entrer le nombre de EUR");
		double eur=scanner.nextDouble();
		
		if(eur>=0) {
		System.out.println(eur+" € est : "+eur*222+" DZD");
		}
		else {
		System.out.println("SVP Entrer une valeur positive");
		}
	}
	break;
	
	case 2:{
		System.out.println("Entrer le nombre de DZD");
		double dzd=scanner.nextDouble();
		
		if(dzd>=0) {
		System.out.println(dzd+" DZD est : "+dzd/222+" €");
		}
		else {
		System.out.println("SVP Entrer une valeur positive");
		}
	}
	
	break;
	
	}	
	
	scanner.close();
	
	}

}
