package Viagem;

import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		float tempo, velMedia, kmLitro,	distancia,consumoFinal;
		
		System.out.printf("Entre com o tempo de viagem: ");
		tempo=sc.nextFloat();
		
		System.out.printf("Entre com a velocidade média: ");
		velMedia=sc.nextFloat();
		
		System.out.printf("Entre com o consumo do carro: ");
		kmLitro=sc.nextFloat();
		
		distancia=velMedia*tempo;
		consumoFinal=distancia/kmLitro;
		
				System.out.printf("O consumo final foi: "+ consumoFinal);
	}

}
