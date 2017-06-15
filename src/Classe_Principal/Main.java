package Classe_Principal;

import java.util.Scanner;

import Entidades.Cadastrar_Jogador;
import Entidades.Jogar;

public class Main{
	
	private static Scanner sc;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		
		char menu = 's';
		int opcao_menu;
		
		do{
			Cadastrar_Jogador cadastrar = new Cadastrar_Jogador();
			Jogar jogar = new Jogar();
			
			System.out.println("\n\t**DESEJA**");
			System.out.println("\n\t(1) Cadastrar");
			System.out.println("\t(2) Jogar");
			System.out.print("\t(3) Ver Ranking\t\tOpção: ");
			opcao_menu = sc.nextInt();
			System.out.println();
			
			if(opcao_menu == 1){
				cadastrar.Cadastrando_Jogador(cadastrar);
			}
			if(opcao_menu == 2){
				jogar.Jogando_Jogo(jogar);
			}
			if(opcao_menu == 3){
				
			}
		}while((menu!='s')||(menu!='S'));
		System.out.println("\n\t\t\t\t\tSaindo...");
	}
}