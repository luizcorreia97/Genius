package Testes_02_10_2015;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Jogo_Random{	
	
		private static Scanner sc;
		
		private static ArrayList<Integer> salva;
		
		public static void main(String[] args) {

		Random aleatorio = new Random();	
			
		sc = new Scanner(System.in);
		
		int num = 0, aux = 0, pontos = 0;
		
		salva = new ArrayList<Integer>();
		
		
		do{
			
			System.out.print("Digite ");
			
			if(aux!=0){
				for (int i = 0; i < pontos; i++) {
					System.out.print(salva.get(i));
				}
			}
			
			System.out.print(aux+": ");
			num = sc.nextInt();
			salva.add(aux);
			
			if(num == aux){
				aux = aleatorio.nextInt(4);
				pontos++;
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
		System.out.println("\nNúmeros Digitados Corretamente: \n");
		for (int i = 0; i < pontos; i++) {
			System.out.print(salva.get(i));
		}
	}
}