package Telas;

import javax.swing.*;

import Código.Run_Game;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.util.ArrayList;

public class Jogo extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//CLASSES ESTANCIADAS
	Run_Game Run = new Run_Game();
	Ranking Ran = new Ranking();

	//ARRAYS
	ArrayList<String> lista_usuario = new ArrayList<>();
	ArrayList<Integer> lista_pontos = new ArrayList<>();
	ArrayList<String> lista_dificuldade = new ArrayList<>();
	
	//BOTOES
	private JButton btn_iniciar,btn_amarelo,btnVerde,btnAzul,btnVermelho;
	private JButton btn_facil;
	private JButton btn_medio;
	private JButton btn_dificil;
	private JButton btn_ranking;
	
	//LABELS
	public JLabel label_pontos;
	private JLabel lblPontos;

	//TEXT
	private JTextField txt_mostra;
	private JTextField txt_usuario;
	
	//VARIAVEIS SIMPLES
	String usuario,dificuldade;
	int nivel;

	public JButton getBtnAmarelo() {
		return btn_amarelo;
	}

	public void setBtnAmarelo(JButton btnAmarelo) {
		this.btn_amarelo = btnAmarelo;
	}

	public JButton getBtnVerde() {
		return btnVerde;
	}

	public void setBtnVerde(JButton btnVerde) {
		this.btnVerde = btnVerde;
	}

	public JButton getBtnAzul() {
		return btnAzul;
	}

	public void setBtnAzul(JButton btnAzul) {
		this.btnAzul = btnAzul;
	}

	public JButton getBtnVermelho() {
		return btnVermelho;
	}

	public void setBtnVermelho(JButton btnVermelho) {
		this.btnVermelho = btnVermelho;
	}

	Jogo(){
		
		Ran.setVisible(false);
		
		getContentPane().setBackground(Color.BLACK);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		setLocation(450 , 100);
		setTitle("GENIUS");
		
		//LABEL
		label_pontos = new JLabel("");
		label_pontos.setFont(new Font("Andalus", Font.PLAIN, 20));
		label_pontos.setForeground(Color.YELLOW);
		label_pontos.setHorizontalAlignment(SwingConstants.CENTER);
		label_pontos.setBounds(328, 26, 46, 14);
		getContentPane().add(label_pontos);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//BOTÃO INICIAR
		btn_iniciar = new JButton("Iniciar");
		btn_iniciar.setBackground(Color.WHITE);
		btn_iniciar.setForeground(Color.BLACK);
		btn_iniciar.setFont(new Font("Andalus", Font.PLAIN, 20));
		btn_iniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt_usuario = new JTextField();
				int valida;
				valida = JOptionPane.showConfirmDialog(null,txt_usuario,"Informe Seu Nickname",JOptionPane.OK_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE);
				if(valida==JOptionPane.YES_OPTION){
					JOptionPane.showMessageDialog(null, "Usuario Gravado Com Sucesso!\nBem Vindo Ao Jogo Genius "+txt_usuario.getText()+"!");
					Run.pontos=0;
					txt_mostra.setText(null);
					label_pontos.setText(null);
					txt_mostra.setText(txt_mostra.getText()+Run.mostra());
					
					btn_iniciar.setEnabled(false);
					btn_ranking.setEnabled(true);
					
					btn_facil.setEnabled(false);
					btn_medio.setEnabled(false);
					btn_dificil.setEnabled(false);
					
					btn_amarelo.setEnabled(true);
					btnVerde.setEnabled(true);
					btnAzul.setEnabled(true);
					btnVermelho.setEnabled(true);					

					label_pontos.setText(Integer.toString(Run.pontos));
					try {
						piscar();
					} catch (InterruptedException g) {
						g.printStackTrace();
					}
					}else {
						
					}
				

			}
		});
		btn_iniciar.setBounds(10, 84, 89, 52);
		getContentPane().add(btn_iniciar);
		btn_iniciar.setEnabled(false);

		//BOTÃO AMARELO
		btn_amarelo = new JButton("Amarelo");
		btn_amarelo.setFont(new Font("Andalus", Font.PLAIN, 20));
		btn_amarelo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Run.Jogador.add(0);
				Run.verifica();
				acerto();
				erro();
				reiniciar();
			}
		});
		btn_amarelo.setForeground(Color.YELLOW);
		btn_amarelo.setBackground(Color.WHITE);
		btn_amarelo.setBounds(113, 78, 200, 100);
		btn_amarelo.setEnabled(false);
		getContentPane().add(btn_amarelo);

		//BOTÃO VERDE
		btnVerde = new JButton("Verde");
		btnVerde.setFont(new Font("Andalus", Font.PLAIN, 20));
		btnVerde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Run.Jogador.add(1);
				Run.verifica();
				acerto();
				erro();
				reiniciar();
			}
		});
		btnVerde.setBackground(Color.WHITE);
		btnVerde.setForeground(Color.GREEN);
		btnVerde.setBounds(10, 177, 200, 100);
		btnVerde.setEnabled(false);
		getContentPane().add(btnVerde);

		//BOTÃO AZUL
		btnAzul = new JButton("Azul");
		btnAzul.setFont(new Font("Andalus", Font.PLAIN, 20));
		btnAzul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Run.Jogador.add(2);
				Run.verifica();
				acerto();
				erro();
				reiniciar();
			}
		});
		btnAzul.setBackground(Color.WHITE);
		btnAzul.setForeground(Color.BLUE);
		btnAzul.setBounds(210, 177, 200, 100);
		btnAzul.setEnabled(false);
		getContentPane().add(btnAzul);

		//BOTÃO VERMELHO
		btnVermelho = new JButton("Vermelho");
		btnVermelho.setFont(new Font("Andalus", Font.PLAIN, 20));
		btnVermelho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Run.Jogador.add(3);
				Run.verifica();
				acerto();
				erro();
				reiniciar();
			}
		});
		btnVermelho.setForeground(Color.RED);
		btnVermelho.setBackground(Color.WHITE);
		btnVermelho.setBounds(113, 275, 200, 100);
		btnVermelho.setEnabled(false);
		getContentPane().add(btnVermelho);
		
		//LABEL PONTOS
		lblPontos = new JLabel("Pontos:");
		lblPontos.setFont(new Font("Andalus", Font.PLAIN, 18));
		lblPontos.setForeground(Color.WHITE);
		lblPontos.setBounds(270, 26, 62, 14);
		getContentPane().add(lblPontos);
		
		//TEXT MOSTRA
		txt_mostra = new JTextField();
		txt_mostra.setBounds(351, 95, 23, 36);
		getContentPane().add(txt_mostra);
		txt_mostra.setColumns(10);
		txt_mostra.setVisible(false);
		
		//BOTÃO RANKING
		btn_ranking = new JButton("Ranking");
		btn_ranking.setBackground(Color.WHITE);
		btn_ranking.setForeground(new Color(153, 204, 51));
		btn_ranking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Ran.setVisible(true);
				for(int i = 0; i <lista_usuario.size(); i++){
					//System.out.println("Usuário: "+lista_usuario.get(i)+" Pontos: "+lista_pontos.get(i));
					Ran.modelo.addRow(new Object[] {lista_usuario.get(i), lista_pontos.get(i) , dificuldade});
					Ran.recebe(lista_usuario.get(i), lista_pontos.get(i));
				}
				lista_dificuldade.clear();
				lista_usuario.clear();
				lista_pontos.clear();

			}
		});
		btn_ranking.setFont(new Font("Andalus", Font.PLAIN, 20));
		btn_ranking.setBounds(72, 26, 121, 23);
		getContentPane().add(btn_ranking);
		
		//BOTÃO NÍVEL FÁCIL
		btn_facil = new JButton("F\u00E1cil");
		btn_facil.setForeground(Color.MAGENTA);
		btn_facil.setBackground(Color.WHITE);
		btn_facil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nivel = 1000;
				btn_iniciar.setEnabled(true);
				JOptionPane.showMessageDialog(null, "**Jogo Alterado Pro Nível FÁCIL**");
				dificuldade = "Fácil";
				btn_iniciar.setBackground(Color.RED);
				btn_iniciar.setForeground(Color.WHITE);
				try {
					update(getGraphics());
					Thread.sleep(750);
				} catch (Exception z) {
				}
				btn_iniciar.setBackground(Color.WHITE);
				btn_iniciar.setForeground(Color.RED);
			}
		});
		btn_facil.setFont(new Font("Andalus", Font.PLAIN, 20));
		btn_facil.setBounds(10, 406, 89, 23);
		getContentPane().add(btn_facil);
		
		//BOTÃO NÍVEL MÉDIO
		btn_medio = new JButton("M\u00E9dio");
		btn_medio.setForeground(Color.CYAN);
		btn_medio.setBackground(Color.WHITE);
		btn_medio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				nivel = 300;
				btn_iniciar.setEnabled(true);
				JOptionPane.showMessageDialog(null, "**Jogo Alterado Pro Nível MÉDIO**");
				dificuldade = "Médio";
				btn_iniciar.setBackground(Color.RED);
				btn_iniciar.setForeground(Color.WHITE);
				try {
					update(getGraphics());
					Thread.sleep(750);
				} catch (Exception z) {
				}
				btn_iniciar.setBackground(Color.WHITE);
				btn_iniciar.setForeground(Color.RED);
			}
		});
		btn_medio.setFont(new Font("Andalus", Font.PLAIN, 20));
		btn_medio.setBounds(163, 406, 89, 23);
		getContentPane().add(btn_medio);
		
		//BOTÃO NÍVEL DÍFICIL
		btn_dificil = new JButton("Dif\u00EDcil");
		btn_dificil.setForeground(Color.ORANGE);
		btn_dificil.setBackground(Color.WHITE);
		btn_dificil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nivel = 100;
				btn_iniciar.setEnabled(true);
				JOptionPane.showMessageDialog(null, "**Jogo Alterado Pro Nível DIFÍCIL**");
				dificuldade = "Dificil";
				btn_iniciar.setBackground(Color.RED);
				btn_iniciar.setForeground(Color.WHITE);
				try {
					update(getGraphics());
					Thread.sleep(750);
				} catch (Exception z) {
				}
				btn_iniciar.setBackground(Color.WHITE);
				btn_iniciar.setForeground(Color.RED);
			}
		});
		btn_dificil.setFont(new Font("Andalus", Font.PLAIN, 20));
		btn_dificil.setBounds(316, 406, 89, 23);
		getContentPane().add(btn_dificil);
		
		txt_mostra.setVisible(false);
		ImageIcon ImgIcone = new ImageIcon("C:\\Users\\luizh\\Documents\\College\\2º PERÍODO\\Programação Orientada a Objetos\\Arquivos Eclipse\\Integrador II - Genius\\Imagens_Genius\\Simon.jpg");
		setIconImage(ImgIcone.getImage());
		setVisible(true);
		setSize(425 , 480);
		setResizable(false);
		JOptionPane.showMessageDialog(null, "               Bem Vindo\nSelecione o Nivel Para Iniciar o Jogo! ");
		
		//PISCA BOTOES DE NIVEIS PRA CHAMAR A ATENÇÃO!!
		btn_facil.setBackground(Color.RED);
		try {
			update(getGraphics());
			Thread.sleep(500);
		} catch (Exception z) {
		}
		btn_facil.setBackground(Color.WHITE);
		btn_medio.setBackground(Color.RED);	
		try {
			update(getGraphics());
			Thread.sleep(500);
		} catch (Exception z) {
		}
		btn_medio.setBackground(Color.WHITE);
		btn_dificil.setBackground(Color.RED);	
		try {
			update(getGraphics());
			Thread.sleep(500);
		} catch (Exception z) {
		}
		btn_dificil.setBackground(Color.WHITE);
	}
	public JLabel getLabel_pontos() {
		return label_pontos;
	}

	public void setLabel_pontos(JLabel label_pontos) {
		this.label_pontos = label_pontos;
	}

	//MÉTODO PARA PISCAR OS BOTÕES
	public void piscar() throws InterruptedException{
		for (int i = 0; i < Run.Jogada.size(); i++) {
			if (Run.Jogada.get(i) == 0) {
				btn_amarelo.setBackground(Color.YELLOW);
				btn_amarelo.setForeground(Color.WHITE);
				try {
					update(getGraphics());
					Thread.sleep(nivel);
				} catch (Exception e) {
				}
				btn_amarelo.setBackground(Color.WHITE);
				btn_amarelo.setForeground(Color.YELLOW);
				update(getGraphics());
				Thread.sleep(nivel);
			}else if (Run.Jogada.get(i) == 1) {
				btnVerde.setBackground(Color.GREEN);
				btnVerde.setForeground(Color.WHITE);
				try {
					update(getGraphics());
					Thread.sleep(nivel);
				} catch (Exception e) {
				}
				btnVerde.setBackground(Color.WHITE);
				btnVerde.setForeground(Color.GREEN);
				update(getGraphics());
				Thread.sleep(nivel);
			}else if (Run.Jogada.get(i) == 2) {
				btnAzul.setBackground(Color.BLUE);
				btnAzul.setForeground(Color.WHITE);
				try {
					update(getGraphics());
					Thread.sleep(nivel);
				} catch (Exception e) {
				}
				btnAzul.setBackground(Color.WHITE);
				btnAzul.setForeground(Color.BLUE);
				update(getGraphics());
				Thread.sleep(nivel);
			} else if (Run.Jogada.get(i) == 3) {
				btnVermelho.setBackground(Color.RED);
				btnVermelho.setForeground(Color.WHITE);
				try {
					update(getGraphics());
					Thread.sleep(nivel);
				} catch (Exception e) {
				}
				btnVermelho.setBackground(Color.WHITE);
				btnVermelho.setForeground(Color.RED);
				update(getGraphics());
				Thread.sleep(nivel);
			}
		}
	}
	
	//ACERTO
		public void acerto(){
			if(Run.continua == 1){
				txt_mostra.setText(null);
				txt_mostra.setText(txt_mostra.getText()+Run.mostra());
				Run.Jogador.clear();
				Run.continua = 0;
				label_pontos.setText(Integer.toString(Run.pontos));
				try {
					piscar();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
	//ERRO
	public void erro(){
		if(Run.continua == 2){
			txt_mostra.setText(null);
			Run.Jogada.clear();
			Run.Jogador.clear();
			Run.continua = 0;
			Run.cont = 0;
			btn_iniciar.setEnabled(true);
			popula_ranking();
			pisca_ranking();
		}
	}	
	//REINICAR JOGO
	public void reiniciar(){
		if (Run.valida_fim == true) {
			btn_dificil.setEnabled(true);
			btn_facil.setEnabled(true);
			btn_medio.setEnabled(true);
		}
	}
	
	//ALIMENTAR RANKING
	public void popula_ranking(){
		lista_usuario.add(txt_usuario.getText());
		lista_pontos.add(Run.pontos);
		txt_usuario.setText(null);
	}
	
	//CHAMAR ATENÇÃO PISCANDO BOTÃO RANKING
	public void pisca_ranking(){
		btn_ranking.setBackground(Color.RED);
		btn_ranking.setForeground(Color.WHITE);
		try {
			update(getGraphics());
			Thread.sleep(750);
		} catch (Exception j) {
		}
		btn_ranking.setBackground(Color.WHITE);
		btn_ranking.setForeground(Color.RED);
		btn_amarelo.setEnabled(false);
		btnVerde.setEnabled(false);
		btnAzul.setEnabled(false);
		btnVermelho.setEnabled(false);	
	}

	//MAIN
	public static void main(String[] args) {
		new Jogo();

	}
}