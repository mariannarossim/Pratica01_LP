package Frase;

import java.util.Scanner;

public class program {

	public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Escreva uma frase: ");
			String frase = sc.nextLine();
			
			int vogais =0;
			
			for(int i = 0; i<frase.length();i++) {
				char c = frase.charAt(i);
				frase.toLowerCase();
				if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
					vogais ++;
				}
			}
			
			System.out.println("No seu texto há: "+ vogais + " vogais");

	}

}
