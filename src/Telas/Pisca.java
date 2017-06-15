package Telas;

import java.awt.Color;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import Entidades.Pisca_Botoes;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Pisca extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private ArrayList<Pisca_Botoes> lista = new ArrayList<Pisca_Botoes>();
	private Timer time1,time2,time3,time4;
	JButton btnVermelho,btnVerde,btnAmarelo,btnAzul,btnIniciar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pisca frame = new Pisca();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Pisca() {
		
		Pisca_Botoes n1 = new Pisca_Botoes();
		n1.setNumero(1);
		n1.setAtivo(0);
		lista.add(n1);
		Pisca_Botoes n2 = new Pisca_Botoes();
		n2.setNumero(2);
		n2.setAtivo(0);
		lista.add(n2);
		Pisca_Botoes n3 = new Pisca_Botoes();
		n3.setNumero(3);
		n3.setAtivo(0);
		lista.add(n3);
		Pisca_Botoes n4 = new Pisca_Botoes();
		n4.setNumero(4);
		n4.setAtivo(0);
		lista.add(n4);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		btnAzul = new JButton("Azul");
		btnAzul.setBackground(Color.WHITE);
		btnAzul.setBounds(52, 80, 89, 91);
		contentPane.add(btnAzul);

		btnAmarelo = new JButton("Amarelo");
		btnAmarelo.setBackground(Color.WHITE);
		btnAmarelo.setBounds(151, 11, 89, 91);
		contentPane.add(btnAmarelo);

		btnVerde = new JButton("Verde");
		btnVerde.setBackground(Color.WHITE);
		btnVerde.setBounds(151, 147, 89, 91);
		contentPane.add(btnVerde);

		btnVermelho = new JButton("Vermelho");
		btnVermelho.setBackground(Color.WHITE);
		btnVermelho.setBounds(250, 80, 89, 91);
		contentPane.add(btnVermelho);

		btnIniciar = new JButton("Iniciar");
		btnIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				atualizar();
				if (lista.get(0).getNumero() == 1) {
					btnAmarelo.setBackground(Color.YELLOW);
					lista.get(0).setAtivo(1);
					time1 = new Timer(500 ,new PiscaVermelho());
					time1.start();

				}else if (lista.get(0).getNumero() == 2) {
					btnAzul.setBackground(Color.BLUE);
					lista.get(0).setAtivo(1);
					time2 = new Timer(500 ,new PiscaVermelho());
					time2.start();
				}else if (lista.get(0).getNumero() == 3) {
					btnVermelho.setBackground(Color.RED);
					lista.get(0).setAtivo(1);
					time3 = new Timer(500 ,new PiscaVermelho());
					time3.start();
				} else if (lista.get(0).getNumero() == 4) {
					btnVerde.setBackground(Color.GREEN);
					lista.get(0).setAtivo(1);
					time4 = new Timer(500 ,new PiscaVerde());
					time3.start();
				}
			}
		});
		btnIniciar.setBounds(335, 215, 89, 23);
		contentPane.add(btnIniciar);
		setResizable(false);
	}
	private void atualizar(){
		for(Pisca_Botoes atualizar : lista){
			atualizar.setAtivo(0);
		}
	}
	private void piscar(){
		for(int x=0; x<lista.size();x++){
			if (lista.get(x).getAtivo() == 0) {
				if (lista.get(x).getNumero() == 1) {
					btnAmarelo.setBackground(Color.YELLOW);
					lista.get(x).setAtivo(1);
					time1 = new Timer(500 ,new PiscaAmarelo());
					time1.start();
					
				}else if (lista.get(x).getNumero() == 2) {
					btnAzul.setBackground(Color.BLUE);
					lista.get(x).setAtivo(1);
					time2 = new Timer(500 ,new PiscaAzul());
					time2.start();
				}else if (lista.get(x).getNumero() == 3) {
					btnVermelho.setBackground(Color.RED);
					lista.get(x).setAtivo(1);
					time3 = new Timer(500 ,new PiscaVermelho());
					time3.start();
					
				}else if (lista.get(x).getNumero() == 4) {
					btnVerde.setBackground(Color.GREEN);
					lista.get(x).setAtivo(1);
					time4 = new Timer(500 ,new PiscaVerde());
					time4.start();
				}
				break;
			}

		}
		
	}
	class PiscaVerde implements ActionListener{
		public void actionPerformed(ActionEvent e){
			btnVerde.setBackground(Color.WHITE);
			time4.stop();
			piscar();
		}
	}
	class PiscaVermelho implements ActionListener{
		public void actionPerformed(ActionEvent e){
			btnVermelho.setBackground(Color.WHITE);
			time3.stop();
			piscar();
		}
	}
	class PiscaAzul implements ActionListener{
		public void actionPerformed(ActionEvent e){
			btnAzul.setBackground(Color.WHITE);
			time2.stop();
			piscar();
		}
	}
	class PiscaAmarelo implements ActionListener{
		public void actionPerformed(ActionEvent e){
			btnAmarelo.setBackground(Color.WHITE);
			time1.stop();
			piscar();
		}
	}
}