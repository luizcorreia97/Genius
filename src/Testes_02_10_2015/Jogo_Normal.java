package Testes_02_10_2015;
import java.util.Scanner;

public class Jogo_Normal{	
		
		private static Scanner sc;

		public static void main(String[] args) {
			
			sc = new Scanner(System.in);
					
			int num = 0, aux = 56, pontos = 0, controle = 0, sobe = 97, desce = 9;
						
			do{
				System.out.print("Digite o número "+aux+": "); 
				num = sc.nextInt();
				if(num == aux){
					if(controle%2==0){
						aux = sobe;
						sobe = desce + 24;
					}
					else{
						aux = desce;
						desce = sobe - 13;
					}
					pontos++;
					controle++;
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
				num = aux;
			}while(aux == num);
		}
}