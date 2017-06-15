package Código;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Console{

	private static Scanner sc;

	public Console(){
sc = new Scanner(System.in);
		
		int cont1 = 0;
		int cont2 = 0;
		int pontos = 0;
		int errado = 0;
		int num = 0;
		int record = 10;
		char jogar;
		
		do{
			
			ArrayList<Integer> salva = new ArrayList<Integer>();
			
			Random aleatorio = new Random();
			
			System.out.println("\t\t--------");
			System.out.println("\t\t GENIUS");
			System.out.println("\t\t--------");
			
			System.out.println("\t\t\t Pontos: "+pontos);
			
			System.out.println("\n\tGrave a Sequência Dos Números");
			System.out.println("\n\t  Que Aparecerá Na Tela");
			System.out.println("\n\t OBS: Pressionando O Número");
			System.out.println("\n\t     E Logo Após Enter!!\n\n");
			for(cont1 = 1;cont1<=record;cont1++){	
			
				salva.add(aleatorio.nextInt(4));
				
				System.out.println("\tGrave Essa Sequência De Números:");
				for(cont2 = 0;cont2<salva.size();cont2++){
					System.out.println("\n\t\t      "+salva.get(cont2));
				}
				int i = 1;
				System.out.println();
				for(cont2 = 0 ;cont2<salva.size();cont2++){
					System.out.print("\t   Digite o "+i+"º Número: ");
					num = sc.nextInt();
					i++;
					if(num != salva.get(cont2)){
						System.out.println("\n\tSequência Errada!!");
						errado = 1;
						break;
					}	
				}
				if(errado == 1){
					break;
				}
				else{
					pontos = pontos+10;
					System.out.println("\n\t\t\t Pontos: "+pontos);
				}
				if(pontos == record){
					System.out.println("\n\tParabéns Você Fechou o Jogo!!");
				}
			}
			if(errado == 1){
				if(pontos == 1){
					System.out.println("\n\tFez "+pontos+" Ponto!");
				}
				
				if(pontos == 0){
					System.out.println("\n\tNão Fez Nenhum Ponto!");
				}
				if(pontos >= 2){
					System.out.println("\n\tFez "+pontos+" Pontos!");
				}
			}
			
			System.out.print("\n\tJogar Novamente [S/N]: ");
			jogar = (sc.next().charAt(0));
			if((jogar == 's')||(jogar == 's')){
				pontos = 0;
				errado = 0;
			}
			System.out.println();
			
		}while((jogar == 's')||(jogar == 's'));
		
		System.out.print("\n\t\t\t\t\tSaindo...");
		
	}
	public static void main(String[] args) {
		
		new Run_Game();
	}
}