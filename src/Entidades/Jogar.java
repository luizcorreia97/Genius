package Entidades;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Jogar{
	
	private int pontos;
	private int errado;
	private int num;
	private int record = 10;
	
	public int getPontos() {
		return pontos;
	}
	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
	public int getErrado() {
		return errado;
	}
	public void setErrado(int errado) {
		this.errado = errado;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getRecord() {
		return record;
	}
	public void setRecord(int record) {
		this.record = record;
	}
	
	private static Scanner sc;

	public void Jogando_Jogo(Jogar jog) {
		
		char opcao_jogo_novo = 's';
		int cont1 = 0, cont2 = 0;
		
		do{
			
			Jogar jogar = new Jogar();
			
			ArrayList<Integer> salva = new ArrayList<Integer>();
			
			sc = new Scanner (System.in);
			
			Random aleatorio = new Random();
			
			System.out.println("\t\t--------");
			System.out.println("\t\t GENIUS");
			System.out.println("\t\t--------");
			
			System.out.println("\t\t\t Pontos: "+jogar.getPontos());
			
			System.out.println("\n\tGrave a Sequência Dos Números");
			System.out.println("\n\t  Que Aparecerá Na Tela");
			System.out.println("\n\t OBS: Pressionando O Número");
			System.out.println("\n\t     E Logo Após Enter!!\n\n");
			
			for(cont1 = 1;cont1<=jogar.getRecord();cont1++){
			
				salva.add(aleatorio.nextInt(4));
				
				System.out.println("\tGrave Essa Sequência De Números:");
				for(cont2 = 1;cont2<=salva.size();cont2++){
					System.out.println("\n\t\t      "+salva.get(cont2));
				}
				int i = 1;
				System.out.println();
				
				for(cont2 = 1;cont2<=salva.size();cont2++){
					System.out.print("\t   Digite o "+i+"º Número: ");
					jogar.setNum(sc.nextInt());
					i++;
					if(jogar.getNum() != salva.get(cont2)){
						System.out.println("\n\tSequência Errada!!");
						jogar.setErrado(1);
						break;
					}	
				}
				if(jogar.getErrado() == 1){
					break;
				}
				else{
					jogar.setPontos(+1);
					System.out.println("\n\t\t\t Pontos: "+jogar.getPontos());
				}
				if(jogar.getPontos() == jogar.getRecord()){
					System.out.println("\n\tParabéns Você Fechou o Jogo!!");
				}
			}
			if(jogar.getErrado() == 1){
				if(jogar.getPontos() == 1){
					System.out.println("\n\tFez "+jogar.getPontos()+" Ponto!");
				}
				
				if(jogar.getPontos() == 0){
					System.out.println("\n\tNão Fez Nenhum Ponto!");
				}
				if(jogar.getPontos() >= 2){
					System.out.println("\n\tFez "+jogar.getPontos()+" Pontos!");
				}
			}
			
			System.out.print("\n\tJogar Novamente [S/N]: ");
			opcao_jogo_novo = sc.next().charAt(0);
			
			
			if((opcao_jogo_novo == 's')||(opcao_jogo_novo == 's')){
				jogar.setPontos(0);
				jogar.setErrado(0);
			}
			System.out.println();
			
		}while((opcao_jogo_novo == 's')||(opcao_jogo_novo == 's'));
		
		System.out.print("\n\t\t\t\t\tSaindo...");	
	}
}