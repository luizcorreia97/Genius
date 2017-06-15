package Telas;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Tela_Cadastro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField txt_senha;
	private JTextField txt_nome;
	
	public Tela_Cadastro() {
		
		setTitle("Cadastro");
		getContentPane().setLayout(null);
		setLocation(450 , 100);
		
		JLabel lblNewLabel = new JLabel("Cadastro");
		lblNewLabel.setFont(new Font("Andalus", Font.PLAIN, 30));
		lblNewLabel.setBounds(99, 26, 142, 23);
		getContentPane().add(lblNewLabel);
		
		JLabel lbl_id = new JLabel("Id:");
		lbl_id.setFont(new Font("Andalus", Font.PLAIN, 17));
		lbl_id.setBounds(28, 73, 26, 20);
		getContentPane().add(lbl_id);
		
		JLabel lbl_nome = new JLabel("Nome:");
		lbl_nome.setFont(new Font("Andalus", Font.PLAIN, 17));
		lbl_nome.setBounds(28, 106, 50, 20);
		getContentPane().add(lbl_nome);
		
		txt_nome = new JTextField();
		txt_nome.setFont(new Font("Andalus", Font.PLAIN, 17));
		txt_nome.setColumns(10);
		txt_nome.setBounds(88, 108, 191, 20);
		getContentPane().add(txt_nome);
		
		JLabel lbl_senha = new JLabel("Senha:");
		lbl_senha.setFont(new Font("Andalus", Font.PLAIN, 17));
		lbl_senha.setBounds(28, 143, 57, 20);
		getContentPane().add(lbl_senha);
		
		txt_senha = new JTextField();
		txt_senha.setFont(new Font("Andalus", Font.PLAIN, 17));
		txt_senha.setBounds(88, 143, 118, 20);
		getContentPane().add(txt_senha);
		txt_senha.setColumns(10);

		JButton btn_salvar = new JButton("Salvar");
		btn_salvar.setFont(new Font("Andalus", Font.PLAIN, 17));
		btn_salvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null ,"Salvo com Sucesso");
				new Tela_Principal();
				dispose();
			}
		});
		btn_salvar.setBounds(206, 185, 89, 23);
		getContentPane().add(btn_salvar);
		
		JButton btn_voltar = new JButton("Voltar");
		btn_voltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn_voltar.setFont(new Font("Andalus", Font.PLAIN, 17));
		btn_voltar.setBounds(39, 185, 89, 23);
		getContentPane().add(btn_voltar);
		
		JLabel lbl_mostra_id = new JLabel("null");
		lbl_mostra_id.setFont(new Font("Andalus", Font.PLAIN, 17));
		lbl_mostra_id.setBounds(88, 73, 57, 20);
		getContentPane().add(lbl_mostra_id);
		setSize(324, 259);
		setVisible(true);
		setResizable(false);
		
	}
}
