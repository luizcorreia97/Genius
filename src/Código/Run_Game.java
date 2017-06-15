package Código;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

public class Run_Game{
			
		public int cont = 0;
		public int pontos = 0;
		public int continua = 0;
		
		public boolean valida_fim;
		
		private String nome_usuario;
		private int pontos_usuario;
		
		public String getNome_usuario() {
			return nome_usuario;
		}
		public void setNome_usuario(String nome_usuario) {
			this.nome_usuario = nome_usuario;
		}
		public int getPontos_usuario() {
			return pontos_usuario;
		}
		public void setPontos_usuario(int pontos_usuario) {
			this.pontos_usuario = pontos_usuario;
		}
		Random gerador = new Random();
		
		public ArrayList<Integer> Jogada = new ArrayList<Integer>();
		public ArrayList<Integer> Jogador = new ArrayList<Integer>();
		
		public ArrayList<Integer> getJogador() {
			return Jogador;
		}
		public void setJogador(ArrayList<Integer> jogador) {
			Jogador = jogador;
		}
		public ArrayList<Integer> mostra(){			
			Jogada.add(gerador.nextInt(4));	
			
			return Jogada;
		}
		public ArrayList<Integer> getJogada() {
			return Jogada;
		}
		public void setJogada(ArrayList<Integer> jogada) {
			Jogada = jogada;
		}
		public void verifica(){
			if(Jogador.get(cont)!=Jogada.get(cont)){
				JOptionPane.showMessageDialog(null, "Você Errou, Acertou "+pontos+" Pontos!");
				valida_fim = true;
				continua = 2;				
			}
			cont++;
			if(Jogador.equals(Jogada)&&(cont == Jogada.size())){
				cont=0;
				continua = 1;
				pontos++;
			}
		}	
}