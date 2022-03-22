package Operadora_Aerea;

import java.util.Random;
import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Random aleatorio = new Random();
		
		short opcao=0;
		
		System.out.println("Escolha: ");
		System.out.println("1 : Cadastrar Passageiro");
		System.out.println("2 : Check in");
		System.out.println("3 : Cancelar voo");
		System.out.println("4 : Sair");

				opcao = sc.nextShort();
			
			switch(opcao){
				
			case 1:
				System.out.println("Digite seu nome: ");
        		String nome=sc.next();
        		
        		System.out.println("Digite seu CPF: ");
        		String CPF=sc.next();
        		
        		System.out.println("Digite a data do seu voo: ");
        		String data=sc.next();
        		
        		System.out.println("Digite o horario do seu voo: ");
        		String horario=sc.next();
        		
        		System.out.println("Cadastro realizado com sucesso!");
        		int numeroaleatorio = aleatorio.nextInt(1000);
        		System.out.println("Seu voo possui o numero: "+numeroaleatorio);
        		
        		break;
					
				case 2:        		
        		System.out.println("Digite seu CPF: ");
        		CPF=sc.next();
        		
        		System.out.println("Digite o numero do seu voo: ");
        		int numeroVoo=sc.nextInt();
        		
        		System.out.println("Check in realizado com sucesso!");
        		break;
				case 3:
				System.out.println("Digite seu CPF: ");
        		CPF=sc.next();
        		
        		System.out.println("Digite o numero do seu voo: ");
        		numeroVoo=sc.nextInt();
        		
        		System.out.println("Voo Cancelado com sucesso!");
        		break;
			
				default:
				System.out.println("Opçao Invalida");
				
				break;

					}
			
							}
														}

