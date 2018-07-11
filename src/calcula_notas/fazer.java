package calcula_notas;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class Fazer {
	double num1,num2,resultado;

	public void mudaCor(double c, JTextField v) {
		v.setDisabledTextColor(Color.BLACK);
		if (c>=5&&c<=10) {
			v.setBackground(new Color(0, 255, 0));
		}else if (c==404) {
			v.setText("");
			v.setBackground(new Color(255, 255, 255));
		}
		else {
			v.setBackground(new Color(255, 77, 77));
		}
	}
	
	public void salvarpts(JTextField[] campos) throws IOException{
		FileWriter cria = new FileWriter("pts.txt");
		BufferedWriter gravarArq = new BufferedWriter(cria);
		for( int i=0; i < campos.length; i++){
			String valor = campos[i].getText();
			gravarArq.write(valor);
			gravarArq.newLine();
		} 
		gravarArq.close();
		cria.close();
	}
	
	public void salvarpp(JTextField[] campos) throws IOException{
		FileWriter cria = new FileWriter("pp.txt");
		BufferedWriter gravarArq = new BufferedWriter(cria);
		for( int i=0; i < campos.length; i++){
			String valor = campos[i].getText();
			gravarArq.write(valor);
			gravarArq.newLine();
		} 
		gravarArq.close();
		cria.close();
	}
	
	public void salvarae(JTextField[] campos) throws IOException{
		FileWriter cria = new FileWriter("ae.txt");
		BufferedWriter gravarArq = new BufferedWriter(cria);
		for( int i=0; i < campos.length; i++){
			String valor = campos[i].getText();
			gravarArq.write(valor);
			gravarArq.newLine();
		} 
		gravarArq.close();
		cria.close();
	}
	public void salvarpe(JTextField[] campos) throws IOException{
		FileWriter cria = new FileWriter("pe.txt");
		BufferedWriter gravarArq = new BufferedWriter(cria);
		for( int i=0; i < campos.length; i++){
			String valor = campos[i].getText();
			gravarArq.write(valor);
			gravarArq.newLine();
		} 
		gravarArq.close();
		cria.close();
	}
	
	public void salvarpvt(JTextField[] campos) throws IOException{
		FileWriter cria = new FileWriter("pvt.txt");
		BufferedWriter gravarArq = new BufferedWriter(cria);
		for( int i=0; i < campos.length; i++){
			String valor = campos[i].getText();
			gravarArq.write(valor);
			gravarArq.newLine();
		} 
		gravarArq.close();
		cria.close();
	}
	
	public void salvarpt(JTextField[] campos) throws IOException{
		FileWriter cria = new FileWriter("pt.txt");
		BufferedWriter gravarArq = new BufferedWriter(cria);
		for( int i=0; i < campos.length; i++){
			String valor = campos[i].getText();
			gravarArq.write(valor);
			gravarArq.newLine();
		} 
		gravarArq.close();
		cria.close();
	}
	
	public String calculaFinalIngles(JTextField x, JTextField y, JTextField prova) {
		
		String entradaX = x.getText();
		double valorX = Double.parseDouble(entradaX.replace(',', '.'));
		String entradaY = y.getText();
		double valorY = Double.parseDouble(entradaY.replace(',', '.'));
		String entradaProva = prova.getText();
		double valorProva = Double.parseDouble(entradaProva.replace(',', '.'));
		
		double result = (valorX + valorY+(2*valorProva))/4;
		String resultadoEmTexto = String.format("%.1f", result);
		return resultadoEmTexto;
	}
	
	public String notaFinaldoModulo(JTextField ingles, JTextField mat, JTextField arq,JTextField log, JTextField ti, JTextField sis) {
		String entradaMat = mat.getText();
		double valorMat = Double.parseDouble(entradaMat.replace(',', '.'));
		String entradaINGLES = ingles.getText();
		double valorINGLES = Double.parseDouble(entradaINGLES.replace(',', '.'));
		String entradaARQUITETURA = arq.getText();
		double valorARQUITETURA = Double.parseDouble(entradaARQUITETURA.replace(',', '.'));
		String entradaLOGICA = log.getText();
		double valorLOGICA = Double.parseDouble(entradaLOGICA.replace(',', '.'));
		String entradaTI = ti.getText();
		double valorTI = Double.parseDouble(entradaTI.replace(',', '.'));
		String entradaSISTEMA = sis.getText();
		double valorSISTEMA = Double.parseDouble(entradaSISTEMA.replace(',', '.'));

		double result = ((valorARQUITETURA*20) +(valorINGLES*40)+(valorLOGICA*60)+(valorMat*40)+(valorSISTEMA*60)+(valorTI*60))/280;
		String resultadoEmTexto = String.format("%.1f", result);
		return resultadoEmTexto;
	}
	
	public String calculaFinalMATEMATICA(JTextField x, JTextField y, JTextField prova) {
		
		String entradaX = x.getText();
		double valorX = Double.parseDouble(entradaX.replace(',', '.'));
		String entradaY = y.getText();
		double valorY = Double.parseDouble(entradaY.replace(',', '.'));
		String entradaProva = prova.getText();
		double valorProva = Double.parseDouble(entradaProva.replace(',', '.'));
		
		double result = (valorX + valorY+(2*valorProva))/4;
		String resultadoEmTexto = String.format("%.1f", result);
		return resultadoEmTexto;
	}
	
	public String calculaFinalLOGICA(JTextField x, JTextField y, JTextField prova) {
		
		String entradaX = x.getText();
		double valorX = Double.parseDouble(entradaX.replace(',', '.'));
		String entradaY = y.getText();
		double valorY = Double.parseDouble(entradaY.replace(',', '.'));
		String entradaProva = prova.getText();
		double valorProva = Double.parseDouble(entradaProva.replace(',', '.'));
		
		double result = (valorX + valorY+(2*valorProva))/4;
		String resultadoEmTexto = String.format("%.1f", result);
		return resultadoEmTexto;
	}
	
	public String calculaFinalSISTEMA(JTextField x, JTextField y, JTextField prova) {
		
		String entradaX = x.getText();
		double valorX = Double.parseDouble(entradaX.replace(',', '.'));
		String entradaY = y.getText();
		double valorY = Double.parseDouble(entradaY.replace(',', '.'));
		String entradaProva = prova.getText();
		double valorProva = Double.parseDouble(entradaProva.replace(',', '.'));
				
		double result = (valorX + valorY+(2*valorProva))/4;
		String resultadoEmTexto = String.format("%.1f", result);
		return resultadoEmTexto;
	}
	public String calculaFinalTI(JTextField x, JTextField y, JTextField prova) {
		
		String entradaX = x.getText();
		double valorX = Double.parseDouble(entradaX.replace(',', '.'));
		String entradaY = y.getText();
		double valorY = Double.parseDouble(entradaY.replace(',', '.'));
		String entradaProva = prova.getText();
		double valorProva = Double.parseDouble(entradaProva.replace(',', '.'));
				
		double result = (valorX + valorY+(2*valorProva))/4;
		String resultadoEmTexto = String.format("%.1f", result);
		return resultadoEmTexto;
	}
	public String calculaFinalARQUITETURA(JTextField x, JTextField y, JTextField prova) {
		
		String entradaX = x.getText();
		double valorX = Double.parseDouble(entradaX.replace(',', '.'));
		String entradaY = y.getText();
		double valorY = Double.parseDouble(entradaY.replace(',', '.'));
		String entradaProva = prova.getText();
		double valorProva = Double.parseDouble(entradaProva.replace(',', '.'));
		
		double result = (valorX + valorY+(2*valorProva))/4;
		String resultadoEmTexto = String.format("%.1f", result);
		return resultadoEmTexto;
	}
	
	public String calculaNotasSemanais(JTextField x, JTextField y) {	
		if (x.getText().trim().equals("")||y.getText().trim().equals("")) {
			return "404";
		}else {					
			String entradaX = x.getText();
			double valorX = Double.parseDouble(entradaX.replace(',', '.'));
			String entradaY = y.getText();
			double valorY = Double.parseDouble(entradaY.replace(',', '.'));
			resultado = (valorX + valorY)/2;
			resultado = Double.valueOf(String.format(Locale.US, "%.1f", resultado));
			String resultadoEmTexto = ""+resultado;
			return resultadoEmTexto;			
		}
	}
		
	public String calculaNotaTotalIngles(JTextField a1,JTextField a2,JTextField a3,JTextField a4,JTextField a5,
			JTextField a6,JTextField a7,JTextField a8,JTextField a9,JTextField a10) {
		double calc= Double.parseDouble(a1.getText()) + Double.parseDouble(a2.getText())+
		Double.parseDouble(a3.getText())+Double.parseDouble(a4.getText())+Double.parseDouble(a5.getText())+
		Double.parseDouble(a6.getText())+Double.parseDouble(a7.getText())+Double.parseDouble(a8.getText())+
		Double.parseDouble(a9.getText())+Double.parseDouble(a10.getText());
		calc = calc/10;
		String resultadoEmTexto = String.format("%.1f", calc);
		return resultadoEmTexto;
	}
	
	public String calculaNotaTotalMatematica(JTextField a1,JTextField a2,JTextField a3,JTextField a4,JTextField a5,
			JTextField a6,JTextField a7,JTextField a8,JTextField a9,JTextField a10) {
		double calc= Double.parseDouble(a1.getText()) + Double.parseDouble(a2.getText())+
		Double.parseDouble(a3.getText())+Double.parseDouble(a4.getText())+Double.parseDouble(a5.getText())+
		Double.parseDouble(a6.getText())+Double.parseDouble(a7.getText())+Double.parseDouble(a8.getText())+
		Double.parseDouble(a9.getText())+Double.parseDouble(a10.getText());
		calc = calc/10;
		String resultadoEmTexto = String.format("%.1f", calc);
		return resultadoEmTexto;
	}
	
	public String calculaNotaTotalLogica(JTextField a1,JTextField a2,JTextField a3,JTextField a4,JTextField a5,
			JTextField a6,JTextField a7,JTextField a8,JTextField a9) {
		double calc= Double.parseDouble(a1.getText())+Double.parseDouble(a2.getText())+
		Double.parseDouble(a3.getText())+Double.parseDouble(a4.getText())+Double.parseDouble(a5.getText())+
		Double.parseDouble(a6.getText())+Double.parseDouble(a7.getText())+Double.parseDouble(a8.getText())+Double.parseDouble(a9.getText());
		calc = calc/9;
		String resultadoEmTexto = String.format("%.1f", calc);
		return resultadoEmTexto;
	}
	
	public String calculaNotaTotalSO(JTextField a1,JTextField a2,JTextField a3,JTextField a4,JTextField a5,
			JTextField a6,JTextField a7,JTextField a8,JTextField a9) {
		double calc= Double.parseDouble(a1.getText()) + Double.parseDouble(a2.getText())+
		Double.parseDouble(a3.getText())+Double.parseDouble(a4.getText())+Double.parseDouble(a5.getText())+
		Double.parseDouble(a6.getText())+Double.parseDouble(a7.getText())+Double.parseDouble(a8.getText())+Double.parseDouble(a9.getText());
		calc = calc/9;
		String resultadoEmTexto = String.format("%.1f", calc);
		return resultadoEmTexto;
	}

	public String calculaNotaTotalARQUITETURA(JTextField a1,JTextField a2,JTextField a3,JTextField a4,JTextField a5) {
		double calc= Double.parseDouble(a1.getText()) + Double.parseDouble(a2.getText())+
		Double.parseDouble(a3.getText())+Double.parseDouble(a4.getText())+Double.parseDouble(a5.getText());
		calc = calc/5;
		String resultadoEmTexto = String.format("%.1f", calc);
		return resultadoEmTexto;
	}
	
	public String calculaNotaTotalTI(JTextField a1,JTextField a2,JTextField a3,JTextField a4,JTextField a5,
			JTextField a6,JTextField a7,JTextField a8) {
		double calc= Double.parseDouble(a1.getText()) + Double.parseDouble(a2.getText())+
		Double.parseDouble(a3.getText())+Double.parseDouble(a4.getText())+Double.parseDouble(a5.getText())+
		Double.parseDouble(a6.getText())+Double.parseDouble(a7.getText())+Double.parseDouble(a8.getText());
		calc = calc/8;
		String resultadoEmTexto = String.format("%.1f", calc);
		return resultadoEmTexto;
	}
	
	public void selecionaTodoConteudo(JTextField x , JTextField y) {
		y.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent e) {				
				// coloca o foco no componente
		        y.requestFocus();
		        // seleciona todo o conteúdo
		        y.selectAll();
			}
		});
		x.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent e) {					
				// coloca o foco no componente
		        x.requestFocus();
		        // seleciona todo o conteúdo
		        x.selectAll();
			}
		}); 
	}

	public void limparCampos(JPanel container)	{
	    Component components[] = container.getComponents();
	    for (Component component : components){
	        if (component instanceof JTextField){
	            ((JTextField)component).setText("0");
	            ((JTextField)component).setBackground(new Color(255, 255, 255));
	        }
	    }
	}
}
