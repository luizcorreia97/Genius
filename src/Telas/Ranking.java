package Telas;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class Ranking extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTable table;
	DefaultTableModel modelo;
	private ArrayList<String> lista_nome = new ArrayList<String>();
	private ArrayList<Integer> lista_pontos = new ArrayList<Integer>();
	public Ranking() {
		getContentPane().setLayout(null);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 60, 322, 320);
		getContentPane().add(scrollPane);
		setLocation(450 , 100);
		setTitle("RANKING");
		table = new JTable();

		modelo = new DefaultTableModel(null, 
				new Object[] {"NOME","PONTOS","DIFICULDADE"});
		table.setModel(modelo);
		scrollPane.setViewportView(table);
		JLabel lblRanking = new JLabel("RANKING");
		lblRanking.setFont(new Font("Andalus", Font.PLAIN, 30));
		lblRanking.setBounds(54, 11, 163, 38);
		getContentPane().add(lblRanking);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setFont(new Font("Andalus", Font.PLAIN, 17));
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				
			}
		});
		btnVoltar.setBounds(227, 24, 89, 23);
		getContentPane().add(btnVoltar);
		setSize(348 ,417);
		setVisible(true);
		setResizable(false);
		
	}
	public void recebe(String nome , int pontuacao){
		for (int i = 0; i < lista_nome.size(); i++) {
			lista_nome.add(i, nome);
			lista_pontos.add(i, pontuacao);
			modelo.addRow(new Object[] {nome, pontuacao});
		}
		
		
	}
	public ArrayList<String> getLista_nome() {
		return lista_nome;
	}
	public void setLista_nome(ArrayList<String> lista_nome) {
		this.lista_nome = lista_nome;
	}
	public ArrayList<Integer> getLista_pontos() {
		return lista_pontos;
	}
	public void setLista_pontos(ArrayList<Integer> lista_pontos) {
		this.lista_pontos = lista_pontos;
	}
	public void carregarR() {

		// limpar a tabela
		while (modelo.getRowCount() > 0) {
			modelo.removeRow(0);
		}
		
		modelo.addRow(new Object[] { "nome" , "pontos"});	

	}
	public static void main(String[] args) {
		new Ranking();
	}
	public JTable getTable() {
		return table;
	}
	public void setTable(JTable table) {
		this.table = table;
	}
	public DefaultTableModel getModelo() {
		return modelo;
	}
	public void setModelo(DefaultTableModel modelo) {
		this.modelo = modelo;
	}
}