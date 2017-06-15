package Testes_02_10_2015;
import java.util.ArrayList;
import java.util.Scanner;

public class Jogo_String_Cores{	
		
		private static Scanner sc;

		public static void main(String[] args) {
			
			ArrayList<String> salva = new ArrayList<String>();
			
			setSc(new Scanner(System.in));

			String cor, aux = "verde";
			int controle1 = 0, controle2 = 0, pontos = 0;
						
			do{
				System.out.print("Digite a cor "+aux+": ");
				cor = sc.nextLine();
				salva.add(cor);
				if(cor.equals(aux)){
					
					if(controle1%2==0){
						if(controle2 == 0){
							cor = "azul";
						}
						if(controle2 == 1){
							cor = "vermelho";
						}
						if(controle2 == 2){
							cor = "amarelo";
						}
						if(controle2 == 3){
							cor = "verde";
						}
						if(controle2 > 3){
							controle2 = 0;
							
						}
						pontos++;
						controle1++;
						controle2++;
					}
					else{
						if(controle2 == 0){
							cor = "amarelo";
						}
						if(controle2 == 1){
							cor = "verde";
						}
						if(controle2 == 2){
							cor = "azul";
						}
						if(controle2 == 3){
							cor = "vermelho";
						}
						if(controle2 > 3){
							controle1 = 0;
						}
						pontos++;
						controle1++;
						controle2++;
					}
					aux = cor;
				}
				else{
					System.out.println("\nVocê Errou!!");
					if(pontos == 1){
						System.out.println("Fez "+pontos+" Ponto!");
						break;
					}
					if(pontos == 0){
						System.out.println("Não Fez Nenhum Ponto!");
						break;
					}
					else{
					System.out.println("Fez "+pontos+" Pontos!");
					break;
					}
				}
			}while(aux == cor);
			
			if(pontos>0){
				System.out.println("\nCores Digitadas Corretamente: \n");
				for (int i = 0; i < pontos; i++) {
					System.out.println(i+1+"º "+salva.get(i));
				}
			}			
		}
		public static Scanner getSc() {
			return sc;
		}

		public static void setSc(Scanner sc) {
			Jogo_String_Cores.sc = sc;
		}
}