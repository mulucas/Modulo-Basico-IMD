package calcula_notas;

import java.awt.*;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.*;
import java.awt.Font;
import java.awt.event.*;
import java.text.DecimalFormat;

public class RecebeNotas extends JFrame {

	public JPanel contentPane;
	private JTextField tfS1_pp, tfS2_pp, tfS3_pp, tfS4_pp, tfS5_pp, tfS6_pp, tfS7_pp, 
	tfS8_pp, tfS9_pp, tfS10_pp, tfS11_pp, tfS12_pp, tfS13_pp, tfS14_pp, tfS15_pp, tfS16_pp, tfS17_pp, tfS18_pp, tfS19_pp;
	private JTextField tfptS1;
	private JTextField tfptS19;
	private JTextField tfpvtS18;
	private JTextField tfpvtS1;
	private JTextField tfptS18;
	private JTextField tfpvtS17;
	private JTextField tfptS17;
	private JTextField tfpvtS16;
	private JTextField tfptS16;
	private JTextField tfpvtS15;
	private JTextField tfptS15;
	private JTextField tfpvtS14;
	private JTextField tfptS14;
	private JTextField tfpvtS13;
	private JTextField tfpvtS2;
	private JTextField tfpvtS19;
	private JTextField tfpvtS3;
	private JTextField tfpvtS4;
	private JTextField tfpvtS5;
	private JTextField tfpvtS6;
	private JTextField tfpvtS7;
	private JTextField tfpvtS8;
	private JTextField tfpvtS9;
	private JTextField tfpvtS10;
	private JTextField tfpvtS11;
	private JTextField tfpvtS12;
	private JTextField tfptS13;
	private JTextField tfptS12;
	private JTextField tfptS11;
	private JTextField tfptS10;
	private JTextField tfptS9;
	private JTextField tfptS8;
	private JTextField tfptS7;
	private JTextField tfptS6;
	private JTextField tfptS5;
	private JTextField tfptS4;
	private JTextField tfptS3;
	private JTextField tfptS2;
	private JLabel lblDisciplinas;
	private JLabel lblIngls;
	private JLabel lblMatematica;
	private JLabel lblTecnologiaDaInformao;
	private JLabel lblLogDeProgramao;
	private JLabel lblSisOperacionais;
	private JLabel lblArqDeComputadores;
	private JLabel lblAe;
	private JLabel lblPt;
	private JLabel lblPe;
	private JLabel lblPen;
	private JTextField textField_AE_ingles, textField_AE_mat, textField_AE_TEC_INF, textField_AE_LOGICA, textField_AE_SISTEMAS, textField_AE_ARQ;
	private JTextField textField_PT_ingles, textField_PT_mat, textField_PT_TEC_INF, textField_PT_LOGICA, textField_PT_SISTEMAS, textField_PT_ARQ;
	private JTextField textField_PE_ingles,textField_PE_mat, textField_PE_TEC_INF, textField_PE_LOGICA, textField_PE_SISTEMAS, textField_PE_ARQ; 
	private JTextField textField_PEN_ingles, textField_PEN_mat, textField_PEN_TEC_INF,textField_PEN_LOGICA,textField_PEN_SISTEMAS, textField_PEN_ARQ;
	double resultado; 
	fazer fazer = new fazer();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RecebeNotas frame = new RecebeNotas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}	
	
	public RecebeNotas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 741, 460);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//--------------------JPANEL--NOTAS--SEMANAIS------------------------------------------------
		JPanel panel = new JPanel();
		panel.setBounds(0, 43, 725, 165);
		contentPane.add(panel);
		panel.setLayout(null);
		//--------------------JLABEL--NOTAS--SEMANAIS------------------------------------------------
		JLabel lblNewLabel = new JLabel("SEMANAS");
		lblNewLabel.setBounds(10, 40, 60, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("P.P");
		lblNewLabel_1.setBounds(10, 60, 46, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("P.V.T");
		lblNewLabel_2.setBounds(10, 80, 46, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("P.T");
		lblNewLabel_3.setBounds(10, 100, 46, 14);
		panel.add(lblNewLabel_3);		
		//-------------------------SEMANA--01-------------------------------------------------
		tfS1_pp = new JTextField();		
		tfS1_pp.setBounds(66, 60, 27, 17);
		panel.add(tfS1_pp);
		tfS1_pp.setColumns(10);
		
		tfpvtS1 = new JTextField();
		tfpvtS1.setColumns(10);
		tfpvtS1.setBounds(66, 80, 27, 17);
		panel.add(tfpvtS1);
		
		tfptS1 = new JTextField();
		tfptS1.setColumns(10);
		tfptS1.setBounds(66, 100, 27, 17);
		panel.add(tfptS1);
		tfptS1.setEnabled(false);	
		//--------------------------SEMANA--02------------------------------------------------
		tfS2_pp = new JTextField();
		tfS2_pp.setColumns(10);
		tfS2_pp.setBounds(99, 60, 27, 17);
		panel.add(tfS2_pp);
		
		tfpvtS2 = new JTextField();
		tfpvtS2.setColumns(10);
		tfpvtS2.setBounds(99, 80, 27, 17);
		panel.add(tfpvtS2);
			
		tfptS2 = new JTextField();
		tfptS2.setColumns(10);
		tfptS2.setBounds(99, 100, 27, 17);
		panel.add(tfptS2);
		tfptS2.setEnabled(false);
		//--------------------------SEMANA--03------------------------------------------------
		tfS3_pp = new JTextField();
		tfS3_pp.setColumns(10);
		tfS3_pp.setBounds(133, 60, 27, 17);
		panel.add(tfS3_pp);
		
		tfpvtS3 = new JTextField();
		tfpvtS3.setColumns(10);
		tfpvtS3.setBounds(133, 80, 27, 17);
		panel.add(tfpvtS3);
	
		tfptS3 = new JTextField();
		tfptS3.setColumns(10);
		tfptS3.setBounds(133, 100, 27, 17);
		panel.add(tfptS3);
		tfptS3.setEnabled(false);
		//----------------------------SEMANA--04------------------------------------------------
		tfS4_pp = new JTextField();
		tfS4_pp.setColumns(10);
		tfS4_pp.setBounds(166, 60, 27, 17);
		panel.add(tfS4_pp);
		
		tfpvtS4 = new JTextField();
		tfpvtS4.setColumns(10);
		tfpvtS4.setBounds(166, 80, 27, 17);
		panel.add(tfpvtS4);
		
		tfptS4 = new JTextField();
		tfptS4.setColumns(10);
		tfptS4.setBounds(166, 100, 27, 17);
		panel.add(tfptS4);
		tfptS4.setEnabled(false);
		//--------------------------SEMANA--05------------------------------------------------
		tfS5_pp = new JTextField();
		tfS5_pp.setColumns(10);
		tfS5_pp.setBounds(199, 60, 27, 17);
		panel.add(tfS5_pp);
		
		tfpvtS5 = new JTextField();
		tfpvtS5.setColumns(10);
		tfpvtS5.setBounds(199, 80, 27, 17);
		panel.add(tfpvtS5);
		
		tfptS5 = new JTextField();
		tfptS5.setColumns(10);
		tfptS5.setBounds(199, 100, 27, 17);
		panel.add(tfptS5);
		tfptS5.setEnabled(false);
		//----------------------------SEMANA--06----------------------------------------------
		tfS6_pp = new JTextField();
		tfS6_pp.setColumns(10);
		tfS6_pp.setBounds(232, 60, 27, 17);
		panel.add(tfS6_pp);
		
		tfpvtS6 = new JTextField();
		tfpvtS6.setColumns(10);
		tfpvtS6.setBounds(232, 80, 27, 17);
		panel.add(tfpvtS6);
	
		tfptS6 = new JTextField();
		tfptS6.setColumns(10);
		tfptS6.setBounds(232, 100, 27, 17);
		panel.add(tfptS6);
		tfptS6.setEnabled(false);
		//-----------------------------SEMANA--07---------------------------------------------
		tfS7_pp = new JTextField();
		tfS7_pp.setColumns(10);
		tfS7_pp.setBounds(265, 60, 27, 17);
		panel.add(tfS7_pp);
		
		tfpvtS7 = new JTextField();
		tfpvtS7.setColumns(10);
		tfpvtS7.setBounds(265, 80, 27, 17);
		panel.add(tfpvtS7);
			
		tfptS7 = new JTextField();
		tfptS7.setColumns(10);
		tfptS7.setBounds(265, 100, 27, 17);
		panel.add(tfptS7);
		tfptS7.setEnabled(false);
		//-----------------------------SEMANA--08---------------------------------------------
		tfS8_pp = new JTextField();
		tfS8_pp.setColumns(10);
		tfS8_pp.setBounds(297, 60, 27, 17);
		panel.add(tfS8_pp);
		
		tfpvtS8 = new JTextField();
		tfpvtS8.setColumns(10);
		tfpvtS8.setBounds(297, 80, 27, 17);
		panel.add(tfpvtS8);
		
		tfptS8 = new JTextField();
		tfptS8.setColumns(10);
		tfptS8.setBounds(297, 100, 27, 17);
		panel.add(tfptS8);
		tfptS8.setEnabled(false);
		//----------------------------SEMANA--09----------------------------------------------
		tfS9_pp = new JTextField();
		tfS9_pp.setColumns(10);
		tfS9_pp.setBounds(328, 60, 27, 17);
		panel.add(tfS9_pp);
		
		tfpvtS9 = new JTextField();
		tfpvtS9.setColumns(10);
		tfpvtS9.setBounds(328, 80, 27, 17);
		panel.add(tfpvtS9);
		
		tfptS9 = new JTextField();
		tfptS9.setColumns(10);
		tfptS9.setBounds(328, 100, 27, 17);
		panel.add(tfptS9);
		tfptS9.setEnabled(false);
		//---------------------------SEMANA--10-----------------------------------------------
		tfS10_pp = new JTextField();
		tfS10_pp.setColumns(10);
		tfS10_pp.setBounds(362, 60, 27, 17);
		panel.add(tfS10_pp);
		
		tfpvtS10 = new JTextField();
		tfpvtS10.setColumns(10);
		tfpvtS10.setBounds(362, 80, 27, 17);
		panel.add(tfpvtS10);
			
		tfptS10 = new JTextField();
		tfptS10.setColumns(10);
		tfptS10.setBounds(362, 100, 27, 17);
		panel.add(tfptS10);
		tfptS10.setEnabled(false);
		//-----------------------------SEMANA--11---------------------------------------------
		tfS11_pp = new JTextField();
		tfS11_pp.setColumns(10);
		tfS11_pp.setBounds(394, 60, 27, 17);
		panel.add(tfS11_pp);
		
		tfpvtS11 = new JTextField();
		tfpvtS11.setColumns(10);
		tfpvtS11.setBounds(394, 80, 27, 17);
		panel.add(tfpvtS11);

		tfptS11 = new JTextField();
		tfptS11.setColumns(10);
		tfptS11.setBounds(394, 100, 27, 17);
		panel.add(tfptS11);
		tfptS11.setEnabled(false);
		//-----------------------------SEMANA--12---------------------------------------------
		tfS12_pp = new JTextField();
		tfS12_pp.setColumns(10);
		tfS12_pp.setBounds(428, 60, 27, 17);
		panel.add(tfS12_pp);
		
		tfpvtS12 = new JTextField();
		tfpvtS12.setColumns(10);
		tfpvtS12.setBounds(428, 80, 27, 17);
		panel.add(tfpvtS12);

		tfptS12 = new JTextField();
		tfptS12.setColumns(10);
		tfptS12.setBounds(428, 100, 27, 17);
		panel.add(tfptS12);
		tfptS12.setEnabled(false);
		//-----------------------------SEMANA--13---------------------------------------------
		tfS13_pp = new JTextField();
		tfS13_pp.setColumns(10);
		tfS13_pp.setBounds(462, 60, 27, 17);
		panel.add(tfS13_pp);	

		tfpvtS13 = new JTextField();
		tfpvtS13.setColumns(10);
		tfpvtS13.setBounds(462, 80, 27, 17);
		panel.add(tfpvtS13);
		
		tfptS13 = new JTextField();
		tfptS13.setColumns(10);
		tfptS13.setBounds(462, 100, 27, 17);
		panel.add(tfptS13);
		tfptS13.setEnabled(false);
		//-----------------------------SEMANA--14---------------------------------------------
		tfS14_pp = new JTextField();
		tfS14_pp.setColumns(10);
		tfS14_pp.setBounds(496, 60, 27, 17);
		panel.add(tfS14_pp);
		
		tfpvtS14 = new JTextField();
		tfpvtS14.setColumns(10);
		tfpvtS14.setBounds(496, 80, 27, 17);
		panel.add(tfpvtS14);
		
		tfptS14 = new JTextField();
		tfptS14.setColumns(10);
		tfptS14.setBounds(496, 100, 27, 17);
		panel.add(tfptS14);
		tfptS14.setEnabled(false);
		//----------------------------SEMANA--15-----------------------------------------------
		tfS15_pp = new JTextField();
		tfS15_pp.setColumns(10);
		tfS15_pp.setBounds(530, 60, 27, 17);
		panel.add(tfS15_pp);
		
		tfpvtS15 = new JTextField();
		tfpvtS15.setColumns(10);
		tfpvtS15.setBounds(530, 80, 27, 17);
		panel.add(tfpvtS15);
		
		tfptS15 = new JTextField();
		tfptS15.setColumns(10);
		tfptS15.setBounds(530, 100, 27, 17);
		panel.add(tfptS15);
		tfptS15.setEnabled(false);
		//---------------------------SEMANA--16------------------------------------------------
		tfS16_pp = new JTextField();
		tfS16_pp.setColumns(10);
		tfS16_pp.setBounds(563, 60, 27, 17);
		panel.add(tfS16_pp);
		
		tfpvtS16 = new JTextField();
		tfpvtS16.setColumns(10);
		tfpvtS16.setBounds(563, 80, 27, 17);
		panel.add(tfpvtS16);
		
		tfptS16 = new JTextField();
		tfptS16.setColumns(10);
		tfptS16.setBounds(563, 100, 27, 17);
		panel.add(tfptS16);
		tfptS16.setEnabled(false);
		//-------------------------SEMANA--17--------------------------------------------------
		tfS17_pp = new JTextField();
		tfS17_pp.setColumns(10);
		tfS17_pp.setBounds(598, 60, 27, 17);
		panel.add(tfS17_pp);
		
		tfpvtS17 = new JTextField();
		tfpvtS17.setColumns(10);
		tfpvtS17.setBounds(598, 80, 27, 17);
		panel.add(tfpvtS17);
		
		tfptS17 = new JTextField();
		tfptS17.setColumns(10);
		tfptS17.setBounds(598, 100, 27, 17);
		panel.add(tfptS17);
		tfptS17.setEnabled(false);
		//--------------------------SEMANA--18-----------------------------------------------
		tfS18_pp = new JTextField();
		tfS18_pp.setColumns(10);
		tfS18_pp.setBounds(630, 60, 27, 17);
		panel.add(tfS18_pp);
		
		tfpvtS18 = new JTextField();
		tfpvtS18.setColumns(10);
		tfpvtS18.setBounds(630, 80, 27, 17);
		panel.add(tfpvtS18);
		
		tfptS18 = new JTextField();
		tfptS18.setColumns(10);
		tfptS18.setBounds(630, 100, 27, 17);
		panel.add(tfptS18);
		tfptS18.setEnabled(false);
		//-------------------------SEMANA--19-----------------------------------------------
		tfS19_pp = new JTextField();
		tfS19_pp.setColumns(10);
		tfS19_pp.setBounds(664, 60, 27, 17);
		panel.add(tfS19_pp);
		
		tfpvtS19 = new JTextField();
		tfpvtS19.setColumns(10);
		tfpvtS19.setBounds(664, 80, 27, 17);
		panel.add(tfpvtS19);
		
		tfptS19 = new JTextField();
		tfptS19.setColumns(10);
		tfptS19.setBounds(664, 100, 27, 17);
		panel.add(tfptS19);
		tfptS19.setEnabled(false);
		//-------------------------JLABEL--DAS--SEMANAS-------------------------------------------			
		JLabel lbS1 = new JLabel("S1");
		lbS1.setBounds(74, 40, 26, 14);
		panel.add(lbS1);
		
		JLabel lbS2 = new JLabel("S2");
		lbS2.setBounds(99, 40, 26, 14);
		panel.add(lbS2);
		
		JLabel lbS3 = new JLabel("S3");
		lbS3.setBounds(133, 40, 26, 14);
		panel.add(lbS3);
		
		JLabel lblS_3 = new JLabel("S4");
		lblS_3.setBounds(167, 40, 26, 14);
		panel.add(lblS_3);
		
		JLabel lblS_4 = new JLabel("S5");
		lblS_4.setBounds(199, 40, 26, 14);
		panel.add(lblS_4);
		
		JLabel lblS_5 = new JLabel("S6");
		lblS_5.setBounds(232, 40, 26, 14);
		panel.add(lblS_5);
		
		JLabel lblS_6 = new JLabel("S7");
		lblS_6.setBounds(266, 40, 26, 14);
		panel.add(lblS_6);
		
		JLabel lblS_7 = new JLabel("S8");
		lblS_7.setBounds(297, 40, 26, 14);
		panel.add(lblS_7);
		
		JLabel lblS_8 = new JLabel("S9");
		lblS_8.setBounds(328, 40, 26, 14);
		panel.add(lblS_8);
		
		JLabel lblS_9 = new JLabel("S10");
		lblS_9.setBounds(363, 40, 26, 14);
		panel.add(lblS_9);
		
		JLabel lblS_10 = new JLabel("S11");
		lblS_10.setBounds(394, 40, 27, 14);
		panel.add(lblS_10);
		
		JLabel lblS_11 = new JLabel("S12");
		lblS_11.setBounds(428, 40, 27, 14);
		panel.add(lblS_11);
		
		JLabel lblS_12 = new JLabel("S13");
		lblS_12.setBounds(462, 40, 27, 14);
		panel.add(lblS_12);
		
		JLabel lblS_13 = new JLabel("S14");
		lblS_13.setBounds(496, 40, 27, 14);
		panel.add(lblS_13);
		
		JLabel lblS_14 = new JLabel("S15");
		lblS_14.setBounds(531, 40, 26, 14);
		panel.add(lblS_14);
		
		JLabel lblS_15 = new JLabel("S16");
		lblS_15.setBounds(563, 40, 27, 14);
		panel.add(lblS_15);
		
		JLabel lblS_16 = new JLabel("S17");
		lblS_16.setBounds(598, 40, 27, 14);
		panel.add(lblS_16);
		
		JLabel lblS_17 = new JLabel("S18");
		lblS_17.setBounds(630, 40, 27, 14);
		panel.add(lblS_17);
		
		JLabel lblS_18 = new JLabel("S19");
		lblS_18.setBounds(664, 40, 27, 14);
		panel.add(lblS_18);
		
		//-----------------------selecionando todo conteudo sozinho------------------------------------
		fazer.selecionaTodoConteudo(tfS1_pp,tfpvtS1);
		fazer.selecionaTodoConteudo(tfS2_pp,tfpvtS2);
		fazer.selecionaTodoConteudo(tfS3_pp,tfpvtS3);
		fazer.selecionaTodoConteudo(tfS4_pp,tfpvtS4);
		fazer.selecionaTodoConteudo(tfS5_pp,tfpvtS5);
		fazer.selecionaTodoConteudo(tfS6_pp,tfpvtS6);
		fazer.selecionaTodoConteudo(tfS7_pp,tfpvtS7);
		fazer.selecionaTodoConteudo(tfS8_pp,tfpvtS8);
		fazer.selecionaTodoConteudo(tfS9_pp,tfpvtS9);
		fazer.selecionaTodoConteudo(tfS10_pp,tfpvtS10);
		fazer.selecionaTodoConteudo(tfS11_pp,tfpvtS11);
		fazer.selecionaTodoConteudo(tfS12_pp,tfpvtS12);
		fazer.selecionaTodoConteudo(tfS13_pp,tfpvtS13);
		fazer.selecionaTodoConteudo(tfS14_pp,tfpvtS14);
		fazer.selecionaTodoConteudo(tfS15_pp,tfpvtS15);
		fazer.selecionaTodoConteudo(tfS16_pp,tfpvtS16);
		fazer.selecionaTodoConteudo(tfS17_pp,tfpvtS17);
		fazer.selecionaTodoConteudo(tfS18_pp,tfpvtS18);
		fazer.selecionaTodoConteudo(tfS19_pp,tfpvtS19);	
		
		//---------------------------------------------------------------------------------------
		JLabel lblNotasSemanais = new JLabel("NOTAS SEMANAIS");
		lblNotasSemanais.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblNotasSemanais.setBounds(265, 0, 173, 43);
		panel.add(lblNotasSemanais);
		
		lblDisciplinas = new JLabel("Disciplinas");
		lblDisciplinas.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDisciplinas.setBounds(10, 219, 67, 14);
		contentPane.add(lblDisciplinas);
		
		lblIngls = new JLabel("Ingl\u00EAs");
		lblIngls.setBounds(10, 235, 54, 14);
		contentPane.add(lblIngls);
		
		lblMatematica = new JLabel("Matematica");
		lblMatematica.setBounds(10, 251, 76, 14);
		contentPane.add(lblMatematica);
		
		lblTecnologiaDaInformao = new JLabel("Tecnologia da Informa\u00E7\u00E3o");
		lblTecnologiaDaInformao.setBounds(10, 268, 135, 14);
		contentPane.add(lblTecnologiaDaInformao);
		
		lblLogDeProgramao = new JLabel("Log. de Programa\u00E7\u00E3o");
		lblLogDeProgramao.setBounds(10, 285, 116, 14);
		contentPane.add(lblLogDeProgramao);
		
		lblSisOperacionais = new JLabel("Sis. Operacionais");
		lblSisOperacionais.setBounds(10, 301, 135, 14);
		contentPane.add(lblSisOperacionais);
		
		lblArqDeComputadores = new JLabel("Arq. de Computadores");
		lblArqDeComputadores.setBounds(10, 317, 135, 14);
		contentPane.add(lblArqDeComputadores);
		
		lblAe = new JLabel("AE");
		lblAe.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAe.setBounds(160, 219, 19, 14);
		contentPane.add(lblAe);
		
		lblPt = new JLabel("PT");
		lblPt.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPt.setBounds(192, 219, 19, 14);
		contentPane.add(lblPt);
		
		lblPe = new JLabel("P.E");
		lblPe.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPe.setBounds(225, 219, 19, 14);
		contentPane.add(lblPe);
		
		lblPen = new JLabel("FINAL");
		lblPen.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPen.setBounds(254, 219, 33, 14);
		contentPane.add(lblPen);
		
		textField_AE_ingles = new JTextField();
		textField_AE_ingles.setColumns(10);
		textField_AE_ingles.setBounds(152, 232, 27, 17);
		contentPane.add(textField_AE_ingles);
		
		textField_AE_mat = new JTextField();
		textField_AE_mat.setColumns(10);
		textField_AE_mat.setBounds(152, 248, 27, 17);
		contentPane.add(textField_AE_mat);
		
		textField_AE_TEC_INF = new JTextField();
		textField_AE_TEC_INF.setColumns(10);
		textField_AE_TEC_INF.setBounds(152, 264, 27, 17);
		contentPane.add(textField_AE_TEC_INF);
		
		textField_AE_LOGICA = new JTextField();
		textField_AE_LOGICA.setColumns(10);
		textField_AE_LOGICA.setBounds(152, 280, 27, 17);
		contentPane.add(textField_AE_LOGICA);
		
		textField_AE_SISTEMAS = new JTextField();
		textField_AE_SISTEMAS.setColumns(10);
		textField_AE_SISTEMAS.setBounds(152, 296, 27, 17);
		contentPane.add(textField_AE_SISTEMAS);
		
		textField_AE_ARQ = new JTextField();
		textField_AE_ARQ.setColumns(10);
		textField_AE_ARQ.setBounds(152, 312, 27, 17);
		contentPane.add(textField_AE_ARQ);
		
		textField_PT_ingles = new JTextField();
		textField_PT_ingles.setColumns(10);
		textField_PT_ingles.setBounds(184, 232, 27, 17);
		contentPane.add(textField_PT_ingles);
		
		textField_PT_mat = new JTextField();
		textField_PT_mat.setColumns(10);
		textField_PT_mat.setBounds(184, 248, 27, 17);
		contentPane.add(textField_PT_mat);
		
		textField_PT_TEC_INF = new JTextField();
		textField_PT_TEC_INF.setColumns(10);
		textField_PT_TEC_INF.setBounds(184, 264, 27, 17);
		contentPane.add(textField_PT_TEC_INF);
		
		textField_PT_LOGICA = new JTextField();
		textField_PT_LOGICA.setColumns(10);
		textField_PT_LOGICA.setBounds(184, 280, 27, 17);
		contentPane.add(textField_PT_LOGICA);
		
		textField_PT_SISTEMAS = new JTextField();
		textField_PT_SISTEMAS.setColumns(10);
		textField_PT_SISTEMAS.setBounds(184, 296, 27, 17);
		contentPane.add(textField_PT_SISTEMAS);
		
		textField_PT_ARQ = new JTextField();
		textField_PT_ARQ.setColumns(10);
		textField_PT_ARQ.setBounds(184, 312, 27, 17);
		contentPane.add(textField_PT_ARQ);
		
		textField_PE_ingles = new JTextField();
		textField_PE_ingles.setColumns(10);
		textField_PE_ingles.setBounds(220, 232, 27, 17);
		contentPane.add(textField_PE_ingles);
		
		textField_PE_mat = new JTextField();
		textField_PE_mat.setColumns(10);
		textField_PE_mat.setBounds(220, 248, 27, 17);
		contentPane.add(textField_PE_mat);
		
		textField_PE_TEC_INF = new JTextField();
		textField_PE_TEC_INF.setColumns(10);
		textField_PE_TEC_INF.setBounds(220, 264, 27, 17);
		contentPane.add(textField_PE_TEC_INF);
		
		textField_PE_LOGICA = new JTextField();
		textField_PE_LOGICA.setColumns(10);
		textField_PE_LOGICA.setBounds(220, 280, 27, 17);
		contentPane.add(textField_PE_LOGICA);
		
		textField_PE_SISTEMAS = new JTextField();
		textField_PE_SISTEMAS.setColumns(10);
		textField_PE_SISTEMAS.setBounds(220, 296, 27, 17);
		contentPane.add(textField_PE_SISTEMAS);
		
		textField_PE_ARQ = new JTextField();
		textField_PE_ARQ.setColumns(10);
		textField_PE_ARQ.setBounds(220, 312, 27, 17);
		contentPane.add(textField_PE_ARQ);
		
		textField_PEN_ingles = new JTextField();
		textField_PEN_ingles.setColumns(10);
		textField_PEN_ingles.setBounds(254, 232, 27, 17);
		contentPane.add(textField_PEN_ingles);
		
		textField_PEN_mat = new JTextField();
		textField_PEN_mat.setColumns(10);
		textField_PEN_mat.setBounds(254, 248, 27, 17);
		contentPane.add(textField_PEN_mat);
		
		textField_PEN_TEC_INF = new JTextField();
		textField_PEN_TEC_INF.setColumns(10);
		textField_PEN_TEC_INF.setBounds(254, 264, 27, 17);
		contentPane.add(textField_PEN_TEC_INF);
		
		textField_PEN_LOGICA = new JTextField();
		textField_PEN_LOGICA.setColumns(10);
		textField_PEN_LOGICA.setBounds(254, 280, 27, 17);
		contentPane.add(textField_PEN_LOGICA);
		
		textField_PEN_SISTEMAS = new JTextField();
		textField_PEN_SISTEMAS.setColumns(10);
		textField_PEN_SISTEMAS.setBounds(254, 296, 27, 17);
		contentPane.add(textField_PEN_SISTEMAS);
		
		textField_PEN_ARQ = new JTextField();
		textField_PEN_ARQ.setColumns(10);
		textField_PEN_ARQ.setBounds(254, 312, 27, 17);
		contentPane.add(textField_PEN_ARQ);
				
		JButton btnLimparTudo = new JButton("LIMPAR TUDO");
		btnLimparTudo.setBounds(370, 131, 120, 25);
		panel.add(btnLimparTudo);
		btnLimparTudo.addActionListener(new ActionListener() {		
			public void actionPerformed(ActionEvent e) {
				String message = "Deseja realmente limpar todos os campos ?";
				String title = "Confirmação";
				int reply = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION);
				if (reply == JOptionPane.YES_OPTION){
				   	fazer.limparCampos(panel);	
				}
			}
		});		
		
		JButton btnCalcularPt = new JButton("CALCULAR P.T");
		btnCalcularPt.setBounds(240, 131, 120, 25);
		panel.add(btnCalcularPt);
		btnCalcularPt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//----------------------SEMANA-1-----------------------------
				tfptS1.setText(fazer.calculaNotasSemanais(tfpvtS1, tfS1_pp));
				fazer.mudaCor(tfptS1.getText(), tfptS1);
				//----------------------SEMANA-2------------------------------
				tfptS2.setText(fazer.calculaNotasSemanais(tfpvtS2, tfS2_pp));
				fazer.mudaCor(tfptS2.getText(), tfptS2);
				//----------------------SEMANA-3------------------------------
				tfptS3.setText(fazer.calculaNotasSemanais(tfpvtS3, tfS3_pp));
				fazer.mudaCor(tfptS3.getText(), tfptS3);
				//---------------------SEMANA-4-------------------------------
				tfptS4.setText(fazer.calculaNotasSemanais(tfpvtS4, tfS4_pp));
				fazer.mudaCor(tfptS4.getText(), tfptS4);
				//----------------------SEMANA-5------------------------------
				tfptS5.setText(fazer.calculaNotasSemanais(tfpvtS5, tfS4_pp));
				fazer.mudaCor(tfptS5.getText(), tfptS5);
				//--------------------SEMANA-6--------------------------------
				tfptS6.setText(fazer.calculaNotasSemanais(tfpvtS6, tfS6_pp));
				fazer.mudaCor(tfptS6.getText(), tfptS6);
				//---------------------SEMANA-7-------------------------------
				tfptS7.setText(fazer.calculaNotasSemanais(tfpvtS7, tfS7_pp));
				fazer.mudaCor(tfptS7.getText(), tfptS7);
				//---------------------SEMANA-8-------------------------------
				tfptS8.setText(fazer.calculaNotasSemanais(tfpvtS8, tfS8_pp));
				fazer.mudaCor(tfptS8.getText(), tfptS8);
				//---------------------SEMANA-9-------------------------------
				tfptS9.setText(fazer.calculaNotasSemanais(tfpvtS9, tfS8_pp));
				fazer.mudaCor(tfptS9.getText(), tfptS9);
				//---------------------SEMANA-10-------------------------------
				tfptS10.setText(fazer.calculaNotasSemanais(tfpvtS10, tfS10_pp));
				fazer.mudaCor(tfptS10.getText(), tfptS10);
				//---------------------SEMANA-11-------------------------------
				tfptS11.setText(fazer.calculaNotasSemanais(tfpvtS11, tfS11_pp));
				fazer.mudaCor(tfptS11.getText(), tfptS11);
				//---------------------SEMANA-12-------------------------------
				tfptS12.setText(fazer.calculaNotasSemanais(tfpvtS12, tfS12_pp));
				fazer.mudaCor(tfptS12.getText(), tfptS12);
				//---------------------SEMANA-13-------------------------------
				tfptS13.setText(fazer.calculaNotasSemanais(tfpvtS13, tfS13_pp));
				fazer.mudaCor(tfptS13.getText(), tfptS13);
				//--------------------SEMANA-14--------------------------------
				tfptS14.setText(fazer.calculaNotasSemanais(tfpvtS14, tfS14_pp));
				fazer.mudaCor(tfptS14.getText(), tfptS14);
				//--------------------SEMANA-15--------------------------------
				tfptS15.setText(fazer.calculaNotasSemanais(tfpvtS15, tfS15_pp));
				fazer.mudaCor(tfptS15.getText(), tfptS15);
				//--------------------SEMANA-16--------------------------------
				tfptS16.setText(fazer.calculaNotasSemanais(tfpvtS16, tfS16_pp));
				fazer.mudaCor(tfptS16.getText(), tfptS16);
				//--------------------SEMANA-17--------------------------------
				tfptS17.setText(fazer.calculaNotasSemanais(tfpvtS17, tfS17_pp));
				fazer.mudaCor(tfptS17.getText(), tfptS17);
				//--------------------SEMANA-18--------------------------------
				tfptS18.setText(fazer.calculaNotasSemanais(tfpvtS18, tfS18_pp));
				fazer.mudaCor(tfptS18.getText(), tfptS18);
				//--------------------SEMANA-19--------------------------------
				tfptS19.setText(fazer.calculaNotasSemanais(tfpvtS19, tfS19_pp));
				fazer.mudaCor(tfptS19.getText(), tfptS19);
				
				
				textField_PT_ingles.setText(fazer.calculaNotaTotalIngles(tfptS1, tfptS2, tfptS3, tfptS4, tfptS5, tfptS6, tfptS7, tfptS8, tfptS9, tfptS10));
				textField_PT_mat.setText(fazer.calculaNotaTotalMatematica(tfptS1, tfptS2, tfptS3, tfptS4, tfptS5, tfptS6, tfptS7, tfptS8, tfptS9, tfptS10));
				textField_PT_ARQ.setText(fazer.calculaNotaTotalARQUITETURA(tfptS9, tfptS10, tfptS11, tfptS12, tfptS13));
				textField_PT_TEC_INF.setText(fazer.calculaNotaTotalTI(tfptS1, tfptS2, tfptS3, tfptS4, tfptS5, tfptS6, tfptS7, tfptS8));
				textField_PT_SISTEMAS.setText(fazer.calculaNotaTotalSO(tfptS11, tfptS12, tfptS13, tfptS14, tfptS15, tfptS16, tfptS17, tfptS18, tfptS19));
				textField_PT_LOGICA.setText(fazer.calculaNotaTotalLogica(tfptS11, tfptS12, tfptS13, tfptS14, tfptS15, tfptS16, tfptS17, tfptS18, tfptS19));
			}
		});
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e) {
				int i = JOptionPane.showConfirmDialog(null ,"Tem certeza que deseja sair?", "Saída", JOptionPane.YES_NO_OPTION);
				if (i == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				} else {
					repaint();
				}
			}
		});
	}
}