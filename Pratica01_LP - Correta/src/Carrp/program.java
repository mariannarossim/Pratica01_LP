package Carrp;

import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		
		String placa;
		short ano;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Entre com a placa do carro: ");
		placa=sc.nextLine();
		System.out.println("Entre com o ano de fabricação do carro: ");
		ano=sc.nextShort();
		
		if(ano<=2010) 
			System.out.println("CARRO VELHO");
		else if(ano<=2021)
			System.out.println("CARRO SEMI NOVO");
			
		else if(ano==2022)
			System.out.println("CARRO NOVO");
			
		else
			System.out.println("ANO INVALIDO");
		
		String novaPlaca=placa
						.replace("A","*")
						.replace("a","*")
						.replace("E","*")
						.replace("e","*")
						.replace("I","*")
						.replace("i","*")
						.replace("O","*")
						.replace("o","*")
						.replace("U","*")
						.replace("u","*");
		
		System.out.println("A nova placa é: "+novaPlaca);

	}

}
