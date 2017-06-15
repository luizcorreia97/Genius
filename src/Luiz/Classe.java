package Luiz;


import java.util.ArrayList;
import java.util.Random;

public class Classe {

	Random gerador = new Random();
	
	ArrayList <Integer> Jogada = new ArrayList<Integer>();
	public int jogador=0,errou=0,pontos=0,aux=0,cont =0;
	
	public ArrayList<Integer> mostrar(){
	
		Jogada.add(gerador.nextInt(4));	
			
		return Jogada;
	}
	public int contador(int c){
		int continua;
		if(c < Jogada.size()){
			continua = 1;
		}else{
			 continua = 0;
		}
		
		return continua;
	}
	public int confere(int numero,int cont){
				
			if(numero != Jogada.get(cont)){
				errou = 1;	
				
			}
			return errou;
	}
	public void delete(int cont){
		Jogada.clear();
	}
	
}