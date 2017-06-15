package Testes_02_10_2015;
import java.util.Scanner;

public class Jogo_Funcao_Aleatoria{	
		
		private static Scanner sc;
		private int n1=0;
		private int n2=0;
		public Jogo_Funcao_Aleatoria(){
			
			if(n1%2==0){
				if(n1<=10){
					n2 = n2 * n2;
				}
				else{
					n2 = n2 + n2;
				}
				
			}
			else{
				if(n1>=10){
					n2 = n2 / n2;
				}
				else{
					n2 = n2 - n2;
				}
			}
			
					
			
		}
	
		public static void main(String[] args) {
			Jogo_Funcao_Aleatoria f = new Jogo_Funcao_Aleatoria();
			sc = new Scanner(System.in);
					
			int num = 0, aux = 56, pontos = 0, controle = 0, sobe = 97, desce = 9;
						
			do{
				System.out.print("Digite o número "+aux+": "); 
				num = sc.nextInt();
				if(num == aux){
					if(controle%2==0){
						aux = sobe;
						sobe = sobe + f.n2;
					}
					else{
						aux = desce;
						desce = desce - f.n2;
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