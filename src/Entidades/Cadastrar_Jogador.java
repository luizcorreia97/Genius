package Entidades;

import java.util.ArrayList;
import java.util.Scanner;



public class Cadastrar_Jogador{
		
	private String id;
	private String nome;
	private String senha;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	private static Scanner sc;

	
	public static void main(String[] args) {
		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public Cadastrar_Jogador cadastrar;
	public Jogar jogar;
	
	public void Cadastrando_Jogador(Cadastrar_Jogador cad) {
		
		ArrayList<Cadastrar_Jogador> jogador = new ArrayList<Cadastrar_Jogador>();
		
		sc = new Scanner (System.in);
		
		char opcao_cad_jog = 's'; 
		
		do{
			Cadastrar_Jogador cadastrar = new Cadastrar_Jogador();
			
			System.out.println("\n\t**CADASTRO DE JOGADOR**");
			
			cadastrar.setId(id);
			System.out.print("\n\tID: "+cadastrar.getId());
			System.out.print("\n\tNome: ");
			cadastrar.setNome(sc.nextLine());
			System.out.print("\tSenha: ");
			cadastrar.setSenha(sc.nextLine());
			
			System.out.println("\n\t\tCadastrar Outro [S/N]: ");
			opcao_cad_jog = sc.next().charAt(0);
			
			jogador.add(cadastrar);
			
		}while((opcao_cad_jog == 's')||(opcao_cad_jog == 'S'));
		
	}
}