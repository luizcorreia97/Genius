package Telas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Tela_Principal extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Tela_Principal() {
		getContentPane().setLayout(null);
		setTitle("Genius");
		setLocation(450 , 100);
		JLabel lblJogoGenius = new JLabel("Jogo Genius");
		lblJogoGenius.setFont(new Font("Andalus", Font.PLAIN, 30));
		lblJogoGenius.setBounds(41, 21, 156, 35);
		getContentPane().add(lblJogoGenius);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setFont(new Font("Andalus", Font.PLAIN, 17));
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Tela_Cadastro();
				dispose();
				
			}
		});
		btnCadastrar.setBounds(66, 89, 108, 23);
		getContentPane().add(btnCadastrar);
		
		JButton btnJogar = new JButton("Jogar");
		btnJogar.setFont(new Font("Andalus", Font.PLAIN, 17));
		btnJogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Jogo();
				dispose();
			}
		});
		btnJogar.setBounds(66, 123, 108, 23);
		getContentPane().add(btnJogar);
		
		JButton btnRanking = new JButton("Ranking");
		btnRanking.setFont(new Font("Andalus", Font.PLAIN, 17));
		btnRanking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Ranking();
				dispose();
			}
		});
		btnRanking.setBounds(66, 157, 108, 23);
		getContentPane().add(btnRanking);
		setSize(247 , 242);
		setVisible(true);
		setResizable(false);
		final JDesktopPane jDesktopPane = new JDesktopPane() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			ImageIcon ImgPr = new ImageIcon("C:/Users/Luiz Henrique/Desktop/Facear/2º Periodo/Projeto Integrador II/ImagensSimon Top.jpg");
			Image image = ImgPr.getImage();
			Image newImage = image.getScaledInstance(440 , 295 , Image.SCALE_SMOOTH);
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(newImage, 0, 0, this);
			}

		};
		jDesktopPane.setBackground(Color.LIGHT_GRAY);
		getContentPane().add(jDesktopPane);
		GridBagLayout gbl_jDesktopPane = new GridBagLayout();
		gbl_jDesktopPane.columnWidths = new int[]{570, 127, 0};
		gbl_jDesktopPane.rowHeights = new int[]{450, 36, 0};
		gbl_jDesktopPane.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_jDesktopPane.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		jDesktopPane.setLayout(gbl_jDesktopPane);
	}

	public static void main(String[] args) {
		new Tela_Principal();
	}
}
