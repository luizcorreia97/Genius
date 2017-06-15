package Telas;

import javax.swing.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.util.ArrayList;

public class Valida_Login extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txt_jogador;
	private JPasswordField passwordField;
	ArrayList<String> jogador = new ArrayList<String>();
	private JTextField txt_senha;
	public Valida_Login() {
		
		setTitle("Login");
		getContentPane().setLayout(null);
		setLocation(450 , 100);
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setFont(new Font("Andalus", Font.PLAIN, 30));
		lblLogin.setBounds(85, 26, 78, 33);
		getContentPane().add(lblLogin);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Andalus", Font.PLAIN, 17));
		lblNome.setBounds(24, 84, 49, 19);
		getContentPane().add(lblNome);
		
		txt_jogador = new JTextField();
		txt_jogador.setFont(new Font("Andalus", Font.PLAIN, 17));
		txt_jogador.setBounds(72, 85, 172, 20);
		getContentPane().add(txt_jogador);
		txt_jogador.setColumns(10);
		
		JButton btnJogar = new JButton("Jogar");
		btnJogar.setFont(new Font("Andalus", Font.PLAIN, 17));
		btnJogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				jogador.add(txt_jogador.getText());
				
				new Jogo();
				dispose();
			}
		});
		btnJogar.setBounds(40, 165, 89, 23);
		getContentPane().add(btnJogar);
		
		JButton btnCancelar = new JButton("Voltar");
		btnCancelar.setFont(new Font("Andalus", Font.PLAIN, 17));
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Tela_Principal();
				dispose();
			}
		});
		btnCancelar.setBounds(152, 165, 89, 23);
		getContentPane().add(btnCancelar);
		
		JLabel lbl_senha = new JLabel("Senha:");
		lbl_senha.setFont(new Font("Andalus", Font.PLAIN, 17));
		lbl_senha.setBounds(24, 114, 49, 19);
		getContentPane().add(lbl_senha);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(83, 68, 128, 20);
		getContentPane().add(passwordField);
		txt_senha.setBounds(72, 115, 154, 20);
		getContentPane().add(txt_senha);
		setSize(289 , 252);
		setVisible(true);
		setResizable(false);
	}

}
