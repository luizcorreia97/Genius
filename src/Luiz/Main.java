package Luiz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Luiz.Classe;

import javax.swing.JButton;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextField;

public class Main extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public int numero,cont,c=0,errou,pontos=0;
	Classe c1 = new Classe();

	private JPanel contentPane;
	private JTextField txt_mostrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 434, 376);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn_numero0 = new JButton("0");
		btn_numero0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				numero = 0;
				errou = c1.confere(numero,c);
				if(errou != 1){
					c++;
					cont = c1.contador(c);
					if(cont == 0){
						c = 0;
						pontos++;
						txt_mostrar.setText(null);
						txt_mostrar.setText(txt_mostrar.getText()+c1.mostrar()); 
					}
				}
				if(errou == 1){
					JOptionPane.showMessageDialog(null,"Errou, você acertou : "+pontos);
					pontos = 0;
					c1.delete(c);
					txt_mostrar.setText(null);
					c = 0;
				}
			}
		});
		btn_numero0.setBackground(Color.GREEN);
		btn_numero0.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_numero0.setBounds(10, 169, 197, 115);
		contentPane.add(btn_numero0);
		
		JButton btn_numero1 = new JButton("1");
		btn_numero1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero = 1;
				errou = c1.confere(numero,c);
				if(errou == 1){
					JOptionPane.showMessageDialog(null,"Errou, você acertou : "+pontos);
					pontos = 0;
					c1.delete(c);
					txt_mostrar.setText(null);
					c = 0;
				}
				if(errou != 1){
					c++;
					cont = c1.contador(c);
					if(cont == 0){
						c = 0;
						pontos++;
						txt_mostrar.setText(null);
						txt_mostrar.setText(txt_mostrar.getText()+c1.mostrar()); 
					}
				}	
			}
		});
		btn_numero1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_numero1.setBackground(Color.BLUE);
		btn_numero1.setBounds(217, 169, 191, 115);
		contentPane.add(btn_numero1);
		
		JButton btn_numero2 = new JButton("2");
		btn_numero2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero = 2;
				cont = c1.contador(c);
				errou = c1.confere(numero,c);
				if(errou == 1){
					JOptionPane.showMessageDialog(null,"Errou, você acertou : "+pontos);
					pontos = 0;
					c1.delete(c);
					txt_mostrar.setText(null);
					c = 0;
				}
				if(errou != 1){
					c++;
					cont = c1.contador(c);
					if(cont == 0){
						c = 0;
						pontos++;
						txt_mostrar.setText(null);
						txt_mostrar.setText(txt_mostrar.getText()+c1.mostrar()); 
					}
				}
			}
		});
		btn_numero2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_numero2.setBackground(Color.RED);
		btn_numero2.setBounds(10, 11, 197, 113);
		contentPane.add(btn_numero2);
		
		JButton btn_numero3 = new JButton("3");
		btn_numero3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero = 3;
				errou = c1.confere(numero,c);
				if(errou == 1){
					JOptionPane.showMessageDialog(null,"Errou, você acertou : "+pontos);
					pontos = 0;
					c1.delete(c);
					txt_mostrar.setText(null);
					c = 0;
				}
				if(errou != 1){
					c++;
					cont = c1.contador(c);
					if(cont == 0){
						c = 0;
						pontos++;
						txt_mostrar.setText(null);
						txt_mostrar.setText(txt_mostrar.getText()+c1.mostrar()); 
					}
				}
			}
		});
		btn_numero3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_numero3.setBackground(Color.PINK);
		btn_numero3.setBounds(217, 11, 191, 113);
		contentPane.add(btn_numero3);
		
		JButton btn_inicio = new JButton("INICIO");
		btn_inicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt_mostrar.setText(null);
				txt_mostrar.setText(txt_mostrar.getText()+c1.mostrar());
			}
		});
		btn_inicio.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn_inicio.setBounds(132, 295, 180, 31);
		contentPane.add(btn_inicio);
		
		txt_mostrar = new JTextField();
		txt_mostrar.setBounds(132, 135, 180, 23);
		contentPane.add(txt_mostrar);
		txt_mostrar.setColumns(10);
	}
}
